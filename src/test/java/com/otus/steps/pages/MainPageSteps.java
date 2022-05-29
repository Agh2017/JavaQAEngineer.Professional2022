package com.otus.steps.pages;

import com.google.inject.Inject;
import com.otus.driver.DriverFactory;
import io.cucumber.java.ru.*;
import com.otus.pages.MainPage;
import support.GuiceScoped;

import java.util.Date;

public class MainPageSteps {

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
  }

  @Пусть("^Открыта главная страница otus в браузере$")
  public void openMainPage() {
    mainPage.open();
  }

  @Тогда("Главная страница открыта и заголовок {string}")
  public void pageShouldBeOpened(String expectedHeader) {
    mainPage.pageHeaderShouldBeSameAs(expectedHeader);
  }


  @И("^Переходим на страницу курса: \"([^\"]*)\"")
  public void isCourse(String courseName) {
    mainPage.goToCourse(courseName);
  }

  @Когда("^В списке курсов есть курсы с датой \"15.05.2022\" или позже")
  public void searchListCoursesOnDate() {
    System.out.println("Список курсов: +выводим лист курсов >= даты + даты");
  }

  @И("^в списке курсов есть курсы с датой (.*) или позже$")
  public void searchCoursesOnDate(Date date) {
    //фильтруем и сохраняем лист курсов с датой >= date
  }
}
