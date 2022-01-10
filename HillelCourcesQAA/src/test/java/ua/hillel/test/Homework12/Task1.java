package ua.hillel.test.Homework12;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.util.List;

public class Task1 {
    @Test
    public void clickButtonTest() {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.get("https://the-internet.herokuapp.com/challenging_dom");
        driver.findElement(By.xpath("//a[@class='button']")).click();
        driver.findElement(By.xpath("//a[@class='button alert']")).click();
        driver.findElement(By.xpath("//a[@class='button success']")).click();

        List<WebElement> elements = driver.findElements(By.xpath("//tr/td[4]"));
        for (WebElement element: elements) {
            String elementText = element.getText();
            System.out.println(elementText);
        }
        driver.quit();
    }
}
