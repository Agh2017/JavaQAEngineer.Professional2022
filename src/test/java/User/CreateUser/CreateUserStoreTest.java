package User.CreateUser;

import dto.users.UserStore;
import dto.users.UserStoreOut;
import io.restassured.module.jsv.JsonSchemaValidator;
import io.restassured.response.Response;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import services.UserStoreApi;

import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.lessThan;

public class CreateUserStoreTest {
  UserStoreApi userStoreApi = new UserStoreApi();

  @Test
  public void checkCreateUserStore() {

    UserStore user = UserStore.builder()
            .userStatus(50555)
            .lastName("last name"
            )
            .id(111)
            .email("string")
            .password("")
            .firstName("string")
            .username("string")
            .phone("string")
            .build();

    userStoreApi.createUser(user)
            .then()
            .log().all()
            .statusCode(200)
            .time(lessThan(5000L))
            .body("type", equalTo("unknown")) // вложенность через точку
            .body(JsonSchemaValidator.matchesJsonSchemaInClasspath("schema/CreateUser.json"));
    // Мачеры hamcrest проверки

    Response response = userStoreApi.createUser(user);
    String actualResult = response.jsonPath().get("message"); //jsonPath() проверки

    Assertions.assertEquals("111", actualResult);

    UserStoreOut user1Out = response.then().extract().as(UserStoreOut.class);
    Assertions.assertEquals ("unknown", user1Out.getType());
  }


}
