package ua.hillel.test.Homework13;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class SecondaryActionTest {
    private WebDriver driver;

    @BeforeClass
    public void setUp() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }

    @Test
    public void secondaryActionTest() {
        driver.get("https://crossbrowsertesting.github.io/hover-menu.html");
        WebElement dropdownMenu = driver.findElement(By.xpath("//li[@class='dropdown']/a[@class='dropdown-toggle']"));
        Actions actions = new Actions(driver);
        actions.moveToElement(dropdownMenu).perform();

        WebElement secondaryMenu = driver.findElement(By.xpath("//li[@class='secondary-dropdown']/a[@class='dropdown-toggle']"));
        actions.moveToElement(secondaryMenu).perform();

        WebElement secondaryAction = driver.findElement(By.xpath("//a[@onclick='handleSecondaryAction()']"));
        actions.moveToElement(secondaryAction).click().perform();

        WebDriverWait webDriverWait = new WebDriverWait(driver, 3);
        webDriverWait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//div[@class='jumbotron secondary-clicked']/h1")));

        WebElement clickResult = driver.findElement(By.xpath("//div[@class='jumbotron secondary-clicked']/h1"));
        Assert.assertTrue(clickResult.getText().contains("Secondary Page"), "Something went wrong");
    }

    @AfterClass
    public void tearDown() {
        driver.quit();
    }
}
