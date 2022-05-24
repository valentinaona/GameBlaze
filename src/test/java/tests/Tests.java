package tests;

import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.Test;
import screens.ContactMessage;
import utils.CommonSelectors;

public class Tests extends ContactMessage.BaseTest {

    @Test(description = "Verify if user is able to login!")
    public void verifyLogIn() throws InterruptedException {
        waitUtils.timeOut();
        logIn.userCredentials("admin", "admin");
        waitUtils.timeOut();
        waitUtils.waitForElementVisibility(CommonSelectors.LOG_OUT_BUTTON);
       // clickElement.clickOnElement(CommonSelectors.LOG_OUT_BUTTON);
        logIn.clickOnLogout();
        clickElement.clickOnElement(CommonSelectors.LOG_IN);
       // logIn.checkIfLogInButtonIsDisplayed();
       // clickElement.clickOnElement(CommonSelectors.LOG_IN);
        //clickElement.clickOnElement(CommonSelectors.HOME_SCREEN);
        logIn.tapOnHomeScreenBtn();
        driver.navigate().refresh();
    }


    @Test(description = "Verify if user is able to see the about us page!")
    public void openAboutUsPage() throws InterruptedException {
        aboutUs.clickOnAboutUs();
        waitUtils.timeOut();
        aboutUs.clickOnPlay();
        Thread.sleep(4000);
        aboutUs.clickOnFullScreen();
        aboutUs.clickOnCloseFullScreen();
        aboutUs.closeAboutUsPage();
        contactMessage.checkIfHomeScreenIsDisplayed();
        driver.navigate().refresh();
    }

    @Test(description = "Verify if user is able to send a contact message!")
    public void sendMessageContact() throws InterruptedException {
        contactMessage.clickOnContactBtn();
        waitUtils.timeOut();
        contactMessage.userContacts("admin@gmail.com", "admin", "hello, world!");
        waitUtils.timeOut();
        contactMessage.sendMessageBtn();
        waitUtils.timeOut();
        contactMessage.acceptAlert();
        waitUtils.timeOut();
        waitUtils.waitForElementVisibility(CommonSelectors.HOME_SCREEN);
        contactMessage.checkIfHomeScreenIsDisplayed();
        driver.navigate().refresh();

    }

    @Test(description = "Verify if user is able to delete the item from cart!")
    public void deleteItemFromCart() throws InterruptedException {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(20000,0)");
        logIn.tapOnHomeScreenBtn();
        waitUtils.timeOut();
        purchase.clickOnPhoneBtn();
        waitUtils.timeOut();
        purchase.clickOnAddToCart();
        waitUtils.timeOut();
        Thread.sleep(4000);
        contactMessage.acceptAlert();
        waitUtils.timeOut();
        purchase.clickOnCart();
        Thread.sleep(4000);
        deleteItem.deleteItemFromCart();
        waitUtils.timeOut();
        waitUtils.waitForElementVisibility(CommonSelectors.EMPTY_LIST_PAGE);
        deleteItem.checkIfTheCartListIsEmpty();
        driver.navigate().refresh();
    }

    @Test(description = "Verify if user is able to buy a phone!")
    public void buyPhone() throws InterruptedException {
        waitUtils.timeOut();
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(20000,0)");
        waitUtils.timeOut();
        purchase.clickOnPhoneBtn();
        purchase.clickOnAddToCart();
        Thread.sleep(4000);
        contactMessage.acceptAlert();
        purchase.clickOnCart();
        waitUtils.timeOut();
        purchase.clickOnPlaceOrder();
        purchase.userData("admin", "Romania", "cluj", "0000000000000000", "05", "2023");
        purchase.clickOnPurchaseBtn();
        purchase.clickOnThankYouBtn();
        waitUtils.waitForElementVisibility(CommonSelectors.THANK_YOU);
        contactMessage.checkIfHomeScreenIsDisplayed();
        driver.navigate().refresh();
    }
}
