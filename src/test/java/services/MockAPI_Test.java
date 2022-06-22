package services;

import static com.github.tomakehurst.wiremock.client.WireMock.*;
import static org.apache.http.impl.client.HttpClients.createMinimal;
import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import com.github.tomakehurst.wiremock.WireMockServer;
import org.apache.http.HttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;
import mock.stubs.*;

import java.io.IOException;
import java.io.InputStream;
import java.util.Scanner;


@ExtendWith(MockitoExtension.class)
public class MockAPI_Test {

  private static final String LIST_USERS_MOCK =
          "[{ \"name\":\"Yuri N\", \"course\":\"QA java\", \"email\":\"dont@mail.me\", \"age\":\"77\" }, "
                  + "{ \"name\":\"Test user\", \"course\":\"QA\", \"email\":\"test@test.test\", \"age\":\"23\" }]";
  private static final String LIST_COURSES_MOCK =
          "[{ \"name\":\"QA java\", \"price\":15000 }, { \"name\":\"Java\", \"price\":12000 }]";
  private static final String USER_SCORE_MOCK_ID00001 = "{ \"name\":\"Test user Petroff\", \"score\":78 }";
  private static final String USER_SCORE_MOCK_ID00002 = "{ \"name\":\"Test user Ivanov\", \"score\":44 }";
  private static final String LOCALHOST_FOR_MOCK = System.getProperty("wiremock.hostname");

  private static WireMockServer wireMockServer;

  @BeforeAll
  public static void startWireMock() {
    wireMockServer = new WireMockServer();
    wireMockServer.start();
  }
  @Test
  public void list_courses_path_via_stub_wiremock() throws IOException {
    new AllCoursesStub();

    String url = String.format("%s/course/get/all", LOCALHOST_FOR_MOCK);
    String responseString = responseString(url);

    verify(getRequestedFor(urlEqualTo("/course/get/all")));
    assertThat(responseString).isEqualTo(LIST_COURSES_MOCK);
  }

  @Test
  public void users_score_path_via_stub_wiremock() throws IOException {
    new ScoreStub();

    String url = String.format("%s/user/get/00001", LOCALHOST_FOR_MOCK);
    String responseString = responseString(url);


    verify(getRequestedFor(urlEqualTo("/user/get/00001")));
    assertThat(responseString).isEqualTo(USER_SCORE_MOCK_ID00001);

    url = String.format("%s/user/get/00002", LOCALHOST_FOR_MOCK);
    responseString = responseString(url);

    verify(getRequestedFor(urlEqualTo("/user/get/00002")));
    assertThat(responseString).isEqualTo(USER_SCORE_MOCK_ID00002);

  }

  @Test
  public void list_users_path_via_stub_wiremock() throws IOException {
    new AllUsersStub();

    String url = String.format("%s/user/get/all", LOCALHOST_FOR_MOCK);
    String responseString = responseString(url);

    verify(getRequestedFor(urlEqualTo("/user/get/all")));
    assertThat(responseString).isEqualTo(LIST_USERS_MOCK);

  }

  private String responseString(String url) throws IOException {
    CloseableHttpClient httpClient = createMinimal();
    HttpGet request = new HttpGet(url);
    HttpResponse httpResponse = httpClient.execute(request);

    assertEquals(200, httpResponse.getStatusLine().getStatusCode(), "Server response error");

    return convertResponseToString(httpResponse);
  }

  private String convertResponseToString(HttpResponse response) throws IOException {
    InputStream responseStream = response.getEntity().getContent();
    Scanner scanner = new Scanner(responseStream, "UTF-8");
    String responseString = scanner.useDelimiter("\\Z").next();

    scanner.close();
    responseStream.close();
    return responseString;
  }

  @AfterAll
  public static void tearDown() {
    try {
      Thread.sleep(500);
    } catch (InterruptedException e) {
      throw new RuntimeException(e);
    }
    wireMockServer.stop();
  }
}
