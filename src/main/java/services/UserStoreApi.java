package services;

import static services.BaseApi.EndPoints.PATH_USER_STORE;
import static io.restassured.RestAssured.given;

import dto.users.UserStore;
import io.restassured.response.Response;

public class UserStoreApi extends BaseApi{

  public Response createUser(UserStore user) {

    return given(getSpec())
            .log().all()
            .body(user)
            .when()
            .post(PATH_USER_STORE.getValue());
  }
}
