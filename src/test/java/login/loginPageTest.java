package login;

import Base.BaseTest;
import PageObjects.LoginPage;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class  loginPageTest extends BaseTest {


    @Test

    public void Verify_Login_Working_With_Valid_StandardCredential() {

        String userNameTextField = ("user-name");
        driver.findElement(By.id(userNameTextField)).sendKeys("standard_user");

        String passwordTextField = ("password");
        driver.findElement(By.id(passwordTextField)).sendKeys("secret_sauce");

        String loginButtonId = ("login-button");
        driver.findElement(By.id(loginButtonId)).click();


        String productHeaderTitle = "#header_container > div.header_secondary_container > span";
        String productHeaderActualValue = driver.findElement(By.cssSelector(productHeaderTitle)).getText();
        String productHeaderExpectedValue = "PRODUCTS";

        Assert.assertEquals(productHeaderActualValue, productHeaderExpectedValue);

    }
  // call loginPage Object method form pom
    @Test

    public void Verify_Login_Working_With_Valid_StandardCredential_pom() {
        LoginPage loginPage = new LoginPage(driver);
        boolean navigationStatus = loginPage.navigate();
        Assert.assertTrue(navigationStatus);


        loginPage.enterUserName("abc");
        loginPage.enterPassword("asjj");
        loginPage.clickLoginBtn();

    }




    @Test

     public  void login_Working_With_Invalid_StandardCredential(){

        String userNameTextField = ("user-name");
        driver.findElement(By.id(userNameTextField)).sendKeys("standard_user12");

        String passwordTextField = ("password");
        driver.findElement(By.id(passwordTextField)).sendKeys("secret_sauce");

        String loginButtonId = ("login-button");
        driver.findElement(By.id(loginButtonId)).click();

        //validation

        String invalidLoginErrorMessageXpath = "//*[@id=\"login_button_container\"]/div/form/div[3]/h3";
        String invalidActualLoginErrorMessage = driver.findElement(By.xpath(invalidLoginErrorMessageXpath)).getText();
        String invalidExpectedLoginErrorMessage = "Epic sadface: Username and password do not match any user in this service";

        Assert.assertEquals(invalidActualLoginErrorMessage, invalidExpectedLoginErrorMessage);


    }


    @Test

    public  void login_Working_With_Invalid_StandardCredential_pom(){

        LoginPage loginPage = new LoginPage(driver) {
           login
        }
    }



}




