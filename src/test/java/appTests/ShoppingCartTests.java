package appTests;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import pages.*;

import java.util.ArrayList;

public class ShoppingCartTests extends BaseTests {

    LogInPage loginPage = new LogInPage(driver);

    ProductPage productPage = new ProductPage(driver);

    YourCartPage yourCartPage = new YourCartPage(driver);


    @Before
    public void before () throws InterruptedException {
        driver.get("https://www.saucedemo.com");

        loginPage.enterUserName("standard_user");
        loginPage.enterPassword("secret_sauce");
        loginPage.clickOnLoginButton();
        Thread.sleep(2000);
    }


    @Test
    public void testAddToShoppingCart () throws InterruptedException {

        productPage.addFirstProduct();
        Thread.sleep(2000);
        productPage.addSecondProduct();
        Thread.sleep(2000);
        productPage.goToShoppingCart();
        Thread.sleep(2000);

        String dobijenaStrana= driver.getCurrentUrl();
        String ocekivanaStrana="https://www.saucedemo.com/cart.html";

        Assert.assertTrue("Stranica nije dobra",dobijenaStrana.equals(ocekivanaStrana));

        String firstItemTest = yourCartPage.getFirstItemName();
        System.out.println(firstItemTest);
        String expectedFirstItemText = "Sauce Labs Bike Light";
        Assert.assertTrue(firstItemTest.equals(expectedFirstItemText));


        String secondItemTest = yourCartPage.getSecondItemName();
        System.out.println(secondItemTest);
        String expectedSecondItemText = "Sauce Labs Bolt T-Shirt";
        Assert.assertTrue(secondItemTest.equals(expectedSecondItemText));

    }

    @Test
    public void testRemoveFromShoppingCart () throws InterruptedException {
        productPage.addFirstProduct();
        Thread.sleep(2000);

        productPage.goToShoppingCart();
        Thread.sleep(2000);

        String shoppingCartText = yourCartPage.getShoppingCartContentText();
        System.out.println(shoppingCartText);

        yourCartPage.removeFirstProduct();
        Thread.sleep(2000);

        shoppingCartText = yourCartPage.getShoppingCartContentText();
        System.out.println(shoppingCartText);

        Assert.assertFalse(shoppingCartText.contains("Remove"));

    }

    @Test
    public void testTwitterButton () throws InterruptedException {
        productPage.clickOnTwitterLogo();
        Thread.sleep(2000);
        //https://stackoverflow.com/questions/12729265/switch-tabs-using-selenium-webdriver-with-java
        ArrayList<String> tabs = new ArrayList<String> (driver.getWindowHandles());
        driver.switchTo().window(tabs.get(1));
        Thread.sleep(2000);

        String currentPage = driver. getCurrentUrl();
        String expectedPage = "https://twitter.com/i/flow/login?redirect_after_login=%2Fsaucelabs";
        Assert.assertTrue(currentPage.equals(expectedPage));

    }
        @Test

        public void testFacebookPage () throws InterruptedException {
            productPage.clickOnFacebookLogo();
            Thread.sleep(2000);

            ArrayList<String> tabs = new ArrayList<String> (driver.getWindowHandles());
            driver.switchTo().window(tabs.get(1));
            Thread.sleep(2000);

            String currentPage = driver. getCurrentUrl();
            String expectedPage = "https://www.facebook.com/saucelabs";
            Assert.assertTrue(currentPage.equals(expectedPage));

        }

        @Test
        public void testLinkedinPage () throws InterruptedException {
            productPage.clickOnLinkedinLogo();
            Thread.sleep(2000);

            ArrayList<String> tabs = new ArrayList<String> (driver.getWindowHandles());
            driver.switchTo().window(tabs.get(1));
            Thread.sleep(2000);

            String currentPage = driver. getCurrentUrl();
            String expectedPage = "https://www.linkedin.com/company/sauce-labs/";
            Assert.assertTrue(currentPage.equals(expectedPage));

        }




}
