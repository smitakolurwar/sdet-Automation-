package WebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DriverManager {

public WebDriverManager driver;

    public WebDriver getDriver(String browserName){

        if (browserName.equalsIgnoreCase("firefox")){
            System.out.println("firefox browser created");
            WebDriverManager.firefoxdriver().setup();
            driver = new FirefoxDriver();

        }else if (browserName.equalsIgnoreCase("edge")){
            System.out.println("edge browser created");
            WebDriverManager.edgedriver().setup();
            driver = new EdgeDriver();

            }


            }else
            System.out.println("Chrome browser created");
           driver = new ChromeDriver();
        }

        return driver
    }

