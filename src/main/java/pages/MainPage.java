package pages;

import annotations.UrlPrefix;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;

@UrlPrefix("/")
public class MainPage extends AnyPageAbs<MainPage> {

    public MainPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(css = ".cookies__button")
    private WebElement popupCookie;


    public MainPage closePopup() {
        FluentWait<WebDriver> fluentWait = new FluentWait<>(driver);
        fluentWait.until(ExpectedConditions.elementToBeClickable(popupCookie));
        popupCookie.click();
        return new MainPage(driver);
    }
}
