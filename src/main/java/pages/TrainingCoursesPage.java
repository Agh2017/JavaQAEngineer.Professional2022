package pages;

import com.google.inject.Inject;
import support.GuiceScoped;

public class TrainingCoursesPage extends BasePage{

  @Inject
  public TrainingCoursesPage(GuiceScoped guiceScoped, String path) {
    super(guiceScoped, "/");
  }

}
