package ua.hillel.test.selenideTest;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Configuration;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

import static com.codeborne.selenide.Selenide.*;

public class SelenideTests {
    @Test
    public void selenideTest() {
        Configuration.browser = "firefox";

        open("http://google.com");

        $("#id").should(Condition.visible).should(Condition.enabled).click();

        System.out.println("done");
    }

}
