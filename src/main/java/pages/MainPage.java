package pages;

import static org.assertj.core.api.Assertions.*;

import annotations.UrlPrefix;
import extensions.GetPropertiesExtension;
import org.openqa.selenium.*;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;


@UrlPrefix("/")
public class MainPage extends AnyPageAbs<MainPage> {

  public MainPage(WebDriver driver) {
    super(driver);
  }

  @FindBy(css = "H1")
  WebElement elementH1;

  @FindBy(css = "div.lessons > a:nth-child(8)")
  WebElement justCourse;

  public void closeCookiePopup() {
    WebElement popupCookieCloseButton = driver.findElement(By
            .cssSelector("button[class='js-cookie-accept cookies__button']"));
    standartWaiter.waitForCondition(ExpectedConditions
            .attributeToBeNotEmpty(popupCookieCloseButton, "name"));

    popupCookieCloseButton.click();
  }

  public void checkH1ShouldBeSameAs() {
    String actualValue = elementH1.getText();
    String expectedValue = "Авторские онлайн‑курсы для профессионалов";
    assertThat(actualValue).isEqualTo(expectedValue);
  }

  public MainPage moveMouseToTileCourse() {
    JavascriptExecutor js = (JavascriptExecutor)driver;
    js.executeScript("window.scrollBy(0,600)");

    actions
            .moveToElement(justCourse)
            .clickAndHold()
            .moveByOffset(0, 50) // scroll down
            .release()
            .build().perform();
    return new MainPage(driver);
  }

  public void clickMouse() {
    actions
            .click(justCourse)
            .build().perform();

    standartWaiter.waitForCondition(ExpectedConditions
            .attributeToBeNotEmpty(justCourse, "name"));
  }
}
