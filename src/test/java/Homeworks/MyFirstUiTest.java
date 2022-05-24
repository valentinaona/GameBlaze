package Homeworks;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;

public class MyFirstUiTest {

    private WebDriver driver;

    @Test
    public void myFirstUiTest() throws InterruptedException {
        //here you set the driver binary
        System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver");
        //in this step you have initiated the chrome driver
        driver = new ChromeDriver();
        driver.get("https://www.google.ro");
        driver.findElement(By.id("L2AGLb")).click();
        driver.findElement(By.name("q")).click();
        driver.findElement(By.name("q")).sendKeys("This is my first test");
        driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
       // driver.findElement(By.name("q")).sendKeys(Keys.CLEAR);
        /* driver.findElement(By.name("q")).clear(); clear a line */
        Thread.sleep(2000); // inseamna ca programul asteapta 2 secunde sa se incarca pagina

    }
//    @AfterClass
//    public void tearDown() {
//        driver.quit();
//    }
}
