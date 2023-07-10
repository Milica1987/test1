package appTests;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BaseTests {
    public static WebDriver driver;

    @BeforeClass
    public static void beforeClass(){
        WebDriverManager.firefoxdriver().setup();
        driver=new FirefoxDriver();
        driver.manage().window().maximize();
    }

    @AfterClass
    public static void afteClass(){
        driver.quit();
    }















}
