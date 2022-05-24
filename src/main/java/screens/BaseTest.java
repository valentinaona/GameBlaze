package screens;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import utils.ActionUtils;
import utils.WaitUtils;

public class BaseTest {

    protected WebDriver driver;
    protected final By homeScreen = By.xpath("/html/body");
    protected final By logOutButton = By.linkText("Log out");
    protected final By thankYou = By.xpath("/html/body/div[10]/div[7]/div/button");
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
        clickElement = new ActionUtils(driver);
    }

    @AfterClass
    public void tearDown() {
        driver.quit();
    }
}
