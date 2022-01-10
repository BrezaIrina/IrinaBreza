package ua.hillel.test.Homework12;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class Task3 {
    @Test
    public void geolocationTest() {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.get("https://the-internet.herokuapp.com/geolocation");


        WebElement geolocationButton = driver.findElement(By.xpath("//button[@onclick='getLocation()']"));
        geolocationButton.click();
        driver.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);

        WebElement latitudeResult = driver.findElement(By.xpath("//div[@id='lat-value']"));
        String latitudeValue = latitudeResult.getText();
        System.out.println("Latitude: " + latitudeValue);
        WebElement longitudeResult = driver.findElement(By.xpath("//div[@id='long-value']"));
        String longitudeValue = longitudeResult.getText();
        System.out.println("Longitude: " + longitudeValue);

        driver.quit();
    }
}
