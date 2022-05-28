package com.otus.components;

import com.google.inject.Inject;
import com.otus.pages.TrainingCoursesPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import com.otus.pages.CategoryLessonsPage;
import org.openqa.selenium.support.ui.ExpectedConditions;
import support.GuiceScoped;


public class NavigationMenuComponent extends BaseComponent<NavigationMenuComponent> {

  private WebDriver driver = null;

  @FindBy(css = ".nav:not(.hide-xs) .course-categories__nav-box")
  private WebElement navComponent;

  @FindBy(xpath = "//p[text()='Курсы']") //проверить пред версию
  private WebElement navMenuCourses;

  @FindBy(css = ".header2-menu__full > div:nth-child(2)") //p[text()='Курсы']/.."
  private WebElement selectCoursesInDrawer1;

  @FindBy(css = ".header2-menu__full > div:nth-child(2) > div") //p[text()='Курсы']/.."
  private WebElement selectCoursesInDrawer2;

  @FindBy(css = ".header2__burger.js-open-drawer")
  private WebElement drawerButton;

  @FindBy(css = "iv.header2-menu.header2-menu_main > div:nth-child(1)")
  private WebElement dropdownTrainingCourse;

  @FindBy(xpath = "//div[@class='header2-menu__full']//a[@href='/online/'][@title='Подготовительные курсы']")
  private WebElement trainingCourseSelectInDrawer;

  private final By locatorCoursesInDrawer = By.cssSelector(".header2-menu__full > div:nth-child(2)");

  @Inject
  public NavigationMenuComponent(GuiceScoped guiceScoped) {
    super(guiceScoped);
    this.driver=guiceScoped.driver;
  }

  public CategoryLessonsPage clickNavItem(String itemName) {
    navComponent.findElement(By.cssSelector(String.format("a[title='%s']", itemName))).click();
    return new CategoryLessonsPage(guiceScoped);
  }

  public TrainingCoursesPage openTrainingCoursesPageFromNavigationMenu() {
    //для стандартного окна браузера (не max)
    if (drawerButton.isEnabled()) drawerButton.click();
    driver.findElement(locatorCoursesInDrawer).click();

    try {
      wait.until(ExpectedConditions.elementToBeClickable(trainingCourseSelectInDrawer));
    } catch (Exception e) {
      System.out.println("trainingCourseSelectInDrawer is not clickable");
    }
    trainingCourseSelectInDrawer.click();

    return new TrainingCoursesPage(guiceScoped);
  }
}
