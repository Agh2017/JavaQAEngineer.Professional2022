package com.otus.driver;

import com.google.inject.Inject;
import com.otus.driver.impl.*;
import com.otus.exceptions.DriverTypeNotSupported;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import support.GuiceScoped;

public class DriverFactory implements IDriverFactory {

  public GuiceScoped guiceScoped;

  @Inject
  public DriverFactory(GuiceScoped guiceScoped) {
    this.guiceScoped = guiceScoped;
  }

  @Override
  public WebDriver getDriver() {
    if (guiceScoped.browserName==null) guiceScoped.browserName ="";
    switch (guiceScoped.browserName) {
      case "chrome":
      case "": {
        return new ChromeWebDriver().newDriver();
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
      default: {
        try {
          throw new DriverTypeNotSupported(guiceScoped.browserName);
        } catch (DriverTypeNotSupported ex) {
          ex.printStackTrace();
        }
      }
    }
    return null;
  }
}