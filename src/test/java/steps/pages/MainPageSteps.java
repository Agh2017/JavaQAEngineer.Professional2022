package steps.pages;

import com.google.inject.Inject;
import driver.DriverFactory;
import io.cucumber.java.ru.Пусть;
import io.cucumber.java.ru.Тогда;
import pages.MainPage;
import support.GuiceScoped;

public class MainPageSteps {

  @Inject
  private DriverFactory driverFactory; //инжектим фабрику чтобы можно было изменить значение браузера
  @Inject
  private GuiceScoped guiceScoped;
  @Inject
  private MainPage mainPage;

  @Пусть("^Открыта главная страница otus в браузере$")
  public void openMainPage() {
    guiceScoped.browserName = "chrome"; //TODO прокинуть из файла feature
    guiceScoped.driver = driverFactory.getDriver();
    mainPage.open();
  }

  @Тогда("Главная страница открыта и заголовок {string}")
  public void pageShouldBeOpened(String expectedHeader) {
    mainPage.pageHeaderShouldBeSameAs(expectedHeader);
  }

}
