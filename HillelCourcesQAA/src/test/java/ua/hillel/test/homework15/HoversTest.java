package ua.hillel.test.homework15;

import com.irinabreza.hillel.pageObjects.homework15.GeolocationHW15;
import com.irinabreza.hillel.pageObjects.homework15.HoversHW15;
import org.testng.Assert;
import org.testng.annotations.Test;

public class HoversTest extends BaseTest {

    @Test
    public void hoversTest() {
       String userNames = openApp()
                .goToHovers()
                .getUserNames();
        Assert.assertTrue(userNames.contains("name: user1"));
        Assert.assertTrue(userNames.contains("name: user2"));
        Assert.assertTrue(userNames.contains("name: user3"));
    }
}

