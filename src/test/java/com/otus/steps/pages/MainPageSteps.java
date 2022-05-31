package com.otus.steps.pages;

import com.google.inject.Inject;
import com.otus.driver.DriverFactory;
import io.cucumber.java.ru.*;
import com.otus.pages.MainPage;
import support.GuiceScoped;

import java.time.LocalDate;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

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
    if (guiceScoped.driver == null) guiceScoped.driver = driverFactory.getDriver();
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

  @Когда("^В списке курсов есть курсы с датой \"(0?[1-9]|[12][0-9]|3[01]).(0?[1-9]|1[012]).(2022|2023)\" или позже")
  public void searchListCoursesOnDate(int day, int month, int year) {
    mainPage.searchCourseOnDate(day,month,year);
  }

  @И("^Выводим названия и даты старта курсов в консоль$")
  public void printNameCourse() {
    mainPage.printCourseData();
  }
}
