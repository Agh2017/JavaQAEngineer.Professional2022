package pages;

import annotations.UrlPrefix;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;

import javax.swing.*;

@UrlPrefix("/")
public class MainPage extends AnyPageAbs<MainPage> {

  public MainPage(WebDriver driver) {
    super(driver);
  }

  @FindBy(css = "button[class='js-cookie-accept cookies__button']")
  private WebElement popupCookie;


  public MainPage closePopup() {

    standartWaiter.waitForCondition(ExpectedConditions
            .attributeToBeNotEmpty(popupCookie, "name")); //использовано вместо tread.sleep(500);
    popupCookie.click();
    return new MainPage(driver);
  }
}
