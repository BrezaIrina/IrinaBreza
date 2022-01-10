package ua.hillel.test.locators;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LocatorTest {
    @Test
    public void locatorTest() {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.get("https://google.com");

        WebElement searchInput = driver.findElement(By.cssSelector("[name='q']"));
        searchInput.clear();
        searchInput.sendKeys("selenium" + Keys.ENTER);

       WebElement resultLink = driver.findElement(By.xpath("//*[@class='g']//a"));

        Assert.assertTrue(resultLink.getText().contains("https://www.selenium.dev"), "Invalid link");

        driver.quit();

    }
}
