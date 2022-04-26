package services;

import static io.restassured.RestAssured.given;

import dto.users.UserStore;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class UserStoreApi {

  public final static String BASE_URL = "https://petstore.swagger.io/v2";
  public final static String PATH = "/user";
  private final RequestSpecification spec;

  public UserStoreApi() {
    spec = given()
            .baseUri(BASE_URL)
            .contentType(ContentType.JSON);
  }

  public Response createUser(UserStore user) {

    return given(spec)
            .log().all()
            .body(user)
            .when()
            .post(PATH);
  }
}
