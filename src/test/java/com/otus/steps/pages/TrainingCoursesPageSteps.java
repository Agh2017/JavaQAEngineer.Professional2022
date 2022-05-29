package com.otus.steps.pages;

import static org.junit.jupiter.api.Assertions.*;

import com.google.inject.Inject;
import io.cucumber.java.ru.Когда;
import io.cucumber.java.ru.Тогда;
import com.otus.pages.TrainingCoursesPage;


public class TrainingCoursesPageSteps {

  @Inject
  private TrainingCoursesPage trainingCoursesPage;

  @Тогда("^Открылась страница \"Подготовительные курсы\"$")
  public void checkTitle() {
    trainingCoursesPage.isTitleTrue();
  }

  @Когда("^Выбран самый \"([^\"]*)\" курс$")
  public void searchExpensiveOrCheapCourse(String parameter) {
    assertTrue(parameter.equals("дорогой") || parameter.equals("дешевый"), "Введен некорректный параметр");
    trainingCoursesPage.searchCheapOrExpensiveCourse(parameter);
  }

  @Тогда("^Выводим название и дату старта курса в консоль$")
  public void printNameCourse() {
    trainingCoursesPage.printCourseData();
  }
}
