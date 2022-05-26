package com.otus.pages;

import com.google.inject.Inject;
import support.GuiceScoped;

public class TrainingCoursesPage extends BasePage<TrainingCoursesPage> {

  @Inject
  public TrainingCoursesPage(GuiceScoped guiceScoped) {
    super(guiceScoped, "");
  }

}
