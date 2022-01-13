package ua.hillel.test.Homework13;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class HoverUserNameTest {
    private WebDriver driver;

    @BeforeClass
    public void setUp() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }

    @Test
    public void getUserNameTest() {
        driver.get("https://the-internet.herokuapp.com/hovers");


        List<WebElement> userAvatars = driver.findElements(By.xpath("//div[@class='figure']"));
        for (WebElement avatar : userAvatars) {
            Actions actions = new Actions(driver);
            actions.moveToElement(avatar).perform();
            List<WebElement> userNames = driver.findElements(By.xpath("//div[@class='figcaption']/h5"));
            for (WebElement userName : userNames) {
                if (!userName.getText().isEmpty()) {
                    System.out.println(userName.getText());
                }
            }
        }
    }

    @AfterClass
    public void tearDown() {
        driver.quit();
    }
}

