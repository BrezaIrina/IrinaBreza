package com.irinabreza.hillel.pageObjects.rozetkaPage;

import org.openqa.selenium.WebElement;

public class HeaderComponent {
    private WebElement searchInput;

    private  WebElement cartIcon;

    public void search(String product) {
        searchInput.sendKeys(product);
    }

    public void goToCart() {
        cartIcon.click();
    }
}
