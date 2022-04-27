package services;

import static io.restassured.RestAssured.given;
import static services.BaseApi.EndPoints.PATH_PET;

import dto.pet.Pet;
import io.restassured.response.Response;

public class PetApi extends BaseApi{

  public Response createPet(Pet pet) {

    return given(getSpec())
            .log().all()
            .body(pet)
            .when()
            .post(PATH_PET.getValue());
  }
}


