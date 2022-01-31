package ua.hillel.test.homework15;

import com.irinabreza.hillel.pageObjects.MainPage;
import com.irinabreza.hillel.pageObjects.homework15.MainPageHW15;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import java.io.File;
import java.util.HashMap;
import java.util.Map;

public class BaseTest {
    protected WebDriver driver;

    @BeforeClass
    public void setUp() {
        WebDriverManager.chromedriver().setup();
        ChromeOptions options = new ChromeOptions();
        Map<String, Object> prefs = new HashMap<String, Object>();
        prefs.put("download.default_directory", new File("target/download").getAbsolutePath());
        options.setExperimentalOption("prefs", prefs);
        this.driver = new ChromeDriver(options);
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

    public MainPageHW15 navigateBack() {
        driver.navigate().back();
        return new MainPageHW15(driver);
    }
}
