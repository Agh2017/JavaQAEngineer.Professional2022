import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import data.AccessSubmenuData;
import data.MainMenuItemsData;
import drivers.AndroidDriverImpl;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import pages.MainPage;


public class OtusTest {

  @BeforeEach
  public void init() {
    Configuration.browserSize = null;
    Configuration.browser = AndroidDriverImpl.class.getName();
    Selenide.open();
  }

  @AfterEach
  public void close() {
    Selenide.closeWebDriver();
  }

  @Test
  public void justCheckMyDevice(){
    new MainPage().clickOnActionBar();
    System.out.println("good");
  }

  @Test
  public void first_appium_test() {
    new MainPage().selectAccessItem(MainMenuItemsData.Accessibility)
        .checkAccessMenuItemVisible(AccessSubmenuData.Accessibility_Node_Provider);

  }

}
