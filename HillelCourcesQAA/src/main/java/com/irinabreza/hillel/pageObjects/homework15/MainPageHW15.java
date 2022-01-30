package com.irinabreza.hillel.pageObjects.homework15;

import com.irinabreza.hillel.pageObjects.LoginPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class MainPageHW15 extends BasePageHW15 {

    public MainPageHW15(WebDriver driver) {
        super(driver);
    }

    public LoginPageHW15 goToLoginPage()  {
        driver.findElement(By.linkText("Form Authentication")).click();
        return new LoginPageHW15(driver);
    }

    public GeolocationHW15 goToGeolocationPage() {
        driver.findElement(By.linkText("Geolocation")).click();
        return new GeolocationHW15(driver);
    }

    public HoversHW15 goToHovers() {
        driver.findElement(By.linkText("Hovers")).click();
        return new HoversHW15(driver);
    }

    public ChallengingDOM goToChallengingDOM() {
        driver.findElement(By.linkText("Challenging DOM")).click();
        return new ChallengingDOM(driver);
    }
}
