package com.otus.components;

import com.google.inject.Inject;
import com.otus.pages.TrainingCoursesPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import com.otus.pages.CategoryLessonsPage;
import org.openqa.selenium.support.ui.WebDriverWait;
import support.GuiceScoped;

import static org.junit.jupiter.api.Assertions.fail;

public class NavigationMenuComponent extends BaseComponent<NavigationMenuComponent> {

  @FindBy(css = ".nav:not(.hide-xs) .course-categories__nav-box")
  private WebElement navComponent;

  @FindBy(xpath = "//p[text()='Курсы']") //проверить пред версию
  private WebElement navMenuCourses;

  @FindBy(xpath = "div.header2-menu__full > div:nth-child(2)") //p[text()='Курсы']/.."
  private WebElement selectCoursesInDrawer;

  @FindBy(css = ".header2__burger.js-open-drawer")
  private WebElement drawerButton;

  @FindBy(css = "iv.header2-menu.header2-menu_main > div:nth-child(1)")
  private WebElement dropdownTrainingCourse;

  @FindBy(xpath = "//a[@href='/online/'][@title='Подготовительные курсы']")
  private WebElement trainingCourseSelectInDrawer;

  @Inject
  public NavigationMenuComponent(GuiceScoped guiceScoped) {
    super(guiceScoped);
  }

  public CategoryLessonsPage clickNavItem(String itemName) {
    navComponent.findElement(By.cssSelector(String.format("a[title='%s']", itemName))).click();
    return new CategoryLessonsPage(guiceScoped);
  }

  public TrainingCoursesPage openTrainingCoursesPageFromNavigationNenu() {
    Actions actions = new Actions(guiceScoped.driver);


    //для стандартного окна браузера (не max)
    if (drawerButton.isEnabled()) {
      drawerButton.click();

    }
    assert guiceScoped.driver.findElement(By.xpath("//a[@href='/online/'][@title='Подготовительные курсы']")).isEnabled();

    //
    WebDriverWait wait = new WebDriverWait(guiceScoped.driver, 10);

    for (int second = 0;; second++) {
      if (second >= 30) fail("timeout");
      try {
        if (selectCoursesInDrawer.isEnabled()&& selectCoursesInDrawer.isDisplayed()) //.ic.new-ic-logo-with-text-black
          selectCoursesInDrawer.click();
          System.out.println("click on selectCoursesInDrawer");
        break;
      } catch (Exception e) {}
      try {
        Thread.sleep(1000);
      } catch (InterruptedException e) {
        e.printStackTrace();
      }
    }

    // для полноэкранного max
    //    actions.moveToElement(navMenuCourses)
    //            .moveToElement(dropdownTrainingCourse)
    //            .click().build().perform();

    return new TrainingCoursesPage(guiceScoped);
    //TODO delete
    // найти и кликнуть (selector = div.header2-menu.header2-menu_main > div:nth-child(1)  +++ hover),
    //проверить тайтл (<a href="/online/" title="Подготовительные курсы")
  }
}
