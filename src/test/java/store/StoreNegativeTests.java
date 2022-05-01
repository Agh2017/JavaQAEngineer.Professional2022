package store;

import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.lessThan;
import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;

import com.github.javafaker.Faker;
import io.restassured.response.Response;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import paramresolver.UserServiceParamResolver;
import services.StoreApi;

@ExtendWith({UserServiceParamResolver.class})
class StoreNegativeTests {

  private final StoreApi storeApi;
  private final String numberOrder = String.valueOf(new Faker().number().numberBetween(0, 2147483647));

  StoreNegativeTests(StoreApi storeApi) {
    this.storeApi = storeApi;
  }

  /*
  - убеждаемся что ордера с рандомным id не существует
  - удаляем ордер с таким же id (ордера которого нет в стор)
  - проверяем, что приходит ошибка и проверяем эту ошибку
   */

  @Test
  void checkUnableDeleteOrderMissing() {

    storeApi.getOrderByNumber(numberOrder)
            .then()
            .log().all()
            .time(lessThan(6500L))
            .statusCode(404)
            .body("message", equalTo("Order not found"));

    Response response = storeApi.deleteOrder(numberOrder);

    //часто приходят неправильные ответы типа: Order Not found и т.п.

    assertAll(
            () -> assertEquals("404",(String.valueOf(response.getStatusCode())),"Status code is missing"),
        () -> assertEquals("404",response.jsonPath().get("code").toString(), "Code is missing"),
        () -> assertEquals("unknown", response.jsonPath().get("type"), "Type is missing"),
        () -> assertEquals("Order not found", response.jsonPath().get("message"), "Message is missing")
    );
  }
}

