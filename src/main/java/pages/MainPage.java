package pages;

import com.google.inject.Inject;
import support.GuiceScoped;

//в каждом тесте будет свой объект вебдрайвера, вейтера и т.п так как в GuiceScoped аннотация @ScenarioScoped - аналог синглтон?
public class MainPage extends BasePage<MainPage> {

  @Inject // com.google.inject объект будет заинжектен через конструктор
  public MainPage(GuiceScoped guiceScoped) {
    super(guiceScoped, "/");
  }
}
