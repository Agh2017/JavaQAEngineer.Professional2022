package ui.courses;

import annotations.Driver;
import components.FavouriteCourses;
import extensions.UIExtension;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.openqa.selenium.WebDriver;
import pages.MainPage;

@ExtendWith(UIExtension.class)
public class FavouriteCourseTile_Test {

  @Driver
  public WebDriver driver;

  @Test
  public void click_favourite_course_tile() {

    new MainPage(driver)
            .open()
            .closeCookiePopup(); //закрываем попап чтобы не мешал кликать по цели

    new FavouriteCourses(driver)
            .clickLessonItem()
            .getPageTitle();
  }

  @Test
  public void etest(){
    System.out.println("!!!OK!!!");
  }
}
