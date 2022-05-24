package Homeworks;

import org.testng.Assert;
import org.testng.annotations.*;

public class MyFirstTest {
    @BeforeClass
    public void setUpPreconditions() {
        System.out.println("Set up preconditions step");
    }

    @BeforeMethod
    public void actionBeforeMethod() {
        System.out.println("This is an action before method");
    }

    @Test
    public void myFirstTest() {
        System.out.println("This is my first test!");
    }

    @Test
    public void MySecondTest() {
        System.out.println("This is my second test!");
    }

    @Test
    public void thisIsMyRealFirstTest () {
        int sum = 4;
        Assert.assertEquals(sum,4, "This is a message when the test falls");
        //Assert.assertEquals(sum,3);
    }

    @Test
    public void assertName() {
        String name = "Alex Kispal";
        boolean status = true;
        Assert.assertTrue(name.contains("Alex"));
        Assert.assertTrue(status);
    }

    @AfterMethod
    public void actionAfterMethod() {
        System.out.println("This is an action after method");
    }

    @AfterClass
    public void tearDown() {
        System.out.println("We're closing the app");
    }
}
