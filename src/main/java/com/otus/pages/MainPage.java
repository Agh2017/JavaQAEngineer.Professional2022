package com.otus.pages;

import com.google.inject.Inject;
import com.otus.components.BaseComponent;
import com.otus.components.TileOnMainPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import support.DateFromCalendar;
import support.GuiceScoped;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.IntStream;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

//в каждом тесте будет свой объект вебдрайвера, вейтера и т.п так как в GuiceScoped аннотация @ScenarioScoped - аналог синглтон?
public class MainPage extends BasePage<MainPage> {

  private static final String REGEX_DATA = "(.*?(январ|феврал|март|апрел|ма|июн|июл|август|сентябр|октябр|ноябр|декабр))";
  private final ArrayList<TileOnMainPage> listTiles = new ArrayList<>();
  private static WebElement foundedCourseElement = null;


  public static WebElement getFoundedCourseElement() {
    return foundedCourseElement;
  }

  @Inject // com.google.inject объект будет заинжектен через конструктор
  public MainPage(GuiceScoped guiceScoped) {
    super(guiceScoped, "");
  }

  @FindBy(css = ".lessons__new-item-title,.lessons__new-item-title_with-bg")
  List<WebElement> allCoursesName;

  @FindBy(css = ".lessons__new-item-start, .lessons__new-item-time:not(span ~ div.lessons__new-item-time)")
  List<WebElement> allCoursesDate;

  @FindBy(css = "H1")
  WebElement elementH1;

  @FindBy(css = "div.lessons > a:nth-child(8)")
  WebElement justCourse;


  public void goToCourse(String courseName) {
    closeCookiePopup();
    saveNameAndDateCourses();

    foundedCourseElement = allCoursesName.stream().filter(t -> t.getText().equals(courseName)).findAny().orElse(null);
    assertNotNull(foundedCourseElement);
    foundedCourseElement.click();
    System.out.println("Курс: \"" + courseName + "\" найден");
  }

  private void closeCookiePopup() {
    WebElement popupCookieCloseButton = guiceScoped.driver.findElement(By
            .cssSelector("button[class='js-cookie-accept cookies__button']"));
    WebDriverWait wait = new WebDriverWait(guiceScoped.driver, 10);
    wait.until(ExpectedConditions.elementToBeClickable(popupCookieCloseButton));

    try {
      popupCookieCloseButton.click();
    } catch (Exception e) {
      try {
        Thread.sleep(500);
        popupCookieCloseButton.click();
      } catch (Exception threadEx) {threadEx.printStackTrace();}
    }

  }


  public void searchCourseOnMinDate() {

    saveNameAndDateCourses();
    LocalDate minDate = getMinDate();

    TileOnMainPage nameCourseStarts = listTiles.stream().filter(t -> t.getStartDate().isEqual(minDate)).findAny().orElse(null);
    assertNotNull(nameCourseStarts);

    System.out.println("курс, стартующий раньше всех: " + minDate + "  " + nameCourseStarts);
  }

  public void searchCourseOnMaxDate() {

    saveNameAndDateCourses();
    LocalDate maxDate = getMaxDate();

    listTiles.stream()
            .reduce((t, tileOnMainPage) -> {
                      if (t.getStartDate().isEqual(maxDate)) return tileOnMainPage;
                      return t;
                    }
            ).ifPresent(tile -> System.out.println("курс, стартующий позже всех: "
                    + maxDate
                    + "  "
                    + tile.getTileName()));
  }

  private LocalDate getMaxDate() {

    return listTiles.stream()
            .map(TileOnMainPage::getStartDate)
            .max(Comparator.comparing(date -> date)).orElse(LocalDate.now());
  }

  private LocalDate getMinDate() {

    return listTiles.stream()
            .map(TileOnMainPage::getStartDate)
            .min(Comparator.comparing(date -> date)).orElse(LocalDate.now());
  }

  private void saveNameAndDateCourses() {

    IntStream.range(0, allCoursesName.size()).forEach(i -> {
      String currentName = allCoursesName.get(i).getText();
      LocalDate courseDate = getDateFromTile(allCoursesDate.get(i).getText());
      TileOnMainPage tileOnMainPage = new TileOnMainPage(currentName, courseDate);
      listTiles.add(tileOnMainPage);
    });
    assertTrue(allCoursesName.size() == allCoursesDate.size() && allCoursesDate.size() == listTiles.size());
  }

  private LocalDate getDateFromTile(String input) {

    String[] months = {"январ", "феврал", "март", "апрел", "ма", "июн", "июл", "август", "сентябр", "октябр", "ноябр", "декабр"};
    HashMap<String, String> mapMonths = new HashMap<>();
    for (int i = 0; i < 12; i++) {
      if (i < 10) {
        mapMonths.put(months[i], "0" + i);
      } else mapMonths.put(months[i - 1], String.valueOf(i));
    }

    String trimDate = trimRegex(input, REGEX_DATA);
    String day = trimDate.replaceAll("[^[0-9][0-9]?]", "");
    String month = trimDate.replaceAll("(?i)[^а-я]", "");

    if (mapMonths.containsKey(month)) month = mapMonths.get(month);

    //предполагается что выяснили у заказчика: если не указана дата курса, значит она примерно  в конце года... если месяц старта курса ранее чем текущий, то это не баг - это значит год 2023...
    if (day.equals("") || month.equals("")) {
      month = "11";
      day = "31";
    }
    return new DateFromCalendar(Integer.parseInt(month), Integer.parseInt(day)).getDate();
  }

  public String trimRegex(String input, String regex) {

    String result = "";
    Pattern pattern = Pattern.compile(regex);
    Matcher matcher = pattern.matcher(input);
    if (matcher.find()) result = matcher.group();

    return result;
  }
}
