package services;

import dto.pet.Pet;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

import static io.restassured.RestAssured.given;

public class PetApi {

    public static String BASE_URL = "https://petstore.swagger.io/v2";
    public static String PATH = "/pet";
    private final RequestSpecification spec;

    public PetApi() {
      spec = given()
              .baseUri(BASE_URL)
              .contentType(ContentType.JSON);
    }

    public Response createPet(Pet pet) {

      return given(spec)
              .log().all()
              .body(pet)
              .when()
              .post(PATH);
    }
  }


