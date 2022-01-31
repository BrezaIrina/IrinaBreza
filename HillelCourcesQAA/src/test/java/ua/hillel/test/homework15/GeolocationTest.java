package ua.hillel.test.homework15;

import com.irinabreza.hillel.pageObjects.homework15.GeolocationHW15;
import org.testng.Assert;
import org.testng.annotations.Test;

public class GeolocationTest extends BaseTest {

    @Test
    public void geolocationTest() {
        GeolocationHW15 geolocationPage = openApp()
                .goToGeolocationPage()
                .clickGeolocationButton();
        String latitude = geolocationPage.getLatitude();
        Assert.assertFalse(latitude.isEmpty(), "Latitude should not be empty: " + latitude);
        String longitude = geolocationPage.getLongitude();
        Assert.assertFalse(longitude.isEmpty(), "Longitude should not be empty: " + longitude);
    }
}
