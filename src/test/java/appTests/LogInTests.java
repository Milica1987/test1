package appTests;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import pages.LogInPage;



    public class LogInTests extends BaseTests {

        LogInPage loginPage = new LogInPage(driver);

        @Before
        public void before (){
            driver.get("https://www.saucedemo.com");
        }

        @Test
        public void testLoginWithWalidUserNamePassword () throws InterruptedException {
            loginPage.enterUserName("standard_user");
            loginPage.enterPassword("secret_sauce");
            loginPage.clickOnLoginButton();
            Thread.sleep(3000);
            String zeljeniUrl= "https://www.saucedemo.com/inventory.html";
            String dobijeniUrl= driver.getCurrentUrl();
            Assert.assertTrue("Login sa očekivanim parametrima nije uspeo",zeljeniUrl.equals(dobijeniUrl));

        }

        @Test
        public void testLoginWithInvalidUserName() throws InterruptedException {
            loginPage.enterUserName("aaaa");
            loginPage.enterPassword("secret_sauce");
            loginPage.clickOnLoginButton();
            Thread.sleep(3000);
            String ocekivaniTekstGreske= "Epic sadface: Username and password do not match any user in this service";
            String stvarniTekstGreske=loginPage.getErrorMessage();
            Assert.assertTrue("Nije pronađen tekst greske",ocekivaniTekstGreske.equals(stvarniTekstGreske));

        }

        @Test
        public void testLoginWithInvalidPassword() throws InterruptedException {
        loginPage.enterUserName("standard_user");
        loginPage.enterPassword("aaaa");
        loginPage.clickOnLoginButton();
        Thread.sleep(3000);
        String ocekivaniTekstGreske = "Epic sadface: Username and password do not match any user in this service";
        String stvarniTekstGreske= loginPage.getErrorMessage();
        Assert.assertTrue("Nije pronađen tekst greske",ocekivaniTekstGreske.equals(stvarniTekstGreske));

        }

        @Test
        public void testLoginWithInvalidUserNamePassword() throws InterruptedException {
          loginPage.enterUserName("aaaa");
          loginPage.enterPassword("aaaa");
          loginPage.clickOnLoginButton();
          Thread.sleep(3000);
          String ocekivaniTekstGreske = "Epic sadface: Username and password do not match any user in this service";
          String stvarniTekstGreske= loginPage.getErrorMessage();
          Assert.assertTrue("Nije pronađen tekst greske",ocekivaniTekstGreske.equals(stvarniTekstGreske));



        }


    }
