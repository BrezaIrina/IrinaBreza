package ua.hillel.test.mvnTest;

import org.testng.annotations.Test;

@Test
public class MvnTest {
    public void mvnTest() {
        System.out.println("I'm first mvn test");
        System.out.println("Open URL: " + System.getProperty("siteUrl"));
    }
}