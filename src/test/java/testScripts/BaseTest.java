package testScripts;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.AutomationName;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.Platform;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.BeforeClass;
import utilities.ReUsables;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

public class BaseTest {

    protected AndroidDriver driver;

    /**
     * Author: @Tejaswini Sharma
     * @throws InterruptedException
     * @throws MalformedURLException
     */

    @BeforeClass
    public void openBrowser() throws InterruptedException, MalformedURLException {
        DesiredCapabilities cap = new DesiredCapabilities();
        cap.setCapability(MobileCapabilityType.AUTOMATION_NAME, AutomationName.ANDROID_UIAUTOMATOR2);
        cap.setCapability(MobileCapabilityType.DEVICE_NAME, ReUsables.getValue("deviceName"));
        cap.setCapability("udid", ReUsables.getValue("udid"));
        cap.setCapability(MobileCapabilityType.PLATFORM_NAME, Platform.ANDROID);
        cap.setCapability(MobileCapabilityType.PLATFORM_VERSION, ReUsables.getValue("version"));
        cap.setCapability("appPackage",ReUsables.getValue("packageName"));
        cap.setCapability("appActivity",ReUsables.getValue("activityName"));
        driver =new AndroidDriver(new URL("http://0.0.0.0:4723/wd/hub"), cap);
        driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
    }
}
