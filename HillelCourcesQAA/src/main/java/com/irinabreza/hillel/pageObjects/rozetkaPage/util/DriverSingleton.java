package com.irinabreza.hillel.pageObjects.rozetkaPage.util;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DriverSingleton {
    private static DriverSingleton instance;

    private WebDriver driver;

    private DriverSingleton() {
        WebDriverManager.chromedriver().setup();
        this.driver = new ChromeDriver();
    }

    public static DriverSingleton getInstance() {
        if (instance ==null) {
            instance = new DriverSingleton();
        }
        return instance;
    }
    
}
