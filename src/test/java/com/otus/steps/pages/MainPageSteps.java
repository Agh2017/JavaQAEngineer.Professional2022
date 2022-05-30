package com.otus.steps.pages;

import com.google.inject.Inject;
import com.otus.driver.DriverFactory;
import io.cucumber.java.ru.*;
import com.otus.pages.MainPage;
import support.GuiceScoped;

import java.time.LocalDate;
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

  @Когда("^В списке курсов есть курсы с датой \"(0?[1-9]|[12][0-9]|3[01]).(0?[1-9]|1[012]).((19|20)\\d\\d)\" или позже")
  public void searchListCoursesOnDate(LocalDate date) {
    mainPage.searchCourseOnDate(date);
  }

  @И("^Выводим названия и даты старта курсов в консоль$")
  public void printNameCourse() {
    //mainPage.printCourseData();
    //System.out.println("Список курсов: +выводим лист курсов >= даты + даты");
  }
}
