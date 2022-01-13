package ua.hillel.test.actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class ImplicitWaitTest {
    @Test()
    public void implWaitTest() {
        WebDriver driver = new ChromeDriver();

        WebDriverWait webDriverWait = new WebDriverWait(driver, 10);


    }
}
