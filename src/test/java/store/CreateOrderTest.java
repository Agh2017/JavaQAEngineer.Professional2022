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
  Тест-кейсы по методу создания заказа:
   createOrderAndDelete
  - Создаем ордер -> проверяем через "Find purchase order by ID", что ордер создан.
  - Удаляем ордер и проверяем через "Find purchase order by ID", что ордер удален.
  */

  CreateOrderTest(StoreApi storeApi) {
    this.storeApi = storeApi;
  }

  @Test
  void createOrderAndDelete() {
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

    //TODO
  }
}
