package SideMenuBar;

import Base.BaseTest;
import PageObjects.LoginPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SideMenuBarTest extends BaseTest {


    @Test
    public void verify_MenuItems_Are_Correctly_Displayed() {

        // Step 1 :Login

        LoginPage loginPage = new LoginPage(driver);
        boolean navigateStatus = loginPage.navigate();
        Assert.assertTrue(navigateStatus);

        loginPage.enterUserName("standard_user");
        loginPage.enterPassword("secret_sauce");
        loginPage.clickLoginBtn();
    }

    //step2 click on menubar






}
