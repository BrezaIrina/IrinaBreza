package ua.hillel.test.Homework13;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class DragAndDropTest {
    private WebDriver driver;

    @BeforeClass
    public void setUp() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }

    @Test
    public void dragDropTest() {
        driver.get("https://crossbrowsertesting.github.io/drag-and-drop.html");

        WebElement dragItem = driver.findElement(By.xpath("//div[@id='draggable']"));
        WebElement dropItem = driver.findElement(By.xpath("//div[@id='droppable']"));

        Actions actions = new Actions(driver);
        actions.clickAndHold(dragItem).moveToElement(dropItem).release().build().perform();

        WebElement dropResult = driver.findElement(By.xpath("//div[@id='droppable']/p"));
        Assert.assertTrue(dropResult.getText().contains("Dropped!"), "Try drop again");
    }

    @AfterClass
    public void tearDown() {
        driver.quit();
    }
}
