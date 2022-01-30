//package com.irinabreza.hillel.files;
//
//import org.apache.commons.lang3.builder.ToStringExclude;
//import org.openqa.selenium.By;
//
//import java.io.File;
//
//public class DownloadTest extends  BaseTaest {
//    @Test
//    public void downloadTest() {
//        openApp();
//        driver.findElement(By.linkText("File Download")).click();
//
//        driver.findElement(By.linkText("some-file.txt")).click();
//    }
//
//    private void waitForFileToDownload(String fileName) {
//        int attemp = 0;
//        do {
//            try{
//            Thread.sleep(2000);
//        } catch (InterruptedException e) {
//                e.printStackTrace();
//            }
//            if (++attemp > 10) {
//                throw new RuntimeException("File is not downloaded");
//            }
//        } while (!new File("target/download/" + fileName).exists())
//    }
//}
