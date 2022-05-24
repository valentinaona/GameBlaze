package utils;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class WaitUtils {
    /**
     * wait utils
     */

    private WebDriver driver;
    private WebDriverWait wait;

    public WaitUtils(WebDriver driver) {
        this.driver = driver;
        wait = new WebDriverWait(driver, 10);
    }

    public void waitForElementVisibility(By elementToFind) {
        wait.until(ExpectedConditions.visibilityOfElementLocated(elementToFind));
    }
    public void timeOut() {
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }
}
