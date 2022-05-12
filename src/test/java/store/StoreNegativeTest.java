package store;

import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.lessThan;
import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static utils.Constants.*;


import com.github.javafaker.Faker;
import io.restassured.response.Response;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import paramresolver.UserServiceParamResolver;
import services.StoreApi;

@ExtendWith({UserServiceParamResolver.class})
class StoreNegativeTest {

  private final StoreApi storeApi;
  private final String numberOrder = String.valueOf(new Faker().number().numberBetween(0, 2147483647));

  StoreNegativeTest(StoreApi storeApi) {
    this.storeApi = storeApi;
  }

  /*
  Негативные тест-кейсы по методу создания заказа:
  checkUnableDeleteOrderMissing:
  - убеждаемся что ордера с рандомным id не существует;
  - удаляем ордер с таким же id (ордера которого нет в стор);
  - проверяем, что приходит ошибка и проверяем эту ошибку.
   */

  @Test
  void checkUnableDeleteOrderMissing() {

    storeApi.getOrderByNumber(numberOrder)
            .then()
            .log().all()
            .time(lessThan(RESPONSE_TIME.getLongValue()))
            .statusCode(CODE_200.getIntValue())
            .body("message", equalTo(EXPECTED_NOT_FOUND.getValue()));

    Response response = storeApi.deleteOrder(numberOrder);

    //часто приходят неправильные ответы типа: Order Not found и т.п.

    assertAll(
        () -> assertEquals(CODE_404.getValue(), (String.valueOf(response.getStatusCode())), "Status code is missing"),
        () -> assertEquals(CODE_404.getValue(), response.jsonPath().get("code").toString(), "Code is missing"),
        () -> assertEquals(EXPECTED_TYPE_DELETE, response.jsonPath().get("type"), "Type is missing"),
        () -> assertEquals(EXPECTED_NOT_FOUND.getValue(), response.jsonPath().get("message"), "Message is missing")
    );
  }

  @AfterEach
  void tearDown() {
    System.out.println("=== Удалять нечего ===");
  }
}

