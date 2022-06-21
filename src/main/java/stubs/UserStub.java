package stubs;

import static com.github.tomakehurst.wiremock.client.WireMock.*;
import static com.github.tomakehurst.wiremock.client.WireMock.aResponse;

import java.util.HashMap;
import java.util.Map;


public class UserStub {

  private final String basePath = "/hello";

  {
    registerStubHello();
  }

  private void registerStubHello() {
    Map<String, String> map = new HashMap<>();
    map.put("name", "Sasha");
    map.put("age", "10");

    stubFor(get(urlEqualTo(String.format("%s", basePath)))
            .willReturn(aResponse()
                    .withBody("Hello")
                    .withStatus(200)));
  }

}
