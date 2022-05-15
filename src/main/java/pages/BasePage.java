package pages;

import static org.assertj.core.api.Assertions.*;

import actions.CommonActions;
import annotations.UrlPrefix;
import extensions.ThrowableExtension;
import org.apache.commons.lang3.StringUtils;
import org.junit.jupiter.api.extension.ExtendWith;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public abstract class BasePage<T> extends CommonActions<T> {

  public BasePage(WebDriver driver) {
    super(driver);
  }

  private String getBaseUrl() {
    return StringUtils.stripEnd(System.getProperty("webdriver.base.url"), "/");
  }

  private String getUrlPrefix() {
    UrlPrefix urlAnnotation = getClass().getAnnotation(UrlPrefix.class);
    if (urlAnnotation != null) {
      return urlAnnotation.value();
    }

    return "";
  }

  public T open() {
    driver.get(getBaseUrl() + getUrlPrefix());
    return (T) this;
  }
}
