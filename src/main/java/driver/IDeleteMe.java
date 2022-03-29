package driver;

import exceptions.DriverTypeNotSupported;
import org.openqa.selenium.WebDriver;

import java.util.function.Function;
import java.util.function.Predicate;

public interface IDeleteMe {

  Predicate<String> IS_TRUE = x -> x.equals("string");

  Function<Integer, String> INT_IN_STRING = String::valueOf;

  WebDriver getDriver() throws DriverTypeNotSupported;

}
