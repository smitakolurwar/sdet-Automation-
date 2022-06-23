package Base;

import Webdriver.DriverManager;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseTest {

    public WebDriver driver;

    @BeforeMethod

    public void setup_For_Login() {
     System.out.println("BeforeMethod");

      //open browser
       DriverManager driverManager = new DriverManager();
        driver = driverManager.getDriver("chrome");



       driver.navigate().to("https://www.saucedemo.com/");


    }

    @AfterMethod
    public void cleanup() {
        driver.quit();
    }

}
