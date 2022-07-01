package product;

import Base.BaseTest;
import PageObjects.LoginPage;
import PageObjects.ProductsPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ProductPageTest extends BaseTest {


    @Test
    public void verify_Products_Header_Title_Is_Displayed() {

        LoginPage loginpage = new LoginPage(driver);
        boolean navigationStatus = loginpage.navigate();
        Assert.assertTrue(navigationStatus);

        loginpage.enterUserName("standard_user");
        loginpage.enterPassword("secret_sauce");
        loginpage.clickLoginBtn();

        ProductsPage productsPage = new ProductsPage(driver);
        boolean Status = productsPage.isPageDisplayed();
        Assert.assertTrue(Status);

    }
}
