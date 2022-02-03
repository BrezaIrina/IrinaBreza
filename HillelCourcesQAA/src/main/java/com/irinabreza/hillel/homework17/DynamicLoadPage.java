package com.irinabreza.hillel.homework17;
import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$x;

public class DynamicLoadPage {

    private final SelenideElement startButton = $("#start button");
    private final SelenideElement resultElement = $x("//div[@id='finish']/h4");

    public DynamicLoadPage clickStartButton() {
        startButton.should(Condition.visible).shouldBe(Condition.enabled).click();
        return this;
    }

    public String getText() {
        return resultElement.shouldBe(Condition.visible).getText();
    }
}
