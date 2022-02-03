package ua.hillel.test.homework17;

import com.codeborne.selenide.Configuration;
import com.irinabreza.hillel.homework17.DownloadPage;
import com.irinabreza.hillel.homework17.DynamicLoadPage;
import com.irinabreza.hillel.homework17.UploadPage;
import org.openqa.selenium.WebDriver;

import org.testng.annotations.BeforeClass;

import java.io.File;

import static com.codeborne.selenide.Selenide.open;

public class BaseTest {

    @BeforeClass
    public void setUp() {
        String downloadPath = new File("target/download").getAbsolutePath();
        System.out.println(downloadPath);
        Configuration.downloadsFolder = downloadPath;
        Configuration.browser = "chrome";
        Configuration.timeout = 8000;
    }

    public DownloadPage goToDownloadPage() {
        open("https://the-internet.herokuapp.com/download");
        return new DownloadPage();
    }

    public UploadPage goToUploadPage() {
        open("https://the-internet.herokuapp.com/upload");
        return new UploadPage();
    }

    public DynamicLoadPage goToDynamicLoadPage() {
        open("https://the-internet.herokuapp.com/dynamic_loading/1");
        return new DynamicLoadPage();
    }
}