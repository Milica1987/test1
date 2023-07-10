package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CheckoutYourInformationPage {
    public WebDriver driver;

    public By firstNameInput = By.xpath("//input[@data-test=\"firstName\"]");
    public By lastNameInput = By.xpath("//input[@data-test=\"lastName\"]");

    public By zipCodeInput = By.xpath("//input[@data-test=\"postalCode\"]");

    public By continueButton = By.xpath("//input[@data-test=\"continue\"]");


    public CheckoutYourInformationPage(WebDriver driver) {
        this.driver = driver;
    }

    public void enterFirstName (String firstName){
        driver.findElement(firstNameInput).sendKeys(firstName);
    }

    public void enterLastName (String lastName){
        driver.findElement(lastNameInput).sendKeys(lastName);
    }

    public void enterZipCode (String zipCode) {
        driver.findElement(zipCodeInput).sendKeys(zipCode);
    }

    public void clickOnContinue (){
        driver.findElement(continueButton).click();

    }






}
