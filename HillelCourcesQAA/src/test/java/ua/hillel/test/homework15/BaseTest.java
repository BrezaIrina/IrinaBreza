package ua.hillel.test.homework15;

import com.irinabreza.hillel.pageObjects.MainPage;
import com.irinabreza.hillel.pageObjects.homework15.MainPageHW15;
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

    public MainPageHW15 openApp() {
        driver.get("https://the-internet.herokuapp.com/");

        return new MainPageHW15(driver);
    }
}
