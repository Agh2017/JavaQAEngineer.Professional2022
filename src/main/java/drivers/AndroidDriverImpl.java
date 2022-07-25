package drivers;

import com.codeborne.selenide.WebDriverProvider;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.Capabilities;
import org.openqa.selenium.WebDriver;

import javax.annotation.Nonnull;
import java.net.MalformedURLException;
import java.net.URL;


public class AndroidDriverImpl implements WebDriverProvider {
  private final String DEVICE_ANDR_9_0 = "Device2A";
  private final String DEVICE_ANDR_6_0 = "Android6";
  private final String DEVICE_ANDR_5_1 = "Device3API22";
  private final String DEVICE2_ANDR_5_1 = "NexusS";

  @Nonnull
  @Override
  public WebDriver createDriver(@Nonnull Capabilities capabilities) {

    UiAutomator2Options options = new UiAutomator2Options();

    options.setDeviceName(DEVICE_ANDR_6_0);
    options.setPlatformVersion("6.0");
    options.setPlatformName("android");
    options.setAutomationName("Appium");
    options.setCapability(MobileCapabilityType.APP, "C:\\StudyProjects\\appiumTest\\src\\test\\resources\\app_release-61572-1d4406.apk");
    //options.setApp(app.getAbsolutePath());
    //options.setAppActivity("com.google.android.apps.nexuslauncher.NexusLauncherActivity");
    //options.setAppPackage("com.google.android.apps.nexuslauncher");
    options.setCapability("autoGrantPermission", true);

    try {
      return new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), options);
    } catch (MalformedURLException e) {
      throw new RuntimeException(e);
    }
  }
}
