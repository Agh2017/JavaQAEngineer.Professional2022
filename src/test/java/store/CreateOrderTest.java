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
}
