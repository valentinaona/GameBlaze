package screens;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AboutUs extends BaseTest{

    public WebDriver driver;
    public final By aboutUsPage = By.xpath("//*[@id=\"navbarExample\"]/ul/li[3]/a");
    public final By playButton = By.xpath("//*[@id=\"example-video\"]/button");
    public final By openFullScreen = By.xpath("//*[@id=\"example-video\"]/div[4]/button[4]");
    public final By closeFullScreen = By.xpath("//*[@id=\"example-video\"]/div[4]/button[4]");
    public final By closeAboutUs = By.id("videoModal");

    public AboutUs(WebDriver driver) {
        this.driver = driver;
    }

    public void clickOnAboutUs() {
        driver.findElement(aboutUsPage).click();
    }

    public void clickOnPlay() {
        driver.findElement(playButton).click();
    }

    public void clickOnFullScreen() {
        driver.findElement(openFullScreen).click();
    }

    public void clickOnCloseFullScreen() {
        driver.findElement(closeFullScreen).click();
    }

    public void closeAboutUsPage() {
        driver.findElement(closeAboutUs).click();
    }
}