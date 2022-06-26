package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {

    WebDriver driver;

    //step1 create datatype

    private By userNameTextField = By.id(("user-name"));

    private By passwordTextField = By.id("password");

    private By loginButtonID = By.id("login-button");

    private By productHeaderTitle = By.cssSelector("#header_container > div.header_secondary_container > span");

    private By robotImage = By.xpath("//*[@id=\"root\"]/div/div[2]/div[1]/div[2]");

    private By logo = By.xpath("//*[@id=\"root\"]/div/div[1]");

    private By errorMessageText = By.xpath("//*[@id=\"login_button_container\"]/div/form/div[3]/h3");

    //step2 user action

    public boolean navigate(){

        driver.navigate().to(" https://www.saucedemo.com/");
        boolean status = driver.findElement(robotImage).isDisplayed();
        return status;
    }

   public void enterUserName(String username) { driver.findElement(userNameTextField).sendKeys(username);}

    public void enterPassword(String password){ driver.findElement(passwordTextField).sendKeys(password);}
}
