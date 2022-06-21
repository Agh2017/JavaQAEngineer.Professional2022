package restassured.services;

import static io.restassured.RestAssured.given;

import io.restassured.http.ContentType;
import io.restassured.specification.RequestSpecification;
import lombok.Getter;
import org.apache.commons.lang3.StringUtils;

public abstract class BaseApi {

  @Getter
  private final RequestSpecification spec;

  private static String getBaseUrl() {
    return StringUtils.stripEnd(System.getProperty("rest.base.url"), "/");
  }

  public BaseApi() {
    spec = given()
            .baseUri(getBaseUrl())
            .contentType(ContentType.JSON);
  }

  protected enum EndPoints  {
    PATH_PET(System.getProperty("rest.pet.url")),
    PATH_STORE(System.getProperty("rest.store.url")),
    PATH_USER_STORE(System.getProperty("rest.user.store.url"));

    @Getter
    private final String value;

    EndPoints(String value) {
      this.value = value;
    }
  }
}
