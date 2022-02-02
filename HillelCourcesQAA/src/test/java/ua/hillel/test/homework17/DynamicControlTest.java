package ua.hillel.test.homework17;
import org.testng.Assert;
import org.testng.annotations.Test;

public class DynamicControlTest extends BaseTest {

    @Test
    public void dynamicLoadingTest() {
        String resultText = goToDynamicLoadPage()
                .clickStartButton()
                .getText();
        Assert.assertTrue(resultText.contains("Hello World!"), "Text message should not be empty");
    }
}
