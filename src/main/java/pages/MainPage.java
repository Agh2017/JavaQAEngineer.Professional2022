package pages;

import annotations.UrlPrefix;
import extensions.GetPropertiesExtension;
import org.assertj.core.api.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import static org.assertj.core.api.Assertions.*;

@UrlPrefix("/")
public class MainPage extends AnyPageAbs<MainPage> {

  public MainPage(WebDriver driver) {
    super(driver);
  }

  @FindBy(css = "H1")
  WebElement elementH1;

  public void closeCookiePopup() {
    WebElement popupCookieCloseButton = driver.findElement(By
            .cssSelector(GetPropertiesExtension.getProperty("closeCookiesPopup"))); //не используем PF так как элемент поздно инициализируется
    standartWaiter.waitForCondition(ExpectedConditions
            .attributeToBeNotEmpty(popupCookieCloseButton, "name")); //использовано вместо tread.sleep(500);

    popupCookieCloseButton.click();

  }

  public void checkH1ShouldBeSameAs() {
    String actualValue = elementH1.getText();
    String expectedValue = GetPropertiesExtension.getProperty("H1mainPage");
    assertThat(actualValue).isEqualTo(expectedValue);
  }
}
