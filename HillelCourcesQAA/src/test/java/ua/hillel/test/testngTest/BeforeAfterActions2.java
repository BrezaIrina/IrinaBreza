package ua.hillel.test.testngTest;

import org.testng.annotations.*;

public class BeforeAfterActions2 {
    @Test
    public void test11() {
        System.out.println("Test 2-1");
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {}
    }

    @Test
    public void test12() {
        System.out.println("Test 2-2");
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {}
    }

}
