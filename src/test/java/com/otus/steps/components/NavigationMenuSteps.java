package com.otus.steps.components;

import com.google.inject.Inject;
import com.otus.components.NavigationMenuComponent;
import com.otus.dobj.Category;
import io.cucumber.java.DataTableType;
import io.cucumber.java.ru.Если;
import io.cucumber.java.ru.То;

import java.util.List;
import java.util.Map;

public class NavigationMenuSteps {

  @DataTableType
  public Category categories(Map<String, String> entry) {
    return new Category(
            entry.get("name"),
            entry.get("header"));
  }

  @Inject
  private NavigationMenuComponent navigationMenuComponent;

  @Если("Кликнуть на категорию курса {string}")
  public void clickNavMenuItem(String itemName) {
    navigationMenuComponent.clickNavItem(itemName);
  }

  @Если("Кликнуть на курс")
  public void testClickCourse(List<Category> categories) {
    for (Category category : categories) {
      navigationMenuComponent.clickNavItem(category.getName());
    }
  }

  @То("^Навести курсор на раздел \"курсы\" и выбрать в выпадающем списке селектор \"Подготовительные курсы\"$")
  public void navigateCourseOnDropdown() {
    navigationMenuComponent.openTrainingCoursesPageFromNavigationMenu();
  }

}
