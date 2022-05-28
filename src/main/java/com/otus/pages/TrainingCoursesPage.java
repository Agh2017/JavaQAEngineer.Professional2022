package com.otus.pages;

import com.google.inject.Inject;
import com.otus.components.BaseComponent;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import support.GuiceScoped;

import java.time.LocalDate;
import java.util.List;
import java.util.stream.IntStream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class TrainingCoursesPage extends BaseComponent<TrainingCoursesPage> {

  private final String expectedH1 = "Онлайн-курсы для подготовки к поступлению на основные курсы";

  @FindBy(css=".lessons__new-item-title.lessons__new-item-title_with-tags.lessons__new-item-title_with-bg.js-ellipse")
  List<WebElement> trainingCourseNamesList;

  @Inject
  public TrainingCoursesPage(GuiceScoped guiceScoped) {
    super(guiceScoped);
  }

  public void isTitleTrue() {
    WebElement element = guiceScoped.driver.findElement(By.tagName("H1"));
    String actualH1 = element.getText();
    assertEquals(expectedH1, actualH1,  "заголовок H1 неверный");
  }

  public void searchExpensiveCourse() {
    saveTrainingCourseData();

    //определяем какой ищем дорогой/дешевый = if если все цены одинаковы, то сразу выводим типа: "сожалею, но сегодня все курсы по одной цене... :("
    //сохраняем селектор или данные курса для след шага
//    IntStream.range(0, allCoursesName.size()).forEach(i -> {
//      String currentName = allCoursesName.get(i).getText();
//      LocalDate courseDate = getDateFromTile(allCoursesDate.get(i).getText());
//      TileOnMainPage tileOnMainPage = new TileOnMainPage(currentName, courseDate);
//      listTiles.add(tileOnMainPage);
//    });
//    assertTrue(allCoursesName.size() == allCoursesDate.size() && allCoursesDate.size() == listTiles.size());
  }

  public void searchCheapCourse() {
    saveTrainingCourseData();

    //определяем какой ищем дорогой/дешевый = if если все цены одинаковы, то сразу выводим типа: "сожалею, но сегодня все курсы по одной цене... :("
    //сохраняем селектор или данные курса для след шага
  }

  private void saveTrainingCourseData() {

    //собираем все названия и стоимости в список
    //названия css='.lessons__new-item-title.lessons__new-item-title_with-tags.lessons__new-item-title_with-bg.js-ellipse'
    //стоимость css='.lessons__new-item-price'
  }
}
