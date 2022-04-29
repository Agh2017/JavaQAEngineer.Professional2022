package users;

import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.lessThan;

import dto.users.UserStore;
import dto.users.UserStoreOut;
import io.restassured.module.jsv.JsonSchemaValidator;
import io.restassured.response.Response;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import paramresolver.UserServiceParamResolver;
import services.UserStoreApi;

@ExtendWith({UserServiceParamResolver.class})
public class CreateUserStoreTest {
  private final UserStoreApi userStoreApi;

  public CreateUserStoreTest(UserStoreApi userStoreApi) {
    this.userStoreApi = userStoreApi;
  }

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
            .time(lessThan(6500L))
            .body("type", equalTo("unknown")) // вложенность через точку
            .body(JsonSchemaValidator.matchesJsonSchemaInClasspath("schema/CreateUser.json"));
    // Мачеры hamcrest проверки

    Response response = userStoreApi.createUser(user);
    String actualResult = response.jsonPath().get("message"); //jsonPath() проверки

    Assertions.assertEquals("111", actualResult);

    UserStoreOut user1Out = response.then().extract().as(UserStoreOut.class);
    Assertions.assertEquals("unknown", user1Out.getType());
  }


}
