package pages;

import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import javax.xml.xpath.XPath;

public class ProductPage extends BasePage {


    public ProductPage(WebDriver driver) {

        super(driver);
    }

    @AndroidFindBy(xpath = "//*[@text='Search']")
    MobileElement search;

//   @Test
//    public void productPage() throws InterruptedException {
//  items.sendKeys("Alomand 1kg");
//   items.click();
//   Thread.sleep(2000);
//       JavascriptExecutor je = (JavascriptExecutor) driver;
//        je.executeScript("scroll(0,5000)");
//  driver.findElement(MobileBy.xpath("//*[@content-desc=\"Amazon Brand - Vedaka Popular Whole Almonds, 1kg 4.1 out of 5 stars 575 Deal of the Day ₹828(₹82.80/100 g)M.R.P.: ₹1,100Save ₹272 (25%) 5% Instant Discount on ICICI Bank Cards Amazon Pantry Get it by Friday, Oct 2\"]/android.view.View[1]")).click();
//   driver.findElement(MobileBy.xpath("//*[@text='Enter a pincode']")).click();

}

