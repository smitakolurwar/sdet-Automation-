package PageObjects;

import dev.failsafe.internal.util.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ProductsPage {


    // define local driver
    private WebDriver driver;

    //constructor with paramater

    public ProductsPage(WebDriver driver){
    this.driver=driver;
    }


    //create datatype

    private By logoImage = By.xpath("//*[@id=\"header_container\"]/div[1]/div[2]/div");

    private By sideMenuBar = By.xpath("//*[@id=\"react-burger-menu-btn\"]");

    private  By cartBtn = By.xpath("//*[@id=\"shopping_cart_container\"]/a");

    private By productsHeaderText = By.xpath("//*[@id=\"header_container\"]/div[2]/span");

    private  By roboImg = By.xpath("//*[@id=\"header_container\"]/div[2]/div[1]");

    private By sortList = By.xpath("//*[@id=\"header_container\"]/div[2]/div[2]/span/select");

    private By Footer = By.xpath("//*[@id=\"page_wrapper\"]/footer/img");



// methods for behaviour page

    public boolean navigate(){

        driver.navigate().to("https://www.saucedemo.com/inventory.html");
        boolean status = driver.findElement(productsHeaderText).isDisplayed();
        return status;

    }

     public  boolean isPageDisplayed(){
        boolean displyedFlag = driver.findElement(productsHeaderText).isDisplayed();
         return displyedFlag;


     }



}