package appTests;

import org.junit.Assert;
import org.junit.Test;
import pages.CheckoutCompletePage;
import pages.CheckoutOverview;
import pages.CheckoutYourInformationPage;

public class PurchaseTests extends ShoppingCartTests{


    CheckoutYourInformationPage checkoutYourInformationPage = new CheckoutYourInformationPage(driver);

    CheckoutOverview checkoutOverview = new CheckoutOverview(driver);
    CheckoutCompletePage checkoutCompletePage = new CheckoutCompletePage(driver);



    @Test
    public void testPurchase() throws InterruptedException {
        this.testAddToShoppingCart();
        yourCartPage.goToChechout();
        Thread.sleep(2000);

        checkoutYourInformationPage.enterFirstName("Milica");
        Thread.sleep(2000);
        checkoutYourInformationPage.enterLastName("Mitic");
        Thread.sleep(2000);
        checkoutYourInformationPage.enterZipCode("11070");
        Thread.sleep(2000);
        checkoutYourInformationPage.clickOnContinue();
        Thread.sleep(2000);
        checkoutOverview.enterFinishButton();
        String thankYouText = checkoutCompletePage.getThankYouTekst();
        System.out.println(thankYouText);
        Thread.sleep(2000);
        String expectedMessage = "Thank you for your order!";
        Assert.assertTrue(thankYouText.equals(expectedMessage));



    }









}
