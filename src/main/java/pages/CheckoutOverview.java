package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CheckoutOverview {
    public WebDriver driver;

    public By finishButton = By.xpath("//button[@data-test=\"finish\"]");

    public CheckoutOverview(WebDriver driver) {
        this.driver = driver;
    }

    public void enterFinishButton (){
        driver.findElement(finishButton).click();

    }





}
