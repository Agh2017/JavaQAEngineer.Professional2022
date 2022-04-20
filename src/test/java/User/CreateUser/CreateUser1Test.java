package User.CreateUser;

import dto.User1;
import dto.User1Out;
import io.restassured.internal.common.assertion.Assertion;
import io.restassured.response.Response;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import services.UserApi1;

import static org.hamcrest.Matchers.equalTo;

public class CreateUser1Test {
  UserApi1 userApi1 = new UserApi1();

  @Test
  public void checkCreateUser() {

    User1 user = User1.builder()
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

    userApi1.createUser(user)
            .then()
            .log().all()
            .statusCode(200)
            .body("type", equalTo("unknown")); // вложенность через точку
    // Мачеры hamcrest проверки

    Response response = userApi1.createUser(user);
    String actualResult = response.jsonPath().get("message"); //jsonPath() проверки

    Assertions.assertEquals("111", actualResult);

    User1Out user1Out = response.then().extract().as(User1Out.class);
    Assertions.assertEquals ("unknown", user1Out.getType());
  }


}
