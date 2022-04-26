package services;

import static io.restassured.RestAssured.given;

import dto.pet.Pet;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class PetApi {

  public final static String BASE_URL = "https://petstore.swagger.io/v2";
  public final static String PATH = "/pet";
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


