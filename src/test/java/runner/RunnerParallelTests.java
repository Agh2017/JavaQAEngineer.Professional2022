package runner;

import org.junit.jupiter.api.*;
import org.junit.jupiter.api.parallel.Execution;
import org.junit.jupiter.api.parallel.ExecutionMode;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.MalformedURLException;
import java.net.URI;

@Execution(ExecutionMode.CONCURRENT)
@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class RunnerParallelTests {

  private WebDriver driver;

  @BeforeAll
  public void init() throws MalformedURLException {

    DesiredCapabilities capabilities = new DesiredCapabilities();
    capabilities.setCapability("browserName", "chrome");
    capabilities.setCapability("browserVersion", "101.0");
    capabilities.setCapability("enableVNC", true);
    capabilities.setCapability("enableVideo", false);
    driver = new RemoteWebDriver(
            URI.create("http://localhost:4445/wd/hub").toURL(),
            capabilities
    );
  }

  @AfterAll
  public void tearDown() {
    if (driver != null) {
      driver.close();
      driver.quit();
    }
  }

  @Test
  public void justBrowserTest0() throws InterruptedException {
    driver.get("https://ya.ru");

    Thread.sleep(10000);
  }

}
