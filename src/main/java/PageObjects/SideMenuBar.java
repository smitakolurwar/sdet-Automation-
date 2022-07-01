package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;

public class SideMenuBar {


    private WebDriver driver;

    public SideMenuBar(WebDriver driver){
        this.driver=driver;
    }

    public void clickMenuBar(){
        driver.findElement(sideMenuBar).click();
    }
 // create datatype

        private  By menuBarList = By.xpath("//*[@id=\"menu_button_container\"]/div/div[2]/div[1]/nav");

        private  By sideMenuBar = By.xpath("//*[@id=\"menu_button_container\"]/div/div[2]/div[1]");

        private By allItemsLink = By.xpath("//*[@id=\"inventory_sidebar_link\"]");

    private By aboutLink = By.xpath("//*[@id=\"about_sidebar_link\"]");

    private By logoutLink = By.xpath("//*[@id=\"logout_sidebar_link\"]");

    private  By resetAppStateLink = By.xpath("//*[@id=\"reset_sidebar_link\"]");

    private  By closeMenuBtn = By.xpath("//*[@id=\"react-burger-cross-btn\"]");


    // methods for behaviour

    public  boolean navigate(){

        driver.navigate().to("https://www.saucedemo.com/inventory.html");
        boolean status = driver.findElement(allItemsLink).isDisplayed();
        return status;

    }

    public boolean isallItemsLink (){

        boolean displayFlag = driver.findElement(allItemsLink).isDisplayed();
        return displayFlag;
    }

    public boolean isaboutLink (){

        boolean displayFlag = driver.findElement(aboutLink).isDisplayed();
        return displayFlag;
    }

    public boolean islogoutLink (){

        boolean displayFlag = driver.findElement(logoutLink).isDisplayed();
        return displayFlag;

    }

    public boolean isresetAppStateLink (){

        boolean displayFlag = driver.findElement(resetAppStateLink).isDisplayed();
        return displayFlag;

    }

    public void clickcloseMenuBtn (){

      driver.findElement(closeMenuBtn).click();

    }
      public List<WebElement> getMenuItems(){
      List<WebElement> menuList = new ArrayList<>();
      return driver.findElements(menuBarList);

    }


  }
