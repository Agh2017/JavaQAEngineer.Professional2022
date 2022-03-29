package extensions;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;


public class GetPropertiesExtension {

  protected final static Properties PROPERTIES = new Properties();
  private static FileInputStream fileInputStream;

  static {
    try {
      File file = new File("src\\main\\resources\\specialSelectors");
      fileInputStream = new FileInputStream(file);
      PROPERTIES.load(fileInputStream);
      fileInputStream.close();
    } catch (IOException e) {
      e.printStackTrace();
    }
  }

  /**
   * метод для возврата строки со значением из файла с настройками
   */
  public static String getProperty(String key) {
    return PROPERTIES.getProperty(key);
  }
}
