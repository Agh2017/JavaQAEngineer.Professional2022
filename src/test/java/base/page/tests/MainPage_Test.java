package base.page.tests;

import annotations.Driver;
import extensions.UIExtension;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.openqa.selenium.WebDriver;
import pages.MainPage;

@ExtendWith(UIExtension.class)
public class MainPage_Test {

  private MainPage mainPage;

  @Driver
  public WebDriver driver;

  @BeforeEach
  private void setUp(){
    mainPage = new MainPage(driver);
  }

  @Test
  public void check_open_mainPage() {
    mainPage
            .open()
            .checkH1ShouldBeSameAs();
  }


}
