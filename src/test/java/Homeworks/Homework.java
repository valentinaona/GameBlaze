package Homeworks;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import java.util.ArrayList;
import java.util.List;
    public class Homework {

        String username = "bla bla";
        List<String> users = new ArrayList<>();
        int initialNumber;
        boolean status = true;
        @BeforeClass
        public void setUp() {
            users.add("Aura");
            users.add("Valentina");
            users.add("Claudia");
            users.add("Georgiana");
        }

        @Test
        public void checkName() {
            Assert.assertEquals(username, "bla bla");
        }

        @Test
        public void checkNameLength() {
            Assert.assertEquals(username.length(), 7);
            Assert.assertFalse(username.isEmpty());
        }

        @Test
        public void checkList() {
            Assert.assertFalse(username.isEmpty());
            Assert.assertFalse(users.contains("Alex"));
        }

        @Test
        public void checkAgainList() {
            Assert.assertNotSame(users.get(0), "Bla bla");
         //   Assert.assert(users.get(12), "Bla bla");
        }

        @Test
        public void assertInitialNumber() {
            Assert.assertFalse(initialNumber > 10);
        }

        @Test
        public void assertStatus() {
            Assert.assertTrue(status);
        }
    }

