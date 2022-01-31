package com.irinabreza.hillel.pageObjects.homework15;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public abstract class BasePageHW15 {

    protected WebDriver driver;
    protected WebDriverWait webDriverWait;
    protected Actions actions;

    public BasePageHW15(WebDriver driver) {
        this.driver = driver;
        this.webDriverWait = new WebDriverWait(driver, 10);
        this.actions = new Actions(driver);
    }

    protected void clickButton(WebElement button) {
        webDriverWait.until(ExpectedConditions.elementToBeClickable(button)).click();
    }
}