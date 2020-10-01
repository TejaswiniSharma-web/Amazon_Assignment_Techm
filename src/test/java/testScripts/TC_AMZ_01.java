package testScripts;

import org.testng.annotations.Test;
import pages.HomePage;
import pages.ProductPage;
import pages.SignInPage;
import utilities.ReUsables;

public class TC_AMZ_01 extends BaseTest{

    /**
     * This testcase is for searching product using search
     */

    @Test
    public void tc001(){
        SignInPage sign = new SignInPage(driver);
        sign.skipSignIn();
        HomePage hp = new HomePage(driver);
        hp.searchProduct(ReUsables.getValue("search"));
        ProductPage pp = new ProductPage(driver);
        pp.selectProduct();
    }



}
