package ua.hillel.test.homework15;

import com.irinabreza.hillel.pageObjects.homework15.LoginPageHW15;
import org.testng.Assert;
import org.testng.annotations.Test;

public class InvalidLoginTest extends BaseTest {

        @Test
        public void loginTest() {
            String errorMessage = openApp()
                    .goToLoginPage()
                    .invalidLogin("tomsmith", "tomsmith")
                    .getErrorMessage();
            Assert.assertTrue(errorMessage.contains("Your password is invalid!"));
        }
    }

