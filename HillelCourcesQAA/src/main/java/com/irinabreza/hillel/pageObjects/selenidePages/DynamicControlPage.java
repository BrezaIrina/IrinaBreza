package com.irinabreza.hillel.pageObjects.selenidePages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;

public class DynamicControlPage {
    private final SelenideElement removeButton = $("#checkbox-example button");
    private final SelenideElement checkBox = $("#checkbox");
    private final SelenideElement enableButton = $("#input-example button");
    private final SelenideElement input = $("#input-example input");

    public void setCheckBox() {
        checkBox.should(Condition.visible).shouldBe(Condition.enabled).click();
    }

    public void addOrRemoveCheckbox(boolean remove) {
        removeButton.should(Condition.visible).shouldBe(Condition.enabled).click();
        if (remove) {
            checkBox.should(Condition.disappear);
        }
        else {
            checkBox.should(Condition.appear);
        }
}

public void enableOrDisableInput(boolean enable) {
        enableButton.should(Condition.visible).shouldBe(Condition.enabled).click();
        if (enable) {
            input.shouldBe(Condition.enabled);
        } else {
            input.shouldBe(Condition.not(Condition.enabled));
        }
    }
}