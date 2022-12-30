package org.SwagLab.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LogoutPage {
    WebDriver driver;
    private final static By LOGOUT_BUTTON = By.cssSelector("a#logout_sidebar_link");

    public LogoutPage(WebDriver driver) {
        this.driver = driver;
    }
    public void clickOnLogoutButton() {
        driver.findElement(LOGOUT_BUTTON).click();
    }
}
