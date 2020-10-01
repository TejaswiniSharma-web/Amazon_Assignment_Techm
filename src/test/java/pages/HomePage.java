package pages;

import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class HomePage  extends BasePage {
    public HomePage(WebDriver driver) {
        super(driver);
    }

    @AndroidFindBy(xpath = "//*[@content-desc=\"Continue in English\"]")
    MobileElement engLang;

    @Test
    public void openHomePage() throws InterruptedException {

    driver.findElement(MobileBy.xpath("//*[@content-desc=\"Continue in English\"]")).click();

    Thread.sleep(2000);

    }
}
