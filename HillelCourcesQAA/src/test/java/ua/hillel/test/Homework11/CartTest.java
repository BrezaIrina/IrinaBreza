package ua.hillel.test.Homework11;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class CartTest {

    @Test
    @Parameters({"totalQty"})
    public void testCartContent (String paramFromConfig) {
        System.out.println("Total items in cart " + paramFromConfig);
    }
}
