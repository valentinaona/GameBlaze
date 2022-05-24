package screens;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utils.WaitUtils;

import java.util.concurrent.TimeUnit;

public class Purchase extends BaseTest {

    private final By phone = By.linkText("Samsung galaxy s7");
    protected final By addToCard = By.linkText("Add to cart");
    protected final By cart = By.id("cartur");
    private final By placeOrder = By.xpath("//*[@id=\"page-wrapper\"]/div/div[2]/button");
    public final By purchaseBtn = By.xpath("//*[@id=\"orderModal\"]/div/div/div[3]/button[2]");
    private final By nameField = By.id("name");
    private final By countryField = By.id("country");
    private final By cityField = By.id("city");
    private final By cardField = By.id("card");
    private final By monthField = By.id("month");
    private final By yearField = By.id("year");
    private WaitUtils waitUtils;

    public Purchase(WebDriver driver) {
        this.driver = driver;
        waitUtils = new WaitUtils(driver);
    }

    public void clickOnPhoneBtn() {
        waitUtils.waitForElementVisibility(phone);
        driver.findElement(phone).click();
    }

    public void clickOnAddToCart() {
        driver.findElement(addToCard).click();
    }

    public void clickOnCart() {
        driver.findElement(cart).click();
    }

    public void clickOnPurchaseBtn() {
        driver.findElement(purchaseBtn).click();
    }

    public void clickOnThankYouBtn() {
        driver.findElement(thankYou).click();
    }

    public void clickOnPlaceOrder() {
        driver.findElement(placeOrder).click();
    }

    public void userData(String name, String country, String city, String card, String month, String year) {
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.findElement(nameField).sendKeys(name);
        driver.findElement(countryField).sendKeys(country);
        driver.findElement(cityField).sendKeys(city);
        driver.findElement(cardField).sendKeys(card);
        driver.findElement(monthField).sendKeys(month);
        driver.findElement(yearField).sendKeys(year);
    }

}

