package pages;

import annotations.UrlPrefix;
import extensions.GetPropertiesExtension;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;

import javax.swing.*;
import java.util.Properties;

@UrlPrefix("/")
public class MainPage extends AnyPageAbs<MainPage> {

  public MainPage(WebDriver driver) {
    super(driver);
  }

  public void closeCookiePopup() {
    WebElement popupCookieCloseButton = driver.findElement(By
            .cssSelector(GetPropertiesExtension.getProperty("closeCookiesPopup"))); //не используем PF так как элемент поздно инициализируется
    standartWaiter.waitForCondition(ExpectedConditions
            .attributeToBeNotEmpty(popupCookieCloseButton, "name")); //использовано вместо tread.sleep(500);

    popupCookieCloseButton.click();

  }
}
