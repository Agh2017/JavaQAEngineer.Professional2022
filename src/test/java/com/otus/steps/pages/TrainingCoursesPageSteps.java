package com.otus.steps.pages;

import static org.junit.jupiter.api.Assertions.*;

import com.google.inject.Inject;
import io.cucumber.java.ru.И;
import io.cucumber.java.ru.Когда;
import io.cucumber.java.ru.Пусть;
import io.cucumber.java.ru.Тогда;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import com.otus.pages.TrainingCoursesPage;
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
    WebElement element = guiceScoped.driver.findElement(By.tagName("H1"));
    String actualH1 = element.getText();
    String expectedH1 = "Онлайн-курсы для подготовки к поступлению на основные курсы";
    assertEquals(expectedH1, actualH1,  "заголовок H1 неверный");
  }

  @Когда("^Выбран самый \"([^\"]*)\" курс при помощи \"filter\"")
  public void searchExpensiveOrCheapCourse() {
    //определяем какой ищем дорогой/дешевый
    //сохраняем селектор или данные курса
  }

}
