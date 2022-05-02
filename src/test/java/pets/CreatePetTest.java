package pets;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;

import com.github.javafaker.Faker;
import dto.pet.Category;
import dto.pet.NewPet;
import io.restassured.response.Response;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import paramresolver.UserServiceParamResolver;
import services.PetApi;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

@ExtendWith({UserServiceParamResolver.class})
class CreatePetTest {

  private final Faker faker = new Faker();
  private final PetApi petApi;
  private final List<Integer> listId = new ArrayList<>();
  /*
  Тест-кейсы по методу создания питомца:
  create2RandomPets - Создаем 2-х питомцев в разной категории -> проверяем через  API правильность нескольких полей в полученных ответах.
  create3PetInOneCategory - Создаем 3-х питомцев в одной категории -> проверяем через API, что питомцы есть в базе и создались правильно.
  */

  public CreatePetTest(PetApi petApi) {
    this.petApi = petApi;
  }

  @Test
  void create2RandomPets() {
    String name1 = faker.cat().name();
    listId.add(faker.number().numberBetween(1, 99999));
    NewPet cat = NewPet.builder()
            .id(listId.get(0))
            .name(name1)
            .category(new Category("cat", 12))
            .build();

    Response response1 = petApi.createNewPet(cat);
    assertAll(
        () -> assertEquals("200", (String.valueOf(response1.getStatusCode())), "Status code is missing"),
        () -> assertEquals(name1, response1.jsonPath().get("name").toString(), "Name is missing"),
        () -> assertEquals(String.valueOf(listId.get(0)), response1.jsonPath().get("id").toString(), "Id is missing")
    );

    listId.add(listId.get(0)+1);
    int id = listId.get(listId.size()-1);
    String name2 = faker.dog().name();
    NewPet dog = NewPet.builder()
            .id(id)
            .name(name2)
            .category(new Category("Dogs", 15))
            .build();

    Response response2 = petApi.createNewPet(dog);
    assertAll(
        () -> assertEquals("200", (String.valueOf(response2.getStatusCode())), "Status code is missing"),
        () -> assertEquals(name2, response2.jsonPath().get("name").toString(), "Name is missing"),
        () -> assertEquals(String.valueOf(id), response2.jsonPath().get("id").toString(), "Id is missing")
    );
  }

  @Test
  void create3PetInOneCategory() {
    List<NewPet> petList = new ArrayList<>();

    IntStream.range(0, 3).forEach(i -> {
      listId.add(faker.number().numberBetween(10, 10000));
      String name = faker.animal().name();
      NewPet dog = NewPet.builder()
              .id(listId.get(listId.size()-1))
              .name(name)
              .status("free")
              .category(new Category("Dogs", 15))
              .build();
      petList.add(i, dog);
      petApi.createNewPet(dog);
    });

    IntStream.range(0, 3).forEach(i -> {

      NewPet currentPet = petList.get(i);
      int expectedId = currentPet.getId();
      String expectedName = currentPet.getName();
      String expectedCategory = currentPet.getCategory().getName();
      String expectedStatus = currentPet.getStatus();

      Response response = petApi.getPetFromBase(expectedId);
      assertAll(
          () -> assertEquals("200", (String.valueOf(response.getStatusCode())), "Status code is missing"),
          () -> assertEquals(expectedName, response.jsonPath().get("name").toString(), "Name is missing"),
          () -> assertEquals(expectedCategory, response.jsonPath().get("category.name").toString(), "Category is missing"),
          () -> assertEquals(expectedStatus, response.jsonPath().get("status"), "Status is missing")
      );
    });
  }

  @AfterEach
  void tearDown() {
    for (Integer integer : listId) {
      petApi.deletePetFromBase(integer);
    }
    System.out.println("=== Питомцы удалены ===");
  }
}
