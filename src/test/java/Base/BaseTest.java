package Base;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.sql.DriverManager;

public class BaseTest {

    public WebDriver driver;

    @BeforeMethod

    public void setup_For_Login() {
/       System.out.println("BeforeMethod");

//open browser
        DriverManager driverManager = new DriverManager()
//        System.setProperty("webdriver.chrome.driver","C:\\Users\\amit_\\IdeaProjects\\sdet-Automation-project\\Driver\\chromedriver.exe");
//        WebDriverManager.chromedriver().setup();
//        driver = new ChromeDriver();




        driver.navigate().to("https://www.saucedemo.com/");


    }

    @AfterMethod
    public void cleanup() {
        driver.quit();
    }

}
