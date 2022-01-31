package com.irinabreza.hillel.pageObjects.homework15;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import java.io.File;

public class FileDownload extends BasePageHW15 {

    public FileDownload(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }

    public FileDownload downloadFile(String fileName) {
        driver.findElement(By.linkText(fileName)).click();
        waitForFileToDownload(fileName);
        return  this;
    }

    private void waitForFileToDownload(String fileName) {
        int attempt = 0;
        do {
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            if (++attempt > 5) {
                throw new RuntimeException("File is not downloaded");
            }
        } while (!(new File("target/download/" + fileName).exists()));
    }
}
