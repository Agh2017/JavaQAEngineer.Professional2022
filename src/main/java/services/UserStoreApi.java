package services;

import static io.restassured.RestAssured.given;

import dto.users.UserStore;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.apache.commons.lang3.StringUtils;

public class UserStoreApi {

  public final static String PATH = "/user";
  private final RequestSpecification spec;

  private static String getBaseUrl() {
    return StringUtils.stripEnd(System.getProperty("rest.base.url"), "/");
  }

  public UserStoreApi() {
    spec = given()
            .baseUri(getBaseUrl())
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
