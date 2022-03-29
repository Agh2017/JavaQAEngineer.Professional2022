package driver;

import exceptions.DriverTypeNotSupported;
import org.openqa.selenium.WebDriver;

public class DeleteMe implements IDeleteMe {

  public static void main(String[] args) {

    String testValue1 = "string2";
    int testValue2 = 234;

    boolean isTrue = IS_TRUE.test(testValue1);
    System.out.println(isTrue);

    String stringFromInt = INT_IN_STRING.apply(testValue2)+"new";
    System.out.println(stringFromInt);




  }

  @Override
  public WebDriver getDriver() throws DriverTypeNotSupported {
    return null;
  }
}
