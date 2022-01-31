package ua.hillel.test.homework15;

import org.testng.Assert;
import org.testng.annotations.Test;

public class DownloadTest extends BaseTest {

    String fileName = "some-file.txt";

    @Test
    public void testFileOperations() {
        openApp()
                .goToFileDownload()
                .downloadFile(fileName);
        String successUploadText = navigateBack()
                .goToFileUpload()
                .appendTextToFile("Some new text", fileName)
                .selectInputFile(fileName)
                .clickUploadButton()
                .getSuccessUpload();
        Assert.assertTrue(successUploadText.contains("File Uploaded!"));
    }
}
