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
class CreatePetNegativeTest {

    private final Faker faker = new Faker();

  /*
  Спецификация "RequestSpecification" использована в сервисе "PetApi".
  Тест-кейсы по методу создания питомца:
  - Создаем 2-х питомцев c одним ID-> проверяем что нельзя создать еще одного ( или изменить) питомца с одинаковым ID
  c помощью этого эндпойнта
  */


    private final PetApi petApi;

    public CreatePetNegativeTest(PetApi petApi) {
        this.petApi = petApi;
    }


    @Test
    void create2RandomPets() {
        String name = faker.cat().name();
        int id = faker.number().numberBetween(1, 99999);
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
}
