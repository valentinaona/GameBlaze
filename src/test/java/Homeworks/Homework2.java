package Homeworks;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;
import screens.BaseTest;

public class Homework2 extends BaseTest {

    @Test
    public void myHomeworkUiTest() throws InterruptedException {
        driver.get("https://www.google.ro");
        driver.findElement(By.id("L2AGLb")).click();
        driver.findElement(By.name("q")).click();
        driver.findElement(By.name("q")).sendKeys("Youtube");
        driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
        // driver.findElement(By.name("q")).sendKeys(Keys.CLEAR);
        /* driver.findElement(By.name("q")).clear(); clear a line */
        Thread.sleep(2000); // inseamna ca programul asteapta 2 secunde sa se incarca pagina
        driver.findElement(By.xpath("//*[@id=\"rso\"]/div[1]/div/div/div/div/div/div/div[1]/a/h3")).click();
        driver.findElement(By.cssSelector("#video-title")).click();
        Thread.sleep(20000);
    }

    @AfterClass
    public void tearDown() {
        driver.quit();
    }
}




