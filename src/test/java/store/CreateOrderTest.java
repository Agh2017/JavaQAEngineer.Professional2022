package store;

import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.lessThan;
import static org.junit.jupiter.api.Assertions.*;
import static utils.Constants.*;

import com.github.javafaker.Faker;
import restassured.dto.store.Order;
import io.restassured.response.Response;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import paramresolver.UserServiceParamResolver;
import restassured.services.StoreApi;

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
            .body(PARAMETER_STATUS.getValue(), equalTo(status));

    Response getThisOrder = storeApi.getOrderByNumber(String.valueOf(id));
    assertAll(
        () -> assertEquals(CODE_200.getValue(), (String.valueOf(getThisOrder.getStatusCode())), "Status code is missing"),
        () -> assertEquals(String.valueOf(id), getThisOrder.jsonPath().get(PARAMETER_ID.getValue()).toString(), "ID order is missing"),
        () -> assertEquals(String.valueOf(petId), getThisOrder.jsonPath().get(PARAMETER_PET_ID.getValue()).toString(), "PetId is missing"),
        () -> assertEquals(status, getThisOrder.jsonPath().get(PARAMETER_STATUS.getValue()), "Status is missing"),
        () -> assertEquals(String.valueOf(quantity), getThisOrder.jsonPath().get(PARAMETER_QUANTITY.getValue()).toString(), "Quantity is missing")
    );

    Response deleteResponse = storeApi.deleteOrder(String.valueOf(id));
    assertEquals(CODE_200.getIntValue(), deleteResponse.getStatusCode(), "delete order error");

    Response getOrder = storeApi.getOrderByNumber(String.valueOf(id));
    assertAll(
        () -> assertEquals(CODE_404.getValue(), (String.valueOf(getOrder.getStatusCode())), "Status code is missing"),
        () -> assertEquals(EXPECTED_TYPE_CODE.getValue(), getOrder.jsonPath().get(PARAMETER_CODE.getValue()).toString(), "Code is missing"),
        () -> assertEquals(EXPECTED_TYPE_DELETE.getValue(), getOrder.jsonPath().get(PARAMETER_TYPE.getValue()), "Type is missing"),
        () -> assertEquals(EXPECTED_NOT_FOUND, getOrder.jsonPath().get(PARAMETER_MESSAGE.getValue()), "Message is missing")
    );
  }

  @AfterEach
  void tearDown() {
    System.out.println("=== Ордер и так уже удален ===");
  }
}
