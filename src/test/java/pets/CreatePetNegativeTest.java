package pets;

import static org.hamcrest.Matchers.containsString;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static utils.Constants.*;

import com.github.javafaker.Faker;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.parallel.Execution;
import org.junit.jupiter.api.parallel.ExecutionMode;
import restassured.dto.pet.Category;
import restassured.dto.pet.NewPet;
import io.restassured.response.Response;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import paramresolver.UserServiceParamResolver;
import restassured.services.PetApi;
import runner.RunnerParallelTests;

@Execution(ExecutionMode.CONCURRENT)
@TestInstance(TestInstance.Lifecycle.PER_CLASS)
@ExtendWith({UserServiceParamResolver.class})
class CreatePetNegativeTest extends RunnerParallelTests {

  private final Faker faker = new Faker();

  /*
  Негативные тест-кейсы по методу создания питомца:
  negativeCreate2RandomPetsWithSomeId
  - Пытаемся создать 2-х питомцев c одним ID.
  - Проверяем что приходит ошибка при создании 2-го питомца c помощью этого эндпойнта.
  */

  private final PetApi petApi;
  private int id;

  public CreatePetNegativeTest(PetApi petApi) {
    this.petApi = petApi;
  }

  @Test
  void negativeCreate2RandomPetsWithSomeId() {
    String name = String.format("testName-%S",  faker.cat().name());
    id = faker.number().numberBetween(1, 99999);
    NewPet cat = NewPet.builder()
            .id(id)
            .name(name)
            .status(PARAMETER_STATUS_RESERVE.getValue())
            .category(new Category(CATEGORY_CATS.getValue(), 12))
            .build();

    Response response1 = petApi.createNewPet(cat);
    assertEquals(CODE_200.getValue(), String.valueOf(response1.getStatusCode()), "StatusCode is wrong");

    name = String.format("testName-%S",  faker.dog().name());
    NewPet dog = NewPet.builder()
            .id(id)
            .name(name)
            .status(PARAMETER_STATUS_FREE.getValue())
            .category(new Category(CATEGORY_DOGS.getValue(), 15))
            .build();

    petApi
            .createNewPet(dog)
            .then()
            .statusCode(CODE_200.getIntValue())
            .body(containsString(name));
    assertEquals(CODE_404.getValue(), String.valueOf(response1.getStatusCode()), "StatusCode is wrong");
  }

  @AfterEach
  void tearDownTests() {
    petApi.deletePetFromBase(id);
    System.out.println("=== Питомец удален ===");
  }
}
