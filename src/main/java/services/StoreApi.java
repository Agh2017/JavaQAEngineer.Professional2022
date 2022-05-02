package services;

import static services.BaseApi.EndPoints.PATH_STORE;
import static io.restassured.RestAssured.given;

import dto.store.Order;
import io.restassured.response.Response;

public class StoreApi extends BaseApi {

  public Response createOrder(Order order) {

    return given(getSpec())
            .log().all()
            .body(order)
            .when()
            .post(PATH_STORE.getValue());
  }

  public Response deleteOrder(String number) {

    return given(getSpec())
            .log().all()
            .when()
            .delete(PATH_STORE.getValue() + "/" + number);
  }

  public Response getOrderByNumber(String number) {

    return given(getSpec())
            .log().all()
            .when()
            .get(PATH_STORE.getValue() + "/" + number);
  }
}