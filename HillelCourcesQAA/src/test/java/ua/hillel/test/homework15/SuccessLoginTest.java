package ua.hillel.test.homework15;

import org.testng.Assert;
import org.testng.annotations.Test;

public class SuccessLoginTest extends BaseTest {

    @Test
    public void loginTest() {

        String alertText = openApp()
                .goToLoginPage()
                .setUsername("tomsmith")
                .setPassword("SuperSecretPassword!")
                .clickLoginButton()
                .getAlertText();

        Assert.assertTrue(alertText.contains("You logged into a secure area!"));
    }
}
