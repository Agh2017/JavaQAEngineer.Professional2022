package com.otus.steps.pages;

import com.google.inject.Inject;
import io.cucumber.java.AfterStep;
import io.cucumber.java.ru.И;
import io.cucumber.java.ru.Когда;
import io.cucumber.java.ru.Пусть;
import io.cucumber.java.ru.Тогда;
import org.openqa.selenium.WebElement;
import pages.TrainingCoursesPage;
import support.GuiceScoped;

import java.util.Date;

public class TrainingCoursesPageSteps {

  private WebElement foundedElement = null;

  @Inject
  private GuiceScoped guiceScoped;
  @Inject
  private TrainingCoursesPage trainingCoursesPage;

  @Пусть("^Открыта страница с url: \"([^\"]*)\"$")
  public void openUrl(String url) {
    System.out.println(url);
  }

  @И("^в списке курсов есть курсы с датой (.*) или позже")
  public void searchCoursesOnDate(Date date) {
    //фильтруем и сохраняем лист курсов с датой >= date
  }

  @Тогда("^Выводим название и дату старта курса в консоль")
  public void printNameCourse() {
    System.out.println("Курс: название, дата: дата");
  }

  @Тогда("^Открылась страница \"([^\"]*)\"")
  public void checkTitle() {
    //до этого главная, а тут идет подгот страница (H1 = "Онлайн-курсы для подготовки к поступлению на основные курсы")
  }

  @Когда("^Выбран самый \"([^\"]*)\" курс при помощи \"filter\"")
  public void searchExpensiveOrCheapCourse() {
    //определяем какой ищем дорогой/дешевый
    //сохраняем селектор или данные курса
  }

  @AfterStep
  public void tearDown() {
    System.out.println("Step completed," + this.getClass().getName());
  }
}
