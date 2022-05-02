package pets;

import static org.hamcrest.Matchers.containsString;
import static org.junit.jupiter.api.Assertions.assertEquals;

import com.github.javafaker.Faker;
import dto.pet.Category;
import dto.pet.NewPet;
import io.restassured.response.Response;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import paramresolver.UserServiceParamResolver;
import services.PetApi;

@ExtendWith({UserServiceParamResolver.class})
class CreatePetNegativeTest {

  private final Faker faker = new Faker();

  /*
  Негативные тест-кейсы по методу создания питомца:
  negativeCreate2RandomPetsWithSomeId - Пытаемся создать 2-х питомцев c одним ID-> проверяем что приходит ошибка при создании 2-го питомца c помощью этого эндпойнта. Найден баг.
  */

  private final PetApi petApi;

  public CreatePetNegativeTest(PetApi petApi) {
    this.petApi = petApi;
  }

  @Test
  void negativeCreate2RandomPetsWithSomeId() {
    String name = faker.cat().name();
    int id = faker.number().numberBetween(1, 99999);
    NewPet cat = NewPet.builder()
            .id(id)
            .name(name)
            .status("reserve")
            .category(new Category("cat", 12))
            .build();

    Response response1 = petApi.createNewPet(cat);
    assertEquals("200", String.valueOf(response1.getStatusCode()), "StatusCode is wrong");

    name = faker.dog().name();
    NewPet dog = NewPet.builder()
            .id(id)
            .name(name)
            .status("free")
            .category(new Category("Dogs", 15))
            .build();

    petApi
            .createNewPet(dog)
            .then()
            .statusCode(200)
            .body(containsString(name));

    assertEquals("404", String.valueOf(response1.getStatusCode()), "StatusCode is wrong");
  }
}
