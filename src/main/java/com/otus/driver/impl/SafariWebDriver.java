package com.otus.driver.impl;

import com.otus.exceptions.DriverTypeNotSupported;
import io.github.bonigarcia.wdm.config.DriverManagerType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.logging.LogType;
import org.openqa.selenium.logging.LoggingPreferences;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.openqa.selenium.safari.SafariOptions;

import java.util.logging.Level;

public class SafariWebDriver implements IDriver{

  @Override
  public WebDriver newDriver() {
    SafariOptions safariOptions = new SafariOptions();
    safariOptions.setCapability(CapabilityType.BROWSER_NAME,"");
    safariOptions.setCapability(CapabilityType.SUPPORTS_FINDING_BY_CSS, true);
    safariOptions.setCapability(CapabilityType.ENABLE_PROFILING_CAPABILITY, true);
    safariOptions.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);
    safariOptions.setCapability(CapabilityType.ACCEPT_INSECURE_CERTS, true);
    safariOptions.setCapability(CapabilityType.VERSION, System.getProperty("browser.version", ""));
    //safariOptions.setCapability("enableVNC", Boolean.parseBoolean(System.getProperty("enableVNC", "false")));

    LoggingPreferences logPrefs = new LoggingPreferences();
    logPrefs.enable(LogType.PERFORMANCE, Level.INFO);
    safariOptions.setCapability(CapabilityType.LOGGING_PREFS, logPrefs);

    if (getRemoteUrl() == null) {
      try {
        downloadLocalWebDriver(DriverManagerType.SAFARI);
      } catch (DriverTypeNotSupported ex) {
        ex.printStackTrace();
      }

      return new SafariDriver(safariOptions);
    } else
      return new RemoteWebDriver(getRemoteUrl(), safariOptions);
  }
}
