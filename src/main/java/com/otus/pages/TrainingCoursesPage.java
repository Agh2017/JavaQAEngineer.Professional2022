package com.otus.pages;

import com.google.inject.Inject;
import com.otus.components.BaseComponent;
import com.otus.components.TileOnTrainingCoursePage;
import io.cucumber.java.mn.Харин;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import support.GuiceScoped;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.IntStream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class TrainingCoursesPage extends BaseComponent<TrainingCoursesPage> {

  private final String expectedH1 = "Онлайн-курсы для подготовки к поступлению на основные курсы";
  private final ArrayList<TileOnTrainingCoursePage> listTrainingCourseData = new ArrayList<>();
  private static final String REGEX_DATA_PRICE = "[^\\d.]";

  @FindBy(css = ".lessons__new-item-title.lessons__new-item-title_with-tags.lessons__new-item-title_with-bg.js-ellipse")
  List<WebElement> trainingCourseNamesList;

  @FindBy(css = ".lessons__new-item-price")
  List<WebElement> trainingCoursePriceList;

  @Inject
  public TrainingCoursesPage(GuiceScoped guiceScoped) {
    super(guiceScoped);
  }

  public void isTitleTrue() {
    WebElement element = guiceScoped.driver.findElement(By.tagName("H1"));
    String actualH1 = element.getText();
    assertEquals(expectedH1, actualH1, "заголовок H1 неверный");
  }

  public void searchCheapOrExpensiveCourse(String parameter) {
    saveTrainingCourseData();

    if (parameter.equals("дорогой")) {
      int maxPrice = getMaxPrice();
      assertTrue(maxPrice != -1, "something wrong with max price of training courses");
      System.out.println("дорогой = " + maxPrice);
      //TODO передать стоимость и название далее

    } else {
      int minPrice = getMinPrice();
      assertTrue(minPrice != -1, "something wrong with min price of training courses");
      System.out.println("дешевый = " + minPrice);
    }
  }

  private void saveTrainingCourseData() {

    IntStream.range(0, trainingCourseNamesList.size()).forEach(i -> {
      String currentName = trainingCourseNamesList.get(i).getText();
      String courseCost = trainingCoursePriceList.get(i).getText().replaceAll(REGEX_DATA_PRICE, "");
      int courseCostInt = 0;

      try {
        courseCostInt = Integer.parseInt(courseCost);
      } catch (Exception e) {
        System.out.println("Стоимость курса не определена");
        e.printStackTrace();
      }

      TileOnTrainingCoursePage tileOnTrainingCoursePage = new TileOnTrainingCoursePage(currentName, courseCostInt);
      listTrainingCourseData.add(tileOnTrainingCoursePage);
    });

    assertTrue(trainingCourseNamesList.size() == listTrainingCourseData.size() && trainingCoursePriceList.size() == listTrainingCourseData.size());
  }

  private int getMaxPrice() {

    return listTrainingCourseData.stream() //научите пожалуйста передавать ссылку min/max в stream )
            .map(TileOnTrainingCoursePage::getPriceCourse)
            .max(Comparator.comparing(price -> price)).orElse(-1);
  }

  private int getMinPrice() {

    return listTrainingCourseData.stream()
            .map(TileOnTrainingCoursePage::getPriceCourse)
            .min(Comparator.comparing(price -> price)).orElse(-1);
  }


}
