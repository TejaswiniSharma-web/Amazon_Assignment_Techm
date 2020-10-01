package pages;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.remote.AutomationName;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.By;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeClass;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class BasePage {
    public static AndroidDriver driver;

    public BasePage(AndroidDriver driver) {
        BasePage.driver = driver;
        PageFactory.initElements(new AppiumFieldDecorator(this.driver, Duration.ofSeconds(30)), this);
        //Generic.wait(10);
    }



    public void pressEnter(){
       driver.pressKey(new KeyEvent(AndroidKey.ENTER));
    }

    public static WebElement scroll(WebDriver driver, String text) {

        // === Android === //
        String automatorString = "new UiScrollable(new UiSelector()).scrollIntoView(new UiSelector().textContains(\""
                + text + "\"));";
        return ((AndroidDriver) driver).findElementByAndroidUIAutomator(automatorString);

    }


    public static void clickText(WebDriver driver, String text){

        driver.findElement(By.xpath("//*[@text='"+text+"']")).click();

    }

}



