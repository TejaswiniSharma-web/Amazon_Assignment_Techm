package pages;

import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import javax.xml.xpath.XPath;
import java.util.List;

public class ProductPage extends BasePage {


    public ProductPage(AndroidDriver driver) {

        super(driver);
    }



    public void selectProduct(){
        List<MobileElement> brand =driver.findElements(MobileBy.xpath("//*[contains(@text,'Amazon Brand')]"));
        brand.get(0).click();
    }



}

