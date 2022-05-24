package screens;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import utils.ActionUtils;
import utils.WaitUtils;

import java.util.concurrent.TimeUnit;

public class ContactMessage extends BaseTest {

    public WebDriver driver;
    private final By emailField = By.id("recipient-email");
    private final By nameField = By.id("recipient-name");
    private final By messageField = By.id("message-text");
    private final By clickOnContactBtn = By.xpath("//*[@id=\"navbarExample\"]/ul/li[2]/a");
    private final By sendMessageBtn = By.xpath("//*[@id=\"exampleModal\"]/div/div/div[3]/button[2]");

    public ContactMessage(WebDriver driver) {
        this.driver = driver;
    }

    public void clickOnContactBtn() {
        driver.findElement(clickOnContactBtn).click();
    }
    public void sendMessageBtn() {
        driver.findElement(sendMessageBtn).click();
    }

    public void acceptAlert() {
        driver.switchTo().alert().accept();
    }

    public void checkIfHomeScreenIsDisplayed() {
        Assert.assertTrue(driver.findElement(homeScreen).isDisplayed(),
                "The home screen is not visible!");
    }

    public void userContacts(String email, String name, String message) {
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.findElement(emailField).sendKeys(email);
        driver.findElement(nameField).sendKeys(name);
        driver.findElement(messageField).sendKeys(message);
    }

    public static class BaseTest {

        protected WebDriver driver;
        public static final String URL = "https://www.demoblaze.com/index.html";
        protected WebDriverWait wait;
        protected LogIn logIn;
        protected ContactMessage contactMessage;
        protected Purchase purchase;
        protected AboutUs aboutUs;
        protected DeleteItem deleteItem;
        protected WaitUtils waitUtils;
        protected ActionUtils clickElement;

        @BeforeClass
        public void setup() {
            //here you set the driver binary
            System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver");
            //in this step you have initiated the chrome driver
            driver = new ChromeDriver();
            driver.get(URL);
            driver.manage().window().maximize();
            wait = new WebDriverWait(driver, 10);
            logIn = new LogIn(driver);
            contactMessage = new ContactMessage(driver);
            purchase = new Purchase(driver);
            aboutUs = new AboutUs(driver);
            deleteItem = new DeleteItem(driver);
            waitUtils = new WaitUtils(driver);
        }

        @AfterClass
        public void tearDown() {
            driver.quit();
        }
    }
}