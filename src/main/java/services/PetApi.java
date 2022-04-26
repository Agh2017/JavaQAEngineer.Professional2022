package services;

import static io.restassured.RestAssured.given;

import dto.pet.Pet;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.apache.commons.lang3.StringUtils;

public class PetApi {

  public final static String PATH = "pet";
  private final RequestSpecification spec;

  //TODO вынести в абстрактный класс
  private static String getBaseUrl() {
    return StringUtils.stripEnd(System.getProperty("rest.base.url"), "/");
  }

  public PetApi() {
    spec = given()
            .baseUri(getBaseUrl())
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


