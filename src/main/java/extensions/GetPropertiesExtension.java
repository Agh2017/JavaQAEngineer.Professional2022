package extensions;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;


public class GetPropertiesExtension {
  protected static FileInputStream fileInputStream;
  protected static Properties PROPERTIES;

  static {
    try {
      File f2 = new File("src\\test\\resources\\any.properties");
      fileInputStream = new FileInputStream(f2);
      PROPERTIES = new Properties();
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
