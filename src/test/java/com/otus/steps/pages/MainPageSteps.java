package com.otus.steps.pages;

import com.google.inject.Inject;
import com.otus.components.NavigationMenuComponent;
import com.otus.driver.DriverFactory;
import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.ru.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import pages.MainPage;
import support.GuiceScoped;

import java.sql.Time;

public class MainPageSteps {

  private WebElement foundedElement = null;
  private WebDriver driver = null;


  @Inject
  private DriverFactory driverFactory; //инжектим фабрику чтобы можно было изменить значение браузера
  @Inject
  private GuiceScoped guiceScoped;
  @Inject
  private MainPage mainPage;

  @Когда("Пользователь использует браузер: \"([^\"]*)\"")
  public void chooseBrowser(String browserName) {
    guiceScoped.browserName = browserName;
    guiceScoped.driver = driverFactory.getDriver();
    mainPage.open();
  }

  @Пусть("^Открыта главная страница otus в браузере$")
  public void openMainPage() {
    guiceScoped.driver = driverFactory.getDriver();
    mainPage.open();
  }

  @Тогда("Главная страница открыта и заголовок {string}")
  public void pageShouldBeOpened(String expectedHeader) {
    mainPage.pageHeaderShouldBeSameAs(expectedHeader);
  }


  @То("^Навести курсор на раздел \"([^\"]*)\" и выбрать в выпадающем списке селектор \"([^\"]*)\"")
          public void navigateCourseOnDropdown() {
    // найти и кликнуть (selector = div.header2-menu.header2-menu_main > div:nth-child(1)  +++ hover),
    //проверить тайтл (<a href="/online/" title="Подготовительные курсы")
  }

  @И("^В списке курсов есть курс: \"([^\"]*)\"")
  public void isCourse(String courseName) {
    // фильтруем по названию и сохраняем селектор найденного курса
  }

  @Тогда("^Переходим на страницу курса")
  public void openCoursePage() {
    assert foundedElement!=null;
    if (foundedElement.isDisplayed()) foundedElement.click();
  }

  @Когда("^В списке курсов есть курсы с датой \"15.05.2022\" или позже")
  public void searchListCoursesOnDate() {
    System.out.println("Список курсов: +выводим лист курсов >= даты + даты");
  }

}
