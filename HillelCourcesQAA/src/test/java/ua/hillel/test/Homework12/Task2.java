package ua.hillel.test.Homework12;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Task2 {

    private WebDriver getDriver() {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/login");
        return driver;
    }

    private void set(String text, String selector, WebDriver driver) {
        WebElement element = driver.findElement(By.cssSelector(selector));
        element.clear();
        element.sendKeys(text);
    }

    @Test
    public void successfulLoginTest() {
        WebDriver driver = getDriver();
        set("tomsmith", "#username", driver);
        set("SuperSecretPassword!","#password", driver);

        driver.findElement(By.cssSelector(".fa-sign-in")).click();
        WebElement successMessage = driver.findElement(By.cssSelector(".flash.success"));
        Assert.assertTrue(successMessage.getText().contains("You logged into a secure area!"), "Invalid username or password");
        driver.quit();
    }

    @Test
    public void incorrectLoginTest() {
        WebDriver driver = getDriver();
        set("tomsmith", "#username", driver);
        set("incorrectPassword","#password", driver);

        driver.findElement(By.cssSelector(".fa-sign-in")).click();
        WebElement errorMessage = driver.findElement(By.cssSelector(".flash.error"));
        Assert.assertTrue(errorMessage.getText().contains("Your password is invalid!"));
        driver.quit();
    }
}
