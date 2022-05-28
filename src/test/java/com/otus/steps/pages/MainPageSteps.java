package com.otus.steps.pages;

import com.google.inject.Inject;
import com.otus.driver.DriverFactory;
import io.cucumber.java.ru.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import com.otus.pages.MainPage;
import support.GuiceScoped;

public class MainPageSteps {

  private WebElement foundedElement = null;

  @Inject
  private DriverFactory driverFactory; //инжектим фабрику чтобы можно было изменить значение браузера
  @Inject
  private GuiceScoped guiceScoped;
  @Inject
  private MainPage mainPage;

  @Когда("Пользователь использует браузер: \"([^\"]*)\"$")
  public void chooseBrowser(String browserName) {
    guiceScoped.browserName = browserName;
    guiceScoped.driver = driverFactory.getDriver();
    //mainPage.open();
  }

  @Пусть("^Открыта главная страница otus в браузере$")
  public void openMainPage() {
    //guiceScoped.driver = driverFactory.getDriver();
    mainPage.open();
  }

  @Тогда("Главная страница открыта и заголовок {string}")
  public void pageShouldBeOpened(String expectedHeader) {
    mainPage.pageHeaderShouldBeSameAs(expectedHeader);
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
