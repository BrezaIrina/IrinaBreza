package ua.hillel.test.homework17;

import org.testng.Assert;
import org.testng.annotations.Test;

public class DownloadSelenideTest extends BaseTest {

    String fileName = "some-file.txt";

    @Test
    public void testFileOperations() {
        goToDownloadPage()
                .downloadFile(fileName);
        String successUploadText = goToUploadPage()
                .appendTextToFile("Some new text", fileName)
                .selectInputFile(fileName)
                .clickUploadButton()
                .getSuccessUpload();
        Assert.assertTrue(successUploadText.contains("File Uploaded!"));
    }

}
