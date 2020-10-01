package pages;

import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class HomePage  extends BasePage {
    public HomePage(AndroidDriver driver) {
        super(driver);
    }

    @AndroidFindBy(id ="in.amazon.mShop.android.shopping:id/rs_search_src_text")
    MobileElement search;



    public void searchProduct(String product){
        Reporter.log("User is searching "+ product);
        search.click();
        search.sendKeys(product);
        pressEnter();
    }


}
