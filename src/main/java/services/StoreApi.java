package services;

import static services.BaseApi.EndPoints.PATH_STORE;
import static io.restassured.RestAssured.given;

import dto.store.Order;
import io.restassured.response.Response;

public class StoreApi extends BaseApi{

  public Response createOrder(Order order) {

    return given(getSpec())
            .log().all()
            .body(order)
            .when()
            .post(PATH_STORE.getValue());
  }

  //TODO прокинуть номер заказа
  public Response deleteOrder() {

    return given(getSpec())
            .log().all()
            .when()
            .delete(PATH_STORE.getValue()+"/2");
  }
}