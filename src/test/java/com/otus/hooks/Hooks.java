package com.otus.hooks;

import com.google.inject.Inject;
import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import support.GuiceScoped;

public class Hooks {

  @Inject
  private GuiceScoped guiceScoped;

  @Before(value = "~@fail", order = 20)
  public void prepareData() {
    //Предыстория ли нет???
  }

  @After
  public void afterScenario(Scenario scenario) {
    if (guiceScoped.driver != null) {
      guiceScoped.driver.close();
      guiceScoped.driver.quit();
    }
    //TODO Test data cleaned

    System.out.println("Test ID = " + scenario.getId() + "; tag name = " + scenario.getSourceTagNames());

    if (scenario.isFailed()) {
      System.out.println("Test failed:" + scenario.getName() + " !!!");
      System.out.println("Status = " + scenario.getStatus());
    } else {
      System.out.println("Test name = " + scenario.getName());
      System.out.println("Scenario completed");
    }
  }

  @AfterStep
  public void afterStepMethod() {
  }
}
