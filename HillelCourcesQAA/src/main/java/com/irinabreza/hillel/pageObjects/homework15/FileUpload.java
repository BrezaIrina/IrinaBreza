package com.irinabreza.hillel.pageObjects.homework15;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;
import java.util.LinkedList;
import java.util.List;

public class FileUpload extends BasePageHW15 {

    private By fileSubmitBy = By.id("file-submit");
    private By inputFileBy = By.cssSelector("input[type='file']");
    private By fileUploadedBy = By.xpath("//div[@class='example']/h3");

    public FileUpload(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }

    public FileUpload appendTextToFile(String text, String fileName) {
        try {
            List<String> stringList = new LinkedList<String>();
            stringList.add(text);
            Path filePath = new File("target/download/" + fileName).toPath();
            Files.write(filePath, stringList, StandardOpenOption.APPEND);
        }  catch (IOException e) {
            e.printStackTrace();
        }
        return this;
    }

    public FileUpload selectInputFile(String fileName) {
        String filePath = new File("target/download/" + fileName).getAbsolutePath();
        System.out.println(filePath);
        driver
                .findElement(inputFileBy)
                .sendKeys(filePath);
        return  this;
    }

    public FileUpload clickUploadButton() {
        driver
                .findElement(fileSubmitBy)
                .click();
        return  this;
    }

    public String getSuccessUpload() {
        return webDriverWait.until(ExpectedConditions.presenceOfElementLocated(fileUploadedBy)).getText();
    }
}
