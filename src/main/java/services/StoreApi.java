package services;

import dto.store.Order;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

import static io.restassured.RestAssured.given;

public class StoreApi {

    public static String BASE_URL = "https://petstore.swagger.io/v2";
    public static String PATH1 = "/store/order";
    public static String PATH2 = "/store/order/2";
    private final RequestSpecification spec;

    public StoreApi() {
        spec = given()
                .baseUri(BASE_URL)
                .contentType(ContentType.JSON);
    }

    public Response createOrder(Order order) {

        return given(spec)
                .log().all()
                .body(order)
                .when()
                .post(PATH1);
    }

    public Response deleteOrder() {

        return given(spec)
                .log().all()
                .when()
                .delete(PATH2);
    }
}