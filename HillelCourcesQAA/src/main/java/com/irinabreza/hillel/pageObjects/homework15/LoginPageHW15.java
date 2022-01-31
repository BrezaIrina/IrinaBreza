package com.irinabreza.hillel.pageObjects.homework15;

import com.irinabreza.hillel.pageObjects.BasePage;
import com.irinabreza.hillel.pageObjects.SecurePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPageHW15 extends BasePageHW15 {

    @FindBy(id = "username")
    private WebElement userNameInput;

    @FindBy(id = "password")
    private WebElement passwordInput;

    @FindBy(css = "button[type='submit']")
    private WebElement loginButton;

    @FindBy(css = ".flash")
    private WebElement errorAlert;

    public LoginPageHW15(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }

    public LoginPageHW15 setUsername(String username) {
        userNameInput.sendKeys(username);
        return this;
    }

    public LoginPageHW15 setPassword(String password) {
        passwordInput.sendKeys(password);
        return this;
    }

    public SecurePageHW15 clickLoginButton() {
        clickButton(loginButton);
        return new SecurePageHW15(driver);
    }

    public SecurePageHW15 login(String username, String password) {
        this.setUsername(username);
        this.setPassword(password);
        return this.clickLoginButton();
    }

    public LoginPageHW15 invalidLogin(String username, String password) {
       this.setUsername(username);
       this.setPassword(password);
       this.clickButton(loginButton);
       return this;
    }

    public String getErrorMessage() {
        return errorAlert.getText();
    }
}