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
import stubs.StoreStub;
import stubs.UserStub;

import java.io.IOException;
import java.io.InputStream;
import java.util.Scanner;

public class SpringService_Test {

  //создаем mock end-points
  {
    new UserStub();
    new StoreStub();
  }

  @Rule
  public WireMockRule wireMockRule = new WireMockRule(8089);

  //запуск wire мок сервера надо бы заинжектить
  @BeforeClass
  public static void startWireMock() {
    WireMockServer wmserv = new WireMockServer();
    wmserv.start();
  }

  @Test
  public void hello_path_via_stub_wiremock() throws IOException {

    CloseableHttpClient httpClient = HttpClients.createDefault();

    HttpGet request = new HttpGet("http://localhost:8089/user/create");
    HttpResponse httpResponse = httpClient.execute(request);
    String responseString = convertResponseToString(httpResponse);

    //для всех GET запросов на hello мы от
    verify(getRequestedFor(urlEqualTo("/hello")));
    assertThat(httpResponse.getStatusLine().getStatusCode()).isEqualTo(200);
    assertThat(responseString).isEqualTo("Hello");
  }

  //реальный запрос в приложение demo (д.б. запущено)
  //тест запустим через мавен/wiremock Run, чтобы получить урл из пропертей: test -Dtest=SpringService_Test#hello_path_via_real
  @Test
  public void hello_path_via_real() throws IOException {
    CloseableHttpClient httpClient = HttpClients.createDefault();

    HttpGet request = new HttpGet(String.format("%s/hello", System.getProperty("real.service.hostname")));
    HttpResponse httpResponse = httpClient.execute(request);
    String responseString = convertResponseToString(httpResponse);

    assertThat(httpResponse.getStatusLine().getStatusCode()).isEqualTo(200);
    assertThat(responseString).isEqualTo("Hello User");
  }

  //конвертация ответа из текста- потока в строку
  private String convertResponseToString(HttpResponse response) throws IOException {
    InputStream responseStream = response.getEntity().getContent();
    Scanner scanner = new Scanner(responseStream, "UTF-8");
    String responseString = scanner.useDelimiter("\\Z").next();
    scanner.close();
    responseStream.close();
    return responseString;
  }

}
