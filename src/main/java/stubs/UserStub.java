package stubs;

import com.github.tomakehurst.wiremock.junit.WireMockRule;
import net.minidev.json.JSONObject;
import org.junit.Rule;

import java.util.HashMap;
import java.util.Map;

import static com.github.tomakehurst.wiremock.client.WireMock.*;
import static com.github.tomakehurst.wiremock.client.WireMock.aResponse;

public class UserStub {

    @Rule
    public WireMockRule wireMockRule = new WireMockRule(8089);

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
