package pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import data.MainMenuItemsData;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$x;

public class MainPage {

  public final SelenideElement webElementActionBar = $("#action_bar");
  public final SelenideElement webElement222 = $x("//*[@text='App']");

  public AccessPage selectAccessItem(MainMenuItemsData mainMenuItemsData) {
    $x(String.format("//*[@text='%s']", mainMenuItemsData.name())).click();

    return new AccessPage();
  }

  public MainPage clickOnActionBar(){
    webElementActionBar.shouldBe(Condition.enabled).
            click();
    return new MainPage();
  }

//public void

}
