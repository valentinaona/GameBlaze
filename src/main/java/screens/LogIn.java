package screens;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utils.TestDataUtils;

import java.util.concurrent.TimeUnit;

public class LogIn extends BaseTest {

    public WebDriver driver;
    public final By clickOnLogin = By.id("login2");
    private final By submitButton = By.xpath("//*[@id=\"logInModal\"]/div/div/div[3]/button[2]");
    //private final By logIn = By.linkText("Log in");
    private final By homeScreenBtn = By.xpath("//*[@id=\"nava\"]");

    public LogIn(WebDriver driver) {
        this.driver = driver;
    }

    public void clickOnLogout() {
        driver.findElement(logOutButton).click();
    }

   // public void checkIfLogInButtonIsDisplayed() {
    //    Assert.assertTrue(driver.findElement(logIn).isDisplayed(),
   //             "The log out button is not visible!");
    //}

    public void userCredentials(String username, String password) {
        driver.findElement(clickOnLogin).click();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.findElement(TestDataUtils.USERNAMEFIELD).sendKeys(username);
        driver.findElement(TestDataUtils.PASSWORDFIELD).sendKeys(password);
        driver.findElement(submitButton).click();
    }

    public void tapOnHomeScreenBtn (){
        driver.findElement(homeScreenBtn).click();
    }
}
