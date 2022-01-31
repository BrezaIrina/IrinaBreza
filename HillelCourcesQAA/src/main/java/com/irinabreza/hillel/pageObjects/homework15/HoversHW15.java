package com.irinabreza.hillel.pageObjects.homework15;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.LinkedList;
import java.util.List;

public class HoversHW15 extends BasePageHW15 {

    public HoversHW15(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//div[@class='figure']")
    private List<WebElement> userAvatars;

    private By figcaptionBy = By.xpath("//div[@class='figcaption']/h5");

    public String getUserNames() {
        String userNames = new String();
        for (WebElement avatar : userAvatars) {
            Actions actions = new Actions(driver);
            actions.moveToElement(avatar).perform();
            List<WebElement> userNameWebElements = driver.findElements(figcaptionBy);
            for (WebElement userNameElement : userNameWebElements) {
                if (!userNameElement.getText().isEmpty()) {
                    userNames += userNameElement.getText();
                }
            }
        }
        return userNames;
    }
}
