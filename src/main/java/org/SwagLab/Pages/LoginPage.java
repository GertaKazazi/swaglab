package org.SwagLab.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
    WebDriver driver;
    private final static By USERNAME = By.id("user-name");
    private final static By PASSWORD= By.cssSelector("input#password");
    private final static By LOGIN_BUTTON = By.cssSelector("#login-button");

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
        driver.findElement(USERNAME).sendKeys("standard_user");
    }
    private void typePassword() {
        driver.findElement(PASSWORD).sendKeys("secret_sauce");
    }
    private void clickOnLoginButton() {
        driver.findElement(LOGIN_BUTTON).click();
    }
    private void typeWrongUserName() {
        driver.findElement(USERNAME).sendKeys("1");
    }
    private void typeWrongPassword() {
        driver.findElement(PASSWORD).sendKeys("1");
    }
}
