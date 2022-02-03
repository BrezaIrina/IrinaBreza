package com.irinabreza.hillel.homework17;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;
import java.util.LinkedList;
import java.util.List;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$x;

public class UploadPage {

    private final SelenideElement fileSubmitBy = $("#file-submit");
    private final SelenideElement inputFileBy = $("input[type='file']");
    private final SelenideElement fileUploadedBy = $x("//div[@class='example']/h3");

    public UploadPage appendTextToFile(String text, String fileName) {
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

    public UploadPage selectInputFile(String fileName) {
        String filePath = new File("target/download/" + fileName).getAbsolutePath();
        System.out.println(filePath);
               inputFileBy.sendKeys(filePath);
        return  this;
    }

    public UploadPage clickUploadButton() {
       fileSubmitBy.click();
        return  this;
    }

    public String getSuccessUpload() {
        return fileUploadedBy.getText();
    }
}
