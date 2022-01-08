package ua.hillel.test.Homework11;

import org.testng.annotations.Test;

public class WelcomeTest {

    @Test(dependsOnGroups = {"login"}, groups = {"functions", "regression"})
    public void welcomeTextTest () {
        System.out.println("Welcome userName");
    }
}
