package store;

import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.lessThan;
import static org.junit.jupiter.api.Assertions.*;
import static utils.Constants.*;

import com.github.javafaker.Faker;
import dto.store.Order;
import io.restassured.response.Response;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import paramresolver.UserServiceParamResolver;
import services.StoreApi;

@ExtendWith({UserServiceParamResolver.class})
class CreateOrderTest {

  private final StoreApi storeApi;
  Faker faker = new Faker();
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
    int id = faker.number().numberBetween(1, 10);
    int petId = faker.number().numberBetween(1, 100000);
    String status = faker.internet().domainWord();
    int quantity = faker.number().numberBetween(1, 15);

    Order order = Order.builder()
            .id(id)
            .petId(petId)
            .status(status)
            .quantity(quantity)
            .build();

    storeApi.createOrder(order)
            .then()
            .log().all()
            .time(lessThan(RESPONSE_TIME.getLongValue()))
            .statusCode(CODE_200.getIntValue())
            .body("status", equalTo(status));

    Response getThisOrder = storeApi.getOrderByNumber(String.valueOf(id));
    assertAll(
        () -> assertEquals(CODE_200.getValue(), (String.valueOf(getThisOrder.getStatusCode())), "Status code is missing"),
        () -> assertEquals(String.valueOf(id), getThisOrder.jsonPath().get("id").toString(), "ID order is missing"),
        () -> assertEquals(String.valueOf(petId), getThisOrder.jsonPath().get("petId").toString(), "PetId is missing"),
        () -> assertEquals(status, getThisOrder.jsonPath().get("status"), "Status is missing"),
        () -> assertEquals(String.valueOf(quantity), getThisOrder.jsonPath().get("quantity").toString(), "Quantity is missing")
    );

    Response deleteResponse = storeApi.deleteOrder(String.valueOf(id));
    assertEquals(CODE_200.getIntValue(), deleteResponse.getStatusCode(), "delete order error");

    Response getOrder = storeApi.getOrderByNumber(String.valueOf(id));
    assertAll(
        () -> assertEquals(CODE_404.getValue(), (String.valueOf(getOrder.getStatusCode())), "Status code is missing"),
        () -> assertEquals("1", getOrder.jsonPath().get("code").toString(), "Code is missing"),
        () -> assertEquals("unknown", getOrder.jsonPath().get("type"), "Type is missing"),
        () -> assertEquals("Order not found", getOrder.jsonPath().get("message"), "Message is missing")
    );
  }

  @AfterEach
  void tearDown() {
    System.out.println("=== Ордер и так уже удален ===");
  }
}
