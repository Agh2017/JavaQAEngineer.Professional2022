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
import restassured.services.StoreApi;
import utils.Constants;

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
            .body(PARAMETER_MESSAGE.getValue(), equalTo(EXPECTED_NOT_FOUND.getValue()));

    Response response = storeApi.deleteOrder(numberOrder);

    //часто приходят неправильные ответы типа: Order Not found и т.п.

    assertAll(
        () -> assertEquals(CODE_404.getValue(), (String.valueOf(response.getStatusCode())), Constants.SERVER_MESSAGE.getValue()),
        () -> assertEquals(CODE_404.getValue(), response.jsonPath().get(PARAMETER_CODE.getValue()).toString(), Constants.SERVER_MESSAGE.getValue()),
        () -> assertEquals(EXPECTED_TYPE_DELETE, response.jsonPath().get(PARAMETER_TYPE.getValue()), RESPONSE_PARAMETER_TYPE.getValue()),
        () -> assertEquals(EXPECTED_NOT_FOUND.getValue(), response.jsonPath().get(PARAMETER_MESSAGE.getValue()), RESPONSE_PARAMETER_MESSAGE.getValue())
    );
    System.out.println(PARAMETER_CODE.getValue());
  }

  @AfterEach
  void tearDown() {
    System.out.println("=== Удалять нечего ===");
  }
}

