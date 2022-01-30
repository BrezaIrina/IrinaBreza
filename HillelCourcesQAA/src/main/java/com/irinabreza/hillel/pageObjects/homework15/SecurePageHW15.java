package com.irinabreza.hillel.pageObjects.homework15;

import com.irinabreza.hillel.pageObjects.LoginPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class SecurePageHW15 extends BasePageHW15 {

    private By byAlert = By.cssSelector(".flash");

    public SecurePageHW15(WebDriver driver) {

        super(driver);
    }

    public String getAlertText() {
        return webDriverWait.until(ExpectedConditions.presenceOfElementLocated(byAlert)).getText();
    }
}
