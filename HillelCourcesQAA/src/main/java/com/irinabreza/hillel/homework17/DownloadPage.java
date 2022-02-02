package com.irinabreza.hillel.homework17;

import org.openqa.selenium.By;

import java.io.File;

import static com.codeborne.selenide.Selenide.$;

public class DownloadPage {

    public DownloadPage() {
    }

    public DownloadPage downloadFile(String fileName) {
       $(By.linkText(fileName)).click();
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
