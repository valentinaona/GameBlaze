package utils;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ActionUtils {

    private WebDriver driver;
    private WaitUtils waitUtils;

    public ActionUtils(WebDriver driver) {
        this.driver = driver;
        waitUtils = new WaitUtils(driver);
    }

    public void clickOnElement(By elementToClick) {
        waitUtils.waitForElementVisibility(elementToClick);
        driver.findElement(elementToClick).click();
    }
}
