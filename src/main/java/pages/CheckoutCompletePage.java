package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CheckoutCompletePage {

    public WebDriver driver;

    public By thankYouTag = By.tagName("h2");

    public CheckoutCompletePage(WebDriver driver) {
        this.driver = driver;
    }

    public String getThankYouTekst (){
        return driver.findElement(thankYouTag).getText();
    }





}
