package pages;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.remote.AutomationName;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeClass;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class BasePage {
    public static WebDriver driver;

    public BasePage(WebDriver driver) {
        BasePage.driver = driver;
        PageFactory.initElements(new AppiumFieldDecorator(this.driver, Duration.ofSeconds(30)), this);
        //Generic.wait(10);
    }

    public BasePage() {

    }

    @BeforeClass
    //Created A method
    public void openBrowser() throws InterruptedException, MalformedURLException {


        DesiredCapabilities cap = new DesiredCapabilities();
        cap.setCapability(MobileCapabilityType.AUTOMATION_NAME, AutomationName.ANDROID_UIAUTOMATOR2);
        cap.setCapability(MobileCapabilityType.DEVICE_NAME, "Moto G4");
        cap.setCapability("udid","ZY223CPDLT");
        cap.setCapability(MobileCapabilityType.PLATFORM_NAME, Platform.ANDROID);
        cap.setCapability(MobileCapabilityType.PLATFORM_VERSION, "7.0");
        cap.setCapability("appPackage","in.amazon.mShop.android.shopping");
        cap.setCapability("appActivity","com.amazon.mShop.home.HomeActivity");
        driver =new AndroidDriver(new URL("http://0.0.0.0:4723/wd/hub"), cap);
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    }
}



