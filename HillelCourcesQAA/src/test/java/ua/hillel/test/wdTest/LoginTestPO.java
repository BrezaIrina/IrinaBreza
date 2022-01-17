package ua.hillel.test.wdTest;

import com.irinabreza.hillel.pageObjects.LoginPage;
import com.irinabreza.hillel.pageObjects.MainPage;
import com.irinabreza.hillel.pageObjects.SecurePage;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class LoginTestPO extends BaseTest {

    @Test
    public void loginTest() {

        SecurePage securePage = openApp().goToLoginPage()
                .setUsername("tomsmith")
                .setPassword("SuperSecretPassword!")
                .clickLoginButton();
        String alertText = securePage.getAlertText();

        securePage.logout();

        Assert.assertTrue(alertText.contains("You logged into a secure area!"));
    }
}
