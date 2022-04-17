package pages;

import static org.assertj.core.api.Assertions.*;

import annotations.UrlPrefix;
import components.TileOnMainPage;
import org.openqa.selenium.*;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


@UrlPrefix("/")
public class MainPage extends AnyPageAbs<MainPage> {

  private static final String YEAR = "2022";
  private static final String REGEX_DATA = "(.*?(январ|феврал|март|апрел|ма|июн|июл|август|сентябр|октябр|ноябр|декабр))";
  private static final String NAME_COURSE_FOR_SEARCH = "Специализация Administrator Linux";
  private ArrayList<TileOnMainPage> listTiles = new ArrayList<>();
  private int sourceDate = -1;

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

  public MainPage moveMouseToTileCourse() {
    JavascriptExecutor js = (JavascriptExecutor)driver;
    js.executeScript("window.scrollBy(0,600)");
    actions
            .moveToElement(justCourse)
            .clickAndHold()
            .moveByOffset(0, 50) // scroll down
            .release()
            .build().perform();
    return new MainPage(driver);
  }

  public void clickMouse() {
    standartWaiter.waitForCondition(ExpectedConditions
            .elementToBeClickable(justCourse));
    actions
            .click(justCourse)
            .build().perform();
  }

  public void searchNameCourse() {

    prepareCoursesData();

    boolean courseIsPresent = listTiles.stream()
            .map(TileOnMainPage::getTileName)
            .anyMatch(name -> name.contains(NAME_COURSE_FOR_SEARCH));

    assert(courseIsPresent);

    System.out.println("Курс: \"" + NAME_COURSE_FOR_SEARCH + "\" найден");

  }

  public void choiceCourseOnDate() {

    prepareCoursesData();
    getSourceDate();
    assert sourceDate != -1;

    String nameCourseStarts = "не найден";
    for (TileOnMainPage listTile : listTiles) {
      Object currentTile = listTile.getStartDate();
      if (currentTile.equals(String.valueOf(sourceDate))) nameCourseStarts = listTile.getTileName();
    }

    System.out.println("курс, стартующий позже всех: " + sourceDate + "  " + nameCourseStarts);
  }

  private int getSourceDate() {
    return sourceDate = listTiles.stream()
            .map(TileOnMainPage::getStartDate)
            .filter(s -> {
              try {
                return !s.equals("");
              } catch (Exception e) {
                return false;
              }
            })
            .mapToInt(Integer::parseInt)
            .filter(data -> data > 0)
            .reduce((Math::max)).orElse(-1); // если надо найти курс с минимальной датой используем Math::min
  }

  private void prepareCoursesData() {

    for (int i = 0; i < allCoursesName.size(); i++) {
      String currentName = allCoursesName.get(i).getText();
      String courseDate = getDate(allCoursesDate.get(i).getText());
      TileOnMainPage tileOnMainPage = new TileOnMainPage(currentName,courseDate);
      listTiles.add(tileOnMainPage);
      System.out.println("Курс "+ tileOnMainPage.getTileName() + " стартует " + tileOnMainPage.getStartDate());
    }
    assert allCoursesName.size() == allCoursesDate.size() && allCoursesDate.size() == listTiles.size();
  }

  private String getDate(String input) {

    String[] months = {"январ", "феврал", "март", "апрел", "ма", "июн", "июл", "август", "сентябр", "октябр", "ноябр", "декабр"};
    HashMap<String, String> h = new HashMap<String, String>();
    for (int i = 1; i <= 12; i++) {
      if (i<10) {
        h.put(months[i - 1], "0"+ i);
      } else h.put(months[i - 1], String.valueOf(i));
    }

    String currentDate = trimRegex(input, REGEX_DATA);
    String currentDay = currentDate.replaceAll("[^[0-9][0-9]?]","");
    String currentMonth = currentDate.replaceAll("(?i)[^а-я]", "");

    if (h.containsKey(currentMonth)) {
      currentMonth = YEAR+h.get(currentMonth);
    } else currentMonth = "0";
    return currentMonth + currentDay;
  }

  public String trimRegex(String input, String regex) {

    String result = "";

    Pattern pattern = Pattern.compile(regex);
    Matcher matcher = pattern.matcher(input);
    if (matcher.find()) result = matcher.group();

    return result;
  }
}
