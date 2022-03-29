package pages;

import annotations.UrlPrefix;
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

@UrlPrefix("/")
public class MainPage extends AnyPageAbs<MainPage> {

  public MainPage(WebDriver driver) {
    super(driver);
  }

  public void closeCookiePopup() { //не возвращаем "mainpage" чтобы не было бага в логе от "findbugs-maven-plugin:3.0.5"

    WebElement popupCookie = driver.findElement(By
            .cssSelector("button[class='js-cookie-accept cookies__button']")); //не используем PF так как элемент инициализируется позже страницы
    standartWaiter.waitForCondition(ExpectedConditions
            .attributeToBeNotEmpty(popupCookie, "name")); //использовано вместо tread.sleep(500);

    popupCookie.click();

  }
}
