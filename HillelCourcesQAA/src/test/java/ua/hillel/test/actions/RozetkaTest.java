package ua.hillel.test.actions;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.List;

public class RozetkaTest {
    private WebDriver driver;
    @BeforeClass
    public void setUp() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }

    @Test
    public void rozetkaTest() {
        driver.get("https://rozetka.com.ua/ua/");

        driver.findElement(By.id("fat-menu")).click();

        WebElement menuItem = driver.findElement(
                By.cssSelector(".menu-categories li.menu-categories__item:nth-of-type(3)"));

        Actions actions = new Actions(driver);

        actions.moveToElement(menuItem).perform();

        WebElement item = driver.findElement(
                By.xpath("//*[contains(@class, 'state_hovered')]//a[@class='menu__link menu__link_background_gray' and contains(text(), 'Відеокарти')]"));

        actions.moveToElement(item).click().perform();

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        setFilter("Rozetka");
        setFilter("ASUS");
        setFilter("GeForce RTX 3090");

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        WebElement cards = driver.findElement(By.cssSelector(".catalog-grid__cell:nth-of-type(1)"));

        actions.moveToElement(cards).perform();

        List<WebElement> descItems = cards.findElements(By.cssSelector(".goods-tile__description-item"));
        descItems.forEach(descItem -> {
            System.out.print(descItem.findElement(By.tagName("span")).getText() + " - ");
            System.out.println(descItem.findElement(By.tagName("a")).getText());
        });

//        JavascriptExecutor executor = (JavascriptExecutor) driver;            //Java script code to perform an action - click
//        executor.executeScript("arguments[0].scrollInToView(true)", cards);
//        executor.executeScript("arguments[0].click()", cards);
    }

    @AfterClass
    public void tearDown() {
        driver.quit();
    }

    private void setFilter(String id) {
        driver.findElement(By.xpath("//a[@data-id='" + id + "']/..")).click();
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
}
