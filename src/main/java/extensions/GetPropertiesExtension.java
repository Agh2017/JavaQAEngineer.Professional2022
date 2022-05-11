package extensions;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;


public class GetPropertiesExtension {

  private static FileInputStream fileInputStream;
  private final static Properties PROPERTIES = new Properties();

  static {
    try {
      fileInputStream = new FileInputStream(new File("src\\test\\resources\\test.properties"));
      PROPERTIES.load(fileInputStream);
    } catch (IOException e) {
      e.printStackTrace();
    } finally {
      if (fileInputStream != null)
        try {
          fileInputStream.close();
        } catch (IOException e) {
          e.printStackTrace();
        }
    }
  }

  /**
   * метод для возврата строки со значением из файла с настройками
   */

  public static String getProperty(String key) {
    return PROPERTIES.getProperty(key);
  }
}
