package com.irinabreza.hillel.pageObjects.homework15;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.LinkedList;
import java.util.List;

public class ChallengingDOM extends BasePageHW15 {

    @FindBy(xpath = "//a[@class='button']")
    private WebElement plainButton;

    @FindBy(xpath = "//a[@class='button alert']")
    private WebElement alertButton;

    @FindBy(xpath = "//a[@class='button success']")
    private WebElement successButton;

    private By fourthColumnBy = By.xpath("//tr/td[4]");

    public ChallengingDOM(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }

    public ChallengingDOM clickPlainButton() {
        plainButton.click();
        return this;
    }

    public ChallengingDOM clickAlertButton() {
        alertButton.click();
        return this;
    }

    public ChallengingDOM clickSuccessButton() {
        successButton.click();
        return this;
    }

    public List<String> getFourthColunmText() {
        LinkedList<String> values = new LinkedList<String>();
        List<WebElement> elements = driver.findElements(fourthColumnBy);
        for (WebElement element : elements) {
            String elementText = element.getText();
            values.add(elementText);
        }
        return values;
    }
}
