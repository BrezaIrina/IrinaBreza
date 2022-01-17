package ua.hillel.test.actions;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.List;

public class RozetkaTest {
    private WebDriver driver;
    private WebDriverWait webDriverWait;

    @BeforeClass
    public void setUp() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }

    @Test
    public void rozetkaTest() {
        driver.get("https://rozetka.com.ua/ua/");

        webDriverWait = new WebDriverWait(driver, 5);

        driver.findElement(By.id("fat-menu")).click();

        WebElement menuItem = driver.findElement(
                By.cssSelector(".menu-categories li.menu-categories__item:nth-of-type(3)"));

        Actions actions = new Actions(driver);

        actions.moveToElement(menuItem).perform();

        WebElement item = driver.findElement(
                By.xpath("//*[contains(@class, 'state_hovered')]//a[@class='menu__link menu__link_background_gray' and contains(text(), 'Відеокарти')]"));

        actions.moveToElement(item).click().perform();

        webDriverWait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("aside.sidebar")));

        setFilter("Rozetka");
        setFilter("ASUS");
        setFilter("GeForce RTX 3090");

        WebElement cards = driver.findElement(By.cssSelector(".catalog-grid__cell:nth-of-type(1)"));

        actions.moveToElement(cards).perform();

        List<WebElement> descItems = cards.findElements(By.cssSelector(".goods-tile__description-item"));
        descItems.forEach(descItem -> {
            System.out.print(descItem.findElement(By.tagName("span")).getText() + " - ");
            System.out.println(descItem.findElement(By.tagName("a")).getText());
        });

    }

    @AfterClass
    public void tearDown() {
        driver.quit();
    }

    private void setFilter(String id) {
        driver.findElement(By.xpath("//a[@data-id='" + id + "']/..")).click();
        webDriverWait.until(ExpectedConditions.not(ExpectedConditions.attributeContains(driver.findElement(By.cssSelector("aside")), "class", "preloader_type_element")));

    }
}
