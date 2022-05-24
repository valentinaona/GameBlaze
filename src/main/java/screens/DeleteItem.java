package screens;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import utils.CommonSelectors;

public class DeleteItem extends BaseTest {

    private final By deleteButton = By.xpath("//*[@id=\"tbodyid\"]/tr/td[4]/a");


   public DeleteItem(WebDriver driver) {
       this.driver = driver;
   }

   public void deleteItemFromCart() {
       driver.findElement(deleteButton).click();
   }

   public void checkIfTheCartListIsEmpty() {
       Assert.assertTrue(driver.findElement(CommonSelectors.EMPTY_LIST_PAGE).isDisplayed(),
               "The list is not empty!");
   }
}