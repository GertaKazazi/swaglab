package org.SwagLab.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class DashboardPage {
    By menuButton = By.id("react-burger-menu-btn");
    WebDriver driver;
    public DashboardPage(WebDriver driver) {
        this.driver = driver;
    }
    public void clickOnMenuButton() {
        driver.findElement(menuButton).click();
    }
}

