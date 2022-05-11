package driver;

import driver.impl.ChromeWebDriver;
import driver.impl.FFWebDriver;
import driver.impl.OperaWebDriver;
import driver.impl.SafariWebDriver;
import exceptions.DriverTypeNotSupported;
import org.openqa.selenium.support.events.EventFiringWebDriver;

import java.util.Locale;

public class DriverFactory implements IDriverFactory {

  private static String browserName;
  private String browserType = System.getProperty("browser").toLowerCase(Locale.ROOT);

  public static String getBrowserName() {
    return browserName;
  }

  public void setBrowserName(String browser) {
    browserName = browser;
  }

  @Override
  public EventFiringWebDriver getDriver() {
    setBrowserName(this.browserType);
    switch (this.browserType) {
      case "chrome": {
        return new EventFiringWebDriver(new ChromeWebDriver().newDriver());
      }
      case "firefox": {
        return new EventFiringWebDriver(new FFWebDriver().newDriver());
      }
      case "opera": {
        return new EventFiringWebDriver(new OperaWebDriver().newDriver());
      }
      case "safari": {
        return new EventFiringWebDriver(new SafariWebDriver().newDriver());
      }
      default:
        try {
          throw new DriverTypeNotSupported(this.browserType);
        } catch (DriverTypeNotSupported ex) {
          ex.printStackTrace();
          return null;
        }
    }
  }
}
