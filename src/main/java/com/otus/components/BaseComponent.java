package com.otus.components;

import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;
import support.GuiceScoped;

public abstract class BaseComponent<T> {

  protected GuiceScoped guiceScoped;
  public WebDriverWait wait;


  public BaseComponent(GuiceScoped guiceScoped) {
    PageFactory.initElements(guiceScoped.driver, this);
    this.guiceScoped = guiceScoped;
    this.wait=new WebDriverWait(guiceScoped.driver, 5);
  }

}
