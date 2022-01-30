package ua.hillel.test.homework15;

import com.irinabreza.hillel.pageObjects.homework15.GeolocationHW15;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

public class ChallengingDOMTest extends BaseTest {

    @Test
    public void fourthColumnTextTest() {
       List<String> textValues = openApp()
                .goToChallengingDOM()
                .clickPlainButton()
                .clickAlertButton()
                .clickSuccessButton()
                .getFourthColunmText();
       for(String textValue : textValues) {
           Assert.assertFalse(textValue.isEmpty(), "Should not be empty " + textValue);
       }
    }
}

