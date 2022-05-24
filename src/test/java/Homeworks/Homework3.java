package Homeworks;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;
import screens.BaseTest;

public class Homework3 extends BaseTest {

    private static final String URL = "https://www.google.ro";

    @Test
    public void myHomework3UITest() throws InterruptedException {

        driver.get(URL);
        driver.findElement(By.id("L2AGLb")).click();
        driver.findElement(By.name("q")).click();
        driver.findElement(By.name("q")).sendKeys("bitcoin price euro");
        driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@id=\"rso\"]/div[7]/div/div[1]/div/a/h3")).click();
        driver.findElement(By.xpath("/html/body/div[5]/div[7]/div/div[1]/div[2]/div/div[1]/div[2]/a[3]")).click();
        Thread.sleep(20000);

    }

    @AfterClass
    public void tearDown() {
        driver.quit();
    }
}
