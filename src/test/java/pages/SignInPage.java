package pages;

import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import org.openqa.selenium.WebDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class SignInPage extends BasePage {
    public static AndroidDriver driver;

    public SignInPage(AndroidDriver driver) {
        super(driver);

    }

    @AndroidFindBy(xpath = "//*[@text='Skip sign in']")
    MobileElement skip_sign_in;

    @AndroidFindBy(xpath = "//*[@text='Already a customer? Sign in']")
    MobileElement sign_in;

    @AndroidFindBy(xpath = "//*[@content-desc='Continue in English']")
    MobileElement englishLang;


    public void skipSignIn(){
        Reporter.log("User is Selecting English");
        englishLang.click();
        Reporter.log("User is skipping sign in!");
        skip_sign_in.click();
    }




}

