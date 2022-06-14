package testsHelpers;

import com.consol.citrus.annotations.CitrusTest;
import com.consol.citrus.context.TestContext;
import com.consol.citrus.dsl.testng.TestNGCitrusTestRunner;
import com.consol.citrus.message.MessageType;
import org.springframework.http.HttpStatus;
import org.testng.annotations.Test;
import pojo.http.Data;
import pojo.http.Support;
import pojo.http.User;

public class TestHelperHTTP extends TestNGCitrusTestRunner {
    private TestContext context;


    @Test(description = "Получение информации о пользователе", enabled=true)
    @CitrusTest
    public void getTestActions() {
        this.context = citrus.createTestContext();

        http(httpActionBuilder -> httpActionBuilder
        .client("httpHelperClient")
        .send()
        .get("users/${userId}"));

        http(httpActionBuilder -> httpActionBuilder
        .client("httpHelperClient")
        .receive()
        .response(HttpStatus.OK)
        .messageType(MessageType.JSON)
        .payload(getJsonData(), "objectMapper"));
    }

    @Test(testName = "Регистрация нового пользователя")
    @CitrusTest
    public void RegisterNewUserSuccess(){
        http(httpActionBuilder -> httpActionBuilder
                .client("httpHelperClient")
                .send()
                .post("register")
                .payload("{\n" +
                        "    \"email\": \"eve.holt@reqres.in\",\n" +
                        "    \"password\": \"pistol\"\n" +
                        "}")
        );

        http(httpActionBuilder -> httpActionBuilder
                .client("httpHelperClient")
                .receive()
                .response(HttpStatus.valueOf(200))
                .messageType(MessageType.JSON)
        );
    }


    @Test(testName = "Негативный кейс. Регистрация нового пользователя")
    @CitrusTest
    public void postRegisterSuccessful(){
        http(httpActionBuilder -> httpActionBuilder
                .client("httpHelperClient")
                .send()
                .post("register")
                .payload("{\n" +
                        "    \"email\": \"test.mail@reqres.in\",\n" +
                        "    \"password\": \"ghost123\"\n" +
                        "}")
        );

        http(httpActionBuilder -> httpActionBuilder
                .client("httpHelperClient")
                .receive()
                .response(HttpStatus.valueOf(400))
                .messageType(MessageType.JSON)
        );
    }

    public User getJsonData() {
        User user = new User();

        Data data = new Data();
        data.setId(Integer.valueOf(context.getVariable("userId")));
        data.setEmail("janet.weaver@reqres.in");
        data.setFirstName("Janet");
        data.setLastName("Weaver");
        data.setAvatar("https://reqres.in/img/faces/2-image.jpg");
        user.setData(data);

        Support support = new Support();
        support.setUrl("https://reqres.in/#support-heading");
        support.setText("To keep ReqRes free, contributions towards server costs are appreciated!");

        user.setSupport(support);

        return user;

    }



}
