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
        capabilities.setCapability("browserVersion", "102.0");
        capabilities.setCapability("enableVNC", true);
        capabilities.setCapability("enableVideo", false);
        driver = new RemoteWebDriver(
                URI.create("http://localhost:4445/wd/hub").toURL(),
                capabilities
        );
    }

    @AfterAll
    public void tearDown() {
        if(driver != null) {
            driver.close();
            driver.quit();
        }
    }

    @Test
    public void justBrowserTest0() throws InterruptedException {
        driver.get("https://ya.ru");

        Thread.sleep(10000);
    }

    @Test
    public void justBrowserTest1() throws InterruptedException {
        driver.get("https://ya.ru");

        Thread.sleep(10000);
    }

    @Test
    public void justBrowserTest2() throws InterruptedException {
        driver.get("https://ya.ru");

        Thread.sleep(10000);
    }

    @Test
    public void justBrowserTest3() throws InterruptedException {
        driver.get("https://ya.ru");

        Thread.sleep(10000);
    }

    @Test
    public void justBrowserTest4() throws InterruptedException {
        driver.get("https://ya.ru");

        Thread.sleep(10000);
    }

    @Test
    public void justBrowserTest5() throws InterruptedException {
        driver.get("https://ya.ru");

        Thread.sleep(10000);
    }

    @Test
    public void justBrowserTest6() throws InterruptedException {
        driver.get("https://ya.ru");

        Thread.sleep(10000);
    }

    @Test
    public void justBrowserTest7() throws InterruptedException {
        driver.get("https://ya.ru");

        Thread.sleep(10000);
    }

    @Test
    public void justBrowserTest8() throws InterruptedException {
        driver.get("https://ya.ru");

        Thread.sleep(10000);
    }

    @Test
    public void justBrowserTest9() throws InterruptedException {
        driver.get("https://ya.ru");

        Thread.sleep(10000);
    }

    @Test
    public void justBrowserTest10() throws InterruptedException {
        driver.get("https://ya.ru");

        Thread.sleep(10000);
    }

    @Test
    public void justBrowserTest11() throws InterruptedException {
        driver.get("https://ya.ru");

        Thread.sleep(10000);
    }

    @Test
    public void justBrowserTest12() throws InterruptedException {
        driver.get("https://ya.ru");

        Thread.sleep(10000);
    }

    @Test
    public void justBrowserTest13() throws InterruptedException {
        driver.get("https://ya.ru");

        Thread.sleep(10000);
    }

    @Test
    public void justBrowserTest14() throws InterruptedException {
        driver.get("https://ya.ru");

        Thread.sleep(10000);
    }

    @Test
    public void justBrowserTest15() throws InterruptedException {
        driver.get("https://ya.ru");

        Thread.sleep(10000);
    }

    @Test
    public void justBrowserTest16() throws InterruptedException {
        driver.get("https://ya.ru");

        Thread.sleep(10000);
    }

    @Test
    public void justBrowserTest17() throws InterruptedException {
        driver.get("https://ya.ru");

        Thread.sleep(10000);
    }

    @Test
    public void justBrowserTest18() throws InterruptedException {
        driver.get("https://ya.ru");

        Thread.sleep(10000);
    }

    @Test
    public void justBrowserTest19() throws InterruptedException {
        driver.get("https://ya.ru");

        Thread.sleep(10000);
    }

}
