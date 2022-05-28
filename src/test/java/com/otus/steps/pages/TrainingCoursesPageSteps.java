package com.otus.steps.pages;

import static org.junit.jupiter.api.Assertions.*;

import com.google.inject.Inject;
import io.cucumber.java.mn.Харин;
import io.cucumber.java.ru.И;
import io.cucumber.java.ru.Когда;
import io.cucumber.java.ru.Пусть;
import io.cucumber.java.ru.Тогда;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import com.otus.pages.TrainingCoursesPage;
import org.openqa.selenium.support.FindBy;
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

  @И("^в списке курсов есть курсы с датой (.*) или позже$")
  public void searchCoursesOnDate(Date date) {
    //фильтруем и сохраняем лист курсов с датой >= date
  }

  @Тогда("^Выводим название и дату старта курса в консоль$")
  public void printNameCourse() {
    System.out.println("Курс: название, дата: дата");
  }

  @Тогда("^Открылась страница \"Подготовительные курсы\"$")
  public void checkTitle() {
    trainingCoursesPage.isTitleTrue();

  }



  @Когда("^Выбран самый \"([^\"]*)\" курс при помощи \"filter\"$")
  public void searchExpensiveOrCheapCourse(String parameter) {

    if (parameter.equals("дорогой")) {
      trainingCoursesPage.searchExpensiveCourse();

    } else if (parameter.equals("дешевый")) {
      trainingCoursesPage.searchCheapCourse();

    } else {
      System.out.println("Введен некорректный параметр");
    }


  }

}
