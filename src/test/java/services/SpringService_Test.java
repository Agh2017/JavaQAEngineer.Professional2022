package services;

import static com.github.tomakehurst.wiremock.client.WireMock.*;
import static org.assertj.core.api.Assertions.assertThat;

import com.github.tomakehurst.wiremock.WireMockServer;
import com.github.tomakehurst.wiremock.junit.WireMockRule;
import jdk.nashorn.internal.ir.annotations.Ignore;
import org.apache.http.HttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.junit.*;
import stubs.AllUsersStub;
import stubs.StoreStub;
import stubs.UserStub;

import java.io.IOException;
import java.io.InputStream;
import java.util.Scanner;

public class SpringService_Test {

  //создаем mock end-points
  {
    //new UserStub();
    new StoreStub();
    //new AllUsersStub();
  }

  private static final WireMockServer wireMockServer = new WireMockServer();
  private static final String LIST_USERS_MOCK = "[{ name:\"Yuri N\", course:\"QA java\", email:\"dont@mail.me\", age:\"77\" }, { name:\"Test user\", course:\"QA\", email:\"test@test.test\", age:\"23\" }]";

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
    new UserStub();
    CloseableHttpClient httpClient = HttpClients.createDefault();

    //отправляем запрос на заглушку
    HttpGet request = new HttpGet("http://localhost:8089/hello");
    HttpResponse httpResponse = httpClient.execute(request);
    String responseString = convertResponseToString(httpResponse);

    //для всех GET запросов на hello мы от
    verify(getRequestedFor(urlEqualTo("/hello")));
    assertThat(responseString).isEqualTo("Hello");
    assertThat(httpResponse.getStatusLine().getStatusCode()).isEqualTo(200);
  }

  //реальный запрос в приложение demo (д.б. запущено)
  //тест запустим через мавен/wiremock Run, чтобы получить урл из пропертей: test -Dtest=SpringService_Test#hello_path_via_real
  @Test @Ignore
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
