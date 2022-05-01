package store;

import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.lessThan;

import com.github.javafaker.Faker;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import paramresolver.UserServiceParamResolver;
import services.StoreApi;

@ExtendWith({UserServiceParamResolver.class})
class StoreNegativeTests {

  private final StoreApi storeApi;
  private String numberOrder = String.valueOf(new Faker().number().numberBetween(0, 2147483647));

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

    storeApi.deleteOrder(numberOrder)
            .then()
            .log().all()
            .time(lessThan(6500L))
            .statusCode(404)
            .body("message", equalTo( "Order not found"));

    //часто приходят неправильные ответы типа: Order Not Found и т.п.
    //TODO распарсить объект и проверить ошибку
  }

}

