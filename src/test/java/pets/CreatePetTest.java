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
  - Создаем 2-х питомцев в разной категории -> проверяем через апишку, что ордеры создались (не поля проверяем, а делаем вызов метода апи listOrders и проверяем, что в списке ордеров есть нужные нам ордера)
  - Создаем 2-х питомцев в одной категории -> проверяем через апишку, что ордеры создались
  */


  private final PetApi petApi;

  public CreatePetTest(PetApi petApi) {
    this.petApi = petApi;
  }

  @Test
  void create2RandomPets() {
    String name = faker.cat().name();
    int id = createRandomId();
    Pet cat = Pet.builder()
            .id(id)
            .name(name)
            .status("reserve")
            .category(new Category("cat", 12))
            .build();

    Response response1 = petApi.createPet(cat);
    assertEquals("200", String.valueOf(response1.getStatusCode()), "StatusCode is wrong");

    name = faker.dog().name();
    Pet dog = Pet.builder()
            .id(id)
            .name(name)
            .status("free")
            .category(new Category("Dogs", 15))
            .build();

    petApi
            .createPet(dog)
            .then()
            .statusCode(200)
            .body(containsString(name));
    //TODO сделать проверки
  }

  @Test
  void create2PetInOneCategory() {

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
