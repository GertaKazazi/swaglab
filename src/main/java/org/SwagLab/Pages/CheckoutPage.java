package org.SwagLab.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CheckoutPage {
    private final static By CHECKOUT_BUTTON = By.xpath("//button[@class='btn btn_action btn_medium checkout_button']");
    private final static By FIRST_NAME = By.cssSelector("#first-name");
    private final static By LAST_NAME = By.id("last-name");
    private final static By POSTAL_CODE = By.id("postal-code");
    private final static By CONTINUE_BUTTON = By.id("continue");
    private final static By FINISH_BUTTON = By.id("finish");

    WebDriver driver;

    public CheckoutPage(WebDriver driver) {
        this.driver = driver;
    }

    public void clickOnCheckoutButton() {
        driver.findElement(CHECKOUT_BUTTON).click();
    }

    public void typeFirstName() {
        driver.findElement(FIRST_NAME).sendKeys("Gerta");
    }

    public void typeLastName() {
        driver.findElement(LAST_NAME).sendKeys("Kazazi");
    }

    public void typePostalCode() {
        driver.findElement(POSTAL_CODE).sendKeys("1001");
    }

    public void clickOnContinueButton() {
        driver.findElement(CONTINUE_BUTTON).click();
    }

    public void clickOnFinishButton() {
        driver.findElement(FINISH_BUTTON).click();
    }
}
