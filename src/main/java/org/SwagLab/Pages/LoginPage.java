package org.SwagLab.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
    WebDriver driver;
    By username = By.id("user-name");
    By password = By.id("password");
    By loginButton = By.cssSelector("#login-button");

    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }

    public void typeUserName() {
        driver.findElement(username).sendKeys("standard_user");
    }

    public void typePassword() {
        driver.findElement(password).sendKeys("secret_sauce");
    }

    public void clickOnLoginButton() {
        driver.findElement(loginButton).click();
    }

    public void typeWrongUserName() {
        driver.findElement(username).sendKeys("1");
    }
    public void typeWrongPassword() {
        driver.findElement(password).sendKeys("1");
    }

}
