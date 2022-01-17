package ua.hillel.test.wdTest;

import com.irinabreza.hillel.pageObjects.MainPage;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class BaseTest {
    protected WebDriver driver;

    @BeforeClass
    public void setUp() {
        WebDriverManager.chromedriver().setup();
        this.driver = new ChromeDriver();
    }

    @AfterClass
    public void tearDown() {
        if (this.driver != null) {
            this.driver.quit();
        }
    }

    public MainPage openApp() {
        driver.get("https://the-internet.herokuapp.com/");

        return new MainPage(driver);
    }
}
