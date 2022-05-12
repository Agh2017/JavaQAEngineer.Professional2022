package services;

import static io.restassured.RestAssured.given;
import static services.BaseApi.EndPoints.PATH_PET;

import dto.pet.NewPet;
import io.restassured.response.Response;
import paramresolver.ApiClass;

public class PetApi extends BaseApi{

  public Response createNewPet(NewPet pet) {

    return given(getSpec())
            .log().all()
            .body(pet)
            .when()
            .post(PATH_PET.getValue());
  }

  public Response getPetFromBase(int id) {

    return given(getSpec())
            .log().all()
            .when()
            .get(PATH_PET.getValue()+"/" + id);
  }

  public Response deletePetFromBase(int id) {

    return given(getSpec())
            .log().all()
            .when()
            .delete(PATH_PET.getValue()+"/" + id);
  }

}


