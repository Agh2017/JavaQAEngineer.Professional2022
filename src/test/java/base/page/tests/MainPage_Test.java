package base.page.tests;

import annotations.Driver;
import extensions.UIExtension;
import org.junit.jupiter.api.AfterEach;
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
  public void setUp() {
    mainPage = new MainPage(driver);
  }

  @Test
  public void check_open_mainPage() {
    mainPage
            .open()
            .checkH1ShouldBeSameAs();
  }

  @Test
  public void move_mouse_actions() {
    mainPage
            .open()
            .moveMouseToTileCourse()
            .clickMouse();
    mainPage
            .open(); //TODO нужен ли возврат к предыдущему состоянию?
  }

  @Test
  public void searchCourseForName(){
    mainPage.open()
            .searchNameCourse();
  }

  @Test
  public void choiceCourseOnDate(){
    mainPage.open()
            .choiceCourseOnDate();
  }

}
