package com.irinabreza.hillel.pageObjects.homework15;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class GeolocationHW15 extends BasePageHW15 {

    @FindBy(xpath = "//button[@onclick='getLocation()']")
    private WebElement geolocationButton;

    private By latitudeBy = By.xpath("//div[@id='lat-value']");
    private By longitudeBy = By.xpath("//div[@id='long-value']");

    public GeolocationHW15(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }

    public GeolocationHW15 clickGeolocationButton() {
        geolocationButton.click();
        return this;
    }

    public String getLatitude() {
        return webDriverWait.until(ExpectedConditions.presenceOfElementLocated(latitudeBy)).getText();
    }

    public String getLongitude() {
        return webDriverWait.until(ExpectedConditions.presenceOfElementLocated(longitudeBy)).getText();
    }
}
