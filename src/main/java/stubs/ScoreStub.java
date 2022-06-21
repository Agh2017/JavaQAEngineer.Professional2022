package stubs;

import static com.github.tomakehurst.wiremock.client.WireMock.*;
import static com.github.tomakehurst.wiremock.client.WireMock.aResponse;

import data.User;
import java.util.*;

public class ScoreStub {

  private String basePath = "/user/get/";

  {
    registerStubScore();
  }

  private void registerStubScore() {
    LinkedList<User> listScore = new LinkedList<>();
    listScore.add(new User("Test user Petroff", 78, "00001"));
    listScore.add(new User("Test user Ivanov", 44, "00002"));

    for (User userScope : listScore) {
      Map<String, String> map = new HashMap<>();

      map.put("name", userScope.getName());
      map.put("scope", String.valueOf(userScope.getScope()));
      String newBasePath = basePath + userScope.getId();

      stubFor(get(urlEqualTo(String.format("%s", newBasePath)))
              .willReturn(aResponse()
                      .withBody(userScope.toString())
                      .withStatus(200)));
    }
  }

}

