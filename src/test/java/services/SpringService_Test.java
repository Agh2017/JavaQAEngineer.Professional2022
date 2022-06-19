package services;

import static com.github.tomakehurst.wiremock.client.WireMock.*;
import static org.assertj.core.api.Assertions.assertThat;

import com.github.tomakehurst.wiremock.WireMockServer;
import com.github.tomakehurst.wiremock.junit.WireMockRule;
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

  private static final WireMockServer wireMockServer = new WireMockServer();
  private static final String LIST_USERS_MOCK = "[{ \"name\":\"Yuri N\", \"course\":\"QA java\", \"email\":\"dont@mail.me\", \"age\":\"77\" }, { \"name\":\"Test user\", \"course\":\"QA\", \"email\":\"test@test.test\", \"age\":\"23\" }]";

  private static final String LIST_COURSES_MOCK = "[{ \"name\":\"QA java\", \"price\":15000 }, { \"name\":\"Java\", \"price\":12000 }]";

  private static final String USER_SCORE_MOCK_ID00001 = "{ \"name\":\"Test user Petroff\", \"score\":78 }";
  private static final String USER_SCORE_MOCK_ID00002 = "{ \"name\":\"Test user Ivanov\", \"score\":44 }";

  @Rule
  public WireMockRule wireMockRule = new WireMockRule(8089);

  //запуск wire мок сервера надо бы заинжектить
  @BeforeClass
  public static void startWireMock() {
    wireMockServer.start();
    //configureFor(8089);
    //configureFor(wireMockServer.port());
  }

  @AfterClass
  public static void tearDown() {
    try {
      Thread.sleep(500);
    } catch (InterruptedException e) {
      throw new RuntimeException(e);
    }
    wireMockServer.stop();
  }

  //clean test -Dtest=SpringService_Test#list_courses_path_via_stub_wiremock
  @Test
  public void list_courses_path_via_stub_wiremock() throws IOException {
    new AllCoursesStub();
    CloseableHttpClient httpClient = HttpClients.createDefault();

    HttpGet request = new HttpGet("http://localhost:8089/course/get/all");
    HttpResponse httpResponse = httpClient.execute(request);
    String responseString = convertResponseToString(httpResponse);

    verify(getRequestedFor(urlEqualTo("/course/get/all")));
    assertThat(httpResponse.getStatusLine().getStatusCode()).isEqualTo(200);
    assertThat(responseString).isEqualTo(LIST_COURSES_MOCK);
  }

  //clean test -Dtest=SpringService_Test#users_score_path_via_stub_wiremock
  @Test
  public void users_score_path_via_stub_wiremock() throws IOException {
    new ScoreStub();
    CloseableHttpClient httpClient = HttpClients.createDefault();

    HttpGet request = new HttpGet("http://localhost:8089/user/get/00001");
    HttpResponse httpResponse = httpClient.execute(request);
    String responseString = convertResponseToString(httpResponse);

    verify(getRequestedFor(urlEqualTo("/user/get/00001")));
    assertThat(httpResponse.getStatusLine().getStatusCode()).isEqualTo(200);
    assertThat(responseString).isEqualTo(USER_SCORE_MOCK_ID00001);


    request = new HttpGet("http://localhost:8089/user/get/00002");
    httpResponse = httpClient.execute(request);
    responseString = convertResponseToString(httpResponse);

    verify(getRequestedFor(urlEqualTo("/user/get/00002")));
    assertThat(httpResponse.getStatusLine().getStatusCode()).isEqualTo(200);
    assertThat(responseString).isEqualTo(USER_SCORE_MOCK_ID00002);

  }

  @Test
  public void list_users_path_via_stub_wiremock() throws IOException {
    new AllUsersStub();
    CloseableHttpClient httpClient = HttpClients.createDefault();

    HttpGet request = new HttpGet("http://localhost:8089/user/get/all");
    HttpResponse httpResponse = httpClient.execute(request);
    String responseString = convertResponseToString(httpResponse);

    verify(getRequestedFor(urlEqualTo("/user/get/all")));
    assertThat(httpResponse.getStatusLine().getStatusCode()).isEqualTo(200);
    assertThat(responseString).isEqualTo(LIST_USERS_MOCK);
  }

  @Test
  public void hello_path_via_stub_wiremock() throws IOException {
    //создаем mock end-points
    new UserStub();
    CloseableHttpClient httpClient = HttpClients.createDefault();

    //отправляем запрос на заглушку
    HttpGet request = new HttpGet("http://localhost:8089/hello");
    HttpResponse httpResponse = httpClient.execute(request);
    String responseString = convertResponseToString(httpResponse);

    //для всех GET запросов на hello мы сверяем ответ и статус
    verify(getRequestedFor(urlEqualTo("/hello")));
    assertThat(responseString).isEqualTo("Hello");
    assertThat(httpResponse.getStatusLine().getStatusCode()).isEqualTo(200);
  }

  //реальный запрос в приложение demo (оно д.б. запущено)
  //тест запускать через строку мавен/wiremock Run, чтобы получить урл из пропертей: clean test -Dtest=SpringService_Test#hello_path_via_real
  @Test
  public void hello_path_via_real() throws IOException {
    CloseableHttpClient httpClient = HttpClients.createDefault();

    HttpGet request = new HttpGet(String.format("%s/hello", System.getProperty("real.service.hostname")));
    HttpResponse httpResponse = httpClient.execute(request);
    String responseString = convertResponseToString(httpResponse);

    assertThat(httpResponse.getStatusLine().getStatusCode()).isEqualTo(200);
    assertThat(responseString).isEqualTo("Hello User");
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
