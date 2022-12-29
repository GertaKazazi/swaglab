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

    public void login(){
        typeUserName();
        typePassword();
        clickOnLoginButton();
    }

    public void loginWrongUsername(){
        typeWrongUserName();
        typePassword();
        clickOnLoginButton();
    }

    public void loginWrongPassword(){
        typeUserName();
        typeWrongPassword();
        clickOnLoginButton();
    }


    private void typeUserName() {
        driver.findElement(username).sendKeys("standard_user");
    }

    private void typePassword() {
        driver.findElement(password).sendKeys("secret_sauce");
    }

    private void clickOnLoginButton() {
        driver.findElement(loginButton).click();
    }

    private void typeWrongUserName() {
        driver.findElement(username).sendKeys("1");
    }
    private void typeWrongPassword() {
        driver.findElement(password).sendKeys("1");
    }

}
