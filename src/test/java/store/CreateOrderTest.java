package store;

import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.lessThan;

import dto.store.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import paramresolver.UserServiceParamResolver;
import services.StoreApi;

@ExtendWith({UserServiceParamResolver.class})
class CreateOrderTest {

  private final StoreApi storeApi;
  /*
     Тест-кейсы по методу создания/удаления заказа:

  1. Создать заказ и проверить что статус заказа "placed"
  2. Проверить что можно создать несколько заказов
  3. Удалить заказ 2, проверить значение параметра "message"
  4. Попробовать удалить заказ 2 снова, проверить что заказ 2 не найден (параметр "message")
   */
  CreateOrderTest(StoreApi storeApi) {
    this.storeApi = storeApi;
  }

  @Test
  void createOrder() {
    Order order = Order.builder()
            .id(1)
            .petId(15)
            .status("free")
            .quantity(1)
            .build();

    storeApi.createOrder(order)
            .then()
            .log().all()
            .time(lessThan(6500L))
            .statusCode(200)
            .body("status", equalTo("free"));

  }

  @Test
  void createOrder2() {

    Order order = Order.builder()
            .id(2)
            .status("placed")
            .quantity(2)
            .petId(12)
            .complete(true)
            .build();

    storeApi.createOrder(order)
            .then()
            .log().all()
            .time(lessThan(6500L))
            .statusCode(200)
            .body("status", equalTo("placed"));

  }

  @Test
  void deleteOrder2() {

    storeApi.deleteOrder()
            .then()
            .log().all()
            .time(lessThan(6500L))
            .statusCode(200)
            .body("message", equalTo("2"));

  }

  @Test
  void isDeleted() {

    storeApi.deleteOrder()
            .then()
            .log().all()
            .time(lessThan(5000L))
            .statusCode(404)
            .body("message", equalTo("Order Not Found"));

  }

}
