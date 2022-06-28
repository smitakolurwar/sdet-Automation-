package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ProductsPage {

    //create datatype

    private By logoImage = By.xpath("//*[@id=\"header_container\"]/div[1]/div[2]/div");

    private By sideMenuBar = By.xpath("//*[@id=\"react-burger-menu-btn\"]");

    private  By cartBtn = By.xpath("//*[@id=\"shopping_cart_container\"]/a");

    private By productsTitle = By.xpath("//*[@id=\"header_container\"]/div[2]/span");

    private  By roboImg = By.xpath("//*[@id=\"header_container\"]/div[2]/div[1]");

    private By sortList = By.xpath("//*[@id=\"header_container\"]/div[2]/div[2]/span/select");

    private By botFooter = By.xpath("//*[@id=\"page_wrapper\"]/footer/img");

    private By twitter = By.xpath("//*[@id=\"page_wrapper\"]/footer/ul/li[1]/a");

    private  By facebook = By.xpath("//*[@id=\"page_wrapper\"]/footer/ul/li[2]/a");

    private By linkedIn = By.xpath("//*[@id=\"page_wrapper\"]/footer/ul/li[3]/a");





}