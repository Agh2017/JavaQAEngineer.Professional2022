package services;

import dto.User1;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

import static io.restassured.RestAssured.given;

public class UserApi1 {

    public static String BASE_URL = "https://petstore.swagger.io/v2";
    public static String PATH = "/user";

    private RequestSpecification spec;

    public Response createUser(User1 user){

        given()
                .baseUri(BASE_URL)
                .contentType(ContentType.JSON)
                .body(user)
                .when()
                .post(PATH);
        return null;
    }

}
