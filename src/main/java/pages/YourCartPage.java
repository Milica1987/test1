package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class YourCartPage {

    public WebDriver driver;

    public By chechout = By.xpath("//button[@data-test=\"checkout\"]");

    public By removeFirstProductButton = By.xpath("//button[@data-test=\"remove-sauce-labs-bike-light\"]");

    public By shoppingCartContent = By.id("cart_contents_container");

    public By firstItem = By.xpath("//a[@id='item_0_title_link']");

    public By secondItem = By.xpath("//a[@id='item_1_title_link']");

    public String getFirstItemName (){
        return driver.findElement(firstItem).getText();
    }

    public String getSecondItemName(){
        return driver.findElement(secondItem).getText();
    }

    public YourCartPage(WebDriver driver) {
        this.driver = driver;
    }

    public void goToChechout(){
        driver.findElement(chechout).click();
    }


    public void removeFirstProduct (){
        driver.findElement(removeFirstProductButton).click();
    }

    public String getShoppingCartContentText(){
        return driver.findElement(shoppingCartContent).getText();
    }





}
