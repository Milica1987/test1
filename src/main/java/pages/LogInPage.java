package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LogInPage {

    public WebDriver driver;
    public By userNameInputField = By.id("user-name");
    public By passwordInputField = By.id("password");
    public By loginButton = By.id("login-button");
    public By errorMessage= By.xpath("//h3[@data-test=\"error\"]");
    public LogInPage(WebDriver driver) {
        this.driver = driver;
    }
    public void enterPassword (String password){
        driver.findElement(passwordInputField).sendKeys(password);
    }
    public void enterUserName(String username) {
        driver.findElement(userNameInputField).sendKeys(username);
    }

    public void clickOnLoginButton (){
        driver.findElement(loginButton).click();
    }

    public String getErrorMessage(){
        return driver.findElement(errorMessage).getText();
    }



























}
