package com.otus.steps.pages;

import com.google.inject.Inject;
import io.cucumber.java.ru.Тогда;
import com.otus.pages.CategoryLessonsPage;

public class CategoryLessonPageSteps {

  @Inject
  private CategoryLessonsPage categoryLessonsPage;

  @Тогда("^На странице отображается заголовок (.*)$")
  public void pageHeaderShouldBeSameAs(String expectedHeader) {
    categoryLessonsPage.pageHeaderShouldBeSameAs(expectedHeader);
  }


}
