package pages;

import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class SignInPage extends BasePage {
    public static AndroidDriver driver;

    public SignInPage(WebDriver driver) {
        super(driver);

    }
  @AndroidFindBy(xpath = "//*[@text='Skip sign in']")
    MobileElement sign_in;



    }

