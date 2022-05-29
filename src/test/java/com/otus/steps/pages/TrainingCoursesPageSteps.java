package com.otus.steps.pages;

import static org.junit.jupiter.api.Assertions.*;

import com.google.inject.Inject;
import io.cucumber.java.ru.И;
import io.cucumber.java.ru.Когда;
import io.cucumber.java.ru.Пусть;
import io.cucumber.java.ru.Тогда;
import com.otus.pages.TrainingCoursesPage;
import support.GuiceScoped;

import java.util.Date;

public class TrainingCoursesPageSteps {

  @Inject
  private GuiceScoped guiceScoped;
  @Inject
  private TrainingCoursesPage trainingCoursesPage;

  @Пусть("^Открыта страница с url: \"([^\"]*)\"$")
  public void openUrl(String url) {
    System.out.println(url);
  }

  @И("^в списке курсов есть курсы с датой (.*) или позже$")
  public void searchCoursesOnDate(Date date) {
    //фильтруем и сохраняем лист курсов с датой >= date
  }

  @Тогда("^Открылась страница \"Подготовительные курсы\"$")
  public void checkTitle() {
    trainingCoursesPage.isTitleTrue();
  }


  @Когда("^Выбран самый \"([^\"]*)\" курс$")
  public TrainingCoursesPage searchExpensiveOrCheapCourse(String parameter) {
    assertTrue(parameter.equals("дорогой") || parameter.equals("дешевый"), "Введен некорректный параметр");
    trainingCoursesPage.searchCheapOrExpensiveCourse(parameter);
    return trainingCoursesPage;
  }

  @Тогда("^Выводим название и дату старта курса в консоль$")
  public void printNameCourse() {
    trainingCoursesPage.printCourseData();
  }
}
