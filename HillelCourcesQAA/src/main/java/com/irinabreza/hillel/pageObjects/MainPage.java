package com.irinabreza.hillel.pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class MainPage extends BasePage {

    public MainPage(WebDriver driver) {
        super(driver);
    }

    public LoginPage goToLoginPage() {
        driver.findElement(By.linkText("Form Authentication")).click();
        return new LoginPage(driver);
    }
}
