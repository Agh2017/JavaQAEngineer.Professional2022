package pages;

import static java.util.function.Predicate.isEqual;
import static org.assertj.core.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.*;

import annotations.UrlPrefix;
import components.TileOnMainPage;
import org.openqa.selenium.*;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import utils.DateFromCalendar;

import java.time.LocalDate;
import java.util.*;
import java.util.function.UnaryOperator;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.IntStream;
import java.util.stream.Stream;


@UrlPrefix("/")
public class MainPage extends AnyPageAbs<MainPage> {


  private static final String REGEX_DATA = "(.*?(январ|феврал|март|апрел|ма|июн|июл|август|сентябр|октябр|ноябр|декабр))";
  private static final String NAME_COURSE_FOR_SEARCH = "Специализация Administrator Linux";
  private final ArrayList<TileOnMainPage> listTiles = new ArrayList<>();

  public MainPage(WebDriver driver) {
    super(driver);
  }

  @FindBy(css = ".lessons__new-item-title,.lessons__new-item-title_with-bg")
  List<WebElement> allCoursesName;

  @FindBy(css = ".lessons__new-item-start, .lessons__new-item-time:not(span ~ div.lessons__new-item-time)")
  List<WebElement> allCoursesDate;

  @FindBy(css = "H1")
  WebElement elementH1;

  @FindBy(css = "div.lessons > a:nth-child(8)")
  WebElement justCourse;

  public void closeCookiePopup() {
    WebElement popupCookieCloseButton = driver.findElement(By
            .cssSelector("button[class='js-cookie-accept cookies__button']"));
    standartWaiter.waitForCondition(ExpectedConditions
            .attributeToBeNotEmpty(popupCookieCloseButton, "name"));
    popupCookieCloseButton.click();
  }

  public void checkH1ShouldBeSameAs() {
    String actualValue = elementH1.getText();
    String expectedValue = "Авторские онлайн‑курсы для профессионалов";
    assertThat(actualValue).isEqualTo(expectedValue);
  }

  public void moveMouseToTileCourseAndClick() {
    standartWaiter.waitForCondition(ExpectedConditions
            .elementToBeClickable(justCourse));
    actions
            .moveToElement(justCourse)
            .click()
            .release()
            .build().perform();
  }

  public void searchNameCourse() {

    saveNameAndDateCourses();

    assertThat(listTiles.toString()).contains(NAME_COURSE_FOR_SEARCH);
    System.out.println("Курс: \"" + NAME_COURSE_FOR_SEARCH + "\" найден");
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
