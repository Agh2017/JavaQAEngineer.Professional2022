package User.CreateUser;

import dto.Category;
import dto.Pet;
import io.restassured.module.jsv.JsonSchemaValidator;
import io.restassured.response.Response;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import services.PetApi;

import static org.hamcrest.Matchers.containsString;
import static org.hamcrest.Matchers.equalTo;

public class CreatePet {

  /*

  Спецификация "RequestSpecification" использована в сервисе "PetApi".

  Тест-кейсы по методу создания питомца:

  1. Создать кота с кличкой "Vasya" с id = 001 и проверить его id
  2. Создать собаку с кличкой "Masya" и таким образом проверить, что можно создать нескольких животных
  3. Создать собаку с кличкой "Alii" и таким образом проверить, что можно создать нескольких животных в одной категории.

   */


  PetApi petApi = new PetApi();

  @Test
  public void createPet1(){

    Pet pet = Pet.builder()
            .id(001)
            .name("Vasya")
            .status("owner")
            .category(new Category("Cats", 12))
            .build();

    Response response = petApi.createPet(pet);
    Integer responseId = response.jsonPath().get("id");
    Assertions.assertEquals(1, responseId);
  }

  @Test
  public void createPet2(){

    Pet pet2 = Pet.builder()
            .id(002)
            .name("Masya")
            .status("free")
            .category(new Category("Dogs", 15))
            .build();

    petApi.createPet(pet2).then().statusCode(200)
            .body(containsString("Masya"));
  }
  @Test
  public void createPetInOneCategory(){

    Pet pet2 = Pet.builder()
            .id(003)
            .name("Alii")
            .status("free")
            .category(new Category("Dogs", 15))
            .build();

    Response response = petApi.createPet(pet2);
    String responseId = response.jsonPath().get("category.name");
    Assertions.assertEquals("Dogs", responseId);
  }
}
