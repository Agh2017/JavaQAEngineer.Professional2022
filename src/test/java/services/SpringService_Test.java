package services;

import static com.github.tomakehurst.wiremock.client.WireMock.*;
import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.Assert.assertTrue;

import com.github.tomakehurst.wiremock.WireMockServer;
import com.github.tomakehurst.wiremock.junit.WireMockRule;
import org.apache.http.HttpConnection;
import org.apache.http.HttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.junit.*;
import stubs.*;

import java.io.IOException;
import java.io.InputStream;
import java.util.Scanner;

public class SpringService_Test {

  private static final WireMockServer WIRE_MOCK_SERVER = new WireMockServer();
  private static final String LIST_USERS_MOCK =
          "[{ \"name\":\"Yuri N\", \"course\":\"QA java\", \"email\":\"dont@mail.me\", \"age\":\"77\" }, "
                  + "{ \"name\":\"Test user\", \"course\":\"QA\", \"email\":\"test@test.test\", \"age\":\"23\" }]";

  private static final String LIST_COURSES_MOCK =
          "[{ \"name\":\"QA java\", \"price\":15000 }, { \"name\":\"Java\", \"price\":12000 }]";

  private static final String USER_SCORE_MOCK_ID00001 = "{ \"name\":\"Test user Petroff\", \"score\":78 }";
  private static final String USER_SCORE_MOCK_ID00002 = "{ \"name\":\"Test user Ivanov\", \"score\":44 }";

  @Rule
  public WireMockRule wireMockRule = new WireMockRule(8089);

  //запуск wire мок сервера надо бы заинжектить
  @BeforeClass
  public static void startWireMock() {
    WIRE_MOCK_SERVER.start();
  }

  @AfterClass
  public static void tearDown() {
    try {
      Thread.sleep(500);
    } catch (InterruptedException e) {
      throw new RuntimeException(e);
    }
    WIRE_MOCK_SERVER.stop();
  }

  //clean test -Dtest=SpringService_Test#list_courses_path_via_stub_wiremock
  @Test
  public void list_courses_path_via_stub_wiremock() throws IOException {
    new AllCoursesStub();

    String responseString = getResponseString("http://localhost:8089/course/get/all");

    verify(getRequestedFor(urlEqualTo("/course/get/all")));
    assertThat(responseString).isEqualTo(LIST_COURSES_MOCK);
  }

  //clean test -Dtest=SpringService_Test#users_score_path_via_stub_wiremock
  @Test
  public void users_score_path_via_stub_wiremock() throws IOException {
    new ScoreStub();

    String responseString = getResponseString("http://localhost:8089/user/get/00001");

    verify(getRequestedFor(urlEqualTo("/user/get/00001")));
    assertThat(responseString).isEqualTo(USER_SCORE_MOCK_ID00001);

    responseString = getResponseString("http://localhost:8089/user/get/00002");

    verify(getRequestedFor(urlEqualTo("/user/get/00002")));
    assertThat(responseString).isEqualTo(USER_SCORE_MOCK_ID00002);

  }

  //clean test -Dtest=SpringService_Test#list_users_path_via_stub_wiremock
  @Test
  public void list_users_path_via_stub_wiremock() throws IOException {
    new AllUsersStub();
    String responseString = getResponseString("http://localhost:8089/user/get/all");

    verify(getRequestedFor(urlEqualTo("/user/get/all")));
    assertThat(responseString).isEqualTo(LIST_USERS_MOCK);
  }

  private String getResponseString(String url) throws IOException {
    CloseableHttpClient httpClient = HttpClients.createDefault();

    HttpGet request = new HttpGet(url);
    HttpResponse httpResponse = httpClient.execute(request);

    assertTrue("response status code error, url:" + url, (httpResponse.getStatusLine().getStatusCode() == 200));
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

}
