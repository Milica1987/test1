package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ProductPage {
    public WebDriver driver;

    public By addFirstProductButton = By.id("add-to-cart-sauce-labs-bike-light");

    public By addSecondProductButton = By.id("add-to-cart-sauce-labs-bolt-t-shirt");

    public By shoppingCart = By.id("shopping_cart_container");

    public By twitterLogo = By.xpath("//a[@href=\"https://twitter.com/saucelabs\"]");

    public By facebookLogo=By.xpath("//a[@href=\"https://www.facebook.com/saucelabs\"]");

    public By linkedinLogo=By.xpath("//a[@href=\"https://www.linkedin.com/company/sauce-labs/\"]");


    public ProductPage(WebDriver driver) {
        this.driver = driver;
    }

    public void addFirstProduct(){
        driver.findElement(addFirstProductButton).click();
    }
    public void addSecondProduct(){
      driver.findElement(addSecondProductButton).click();
    }

    public void goToShoppingCart(){
        driver.findElement(shoppingCart).click();
    }

    public void clickOnTwitterLogo (){
       driver.findElement(twitterLogo).click();

    }
    public void clickOnFacebookLogo (){
        driver.findElement(facebookLogo).click();
    }

    public void clickOnLinkedinLogo(){
        driver.findElement(linkedinLogo).click();
    }




}
