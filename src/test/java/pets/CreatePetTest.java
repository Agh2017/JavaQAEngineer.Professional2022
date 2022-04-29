package pets;

import static org.hamcrest.Matchers.containsString;
import static org.junit.jupiter.api.Assertions.assertEquals;

import com.github.javafaker.Faker;
import dto.pet.Category;
import dto.pet.Pet;
import io.restassured.response.Response;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import paramresolver.UserServiceParamResolver;
import services.PetApi;

@ExtendWith({UserServiceParamResolver.class})
class CreatePetTest {

  private final Faker faker = new Faker();

  /*
  Спецификация "RequestSpecification" использована в сервисе "PetApi".

  Тест-кейсы по методу создания питомца:

  1. Создать кота и проверить его id
  2. Создать собаку и таким образом проверить, что можно создать нескольких животных
  3. Создать еще одну собаку и таким образом проверить, что можно создать нескольких животных в одной категории.
   */


  private final PetApi petApi;

  public CreatePetTest(PetApi petApi) {
    this.petApi = petApi;
  }

  @Test
  void createRandomPet() {
    String name = faker.cat().name();
    int id = createRandomId();
    Pet pet = Pet.builder()
            .id(id)
            .name(name)
            .status("reserve")
            .category(new Category("cat", 12))
            .build();

    Response response = petApi.createPet(pet);
    Integer responseId = response.jsonPath().get("id");
    assertEquals(id, responseId, () -> "id is wrong");
  }

  @Test
  void createPet2() {

    String name = faker.dog().name();
    Pet pet2 = Pet.builder()
            .id(createRandomId())
            .name(name)
            .status("free")
            .category(new Category("Dogs", 15))
            .build();

    petApi
            .createPet(pet2)
            .then()
            .statusCode(200)
            .body(containsString(name));
  }

  @Test
  void createPetInOneCategory() {

    Pet pet2 = Pet.builder()
            .id(createRandomId())
            .name(faker.animal().name())
            .status("free")
            .category(new Category("Dogs", 15))
            .build();

    Response response = petApi.createPet(pet2);
    String responseId = response.jsonPath().get("category.name");
    assertEquals("Dogs", responseId);
  }

  private int createRandomId() {
    return faker.number().numberBetween(1, 99999);
  }
}
