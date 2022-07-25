package pages;

import com.codeborne.selenide.Condition;
import data.AccessSubmenuData;

import static com.codeborne.selenide.Selenide.$x;

public class AccessPage {
  public void checkAccessMenuItemVisible(AccessSubmenuData accessSubmenuData) {
    $x(String.format("//*[@text='%s']", accessSubmenuData.name().replace("_", " "))).shouldBe(Condition.visible);
  }
}
