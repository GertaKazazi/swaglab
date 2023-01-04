package org.SwagLab.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

public class DashboardPage {
    private final static By MENU_BUTTON = By.id("react-burger-menu-btn");
    private final static By DROPDOWN = By.cssSelector(".product_sort_container");
    private final static By SORT_AZ = By.xpath("//select[@class='product_sort_container']//option[@value='az']");
    private final static By SORT_ZA = By.xpath("//select[@class='product_sort_container']//option[@value='za']");
    private final static By SORT_LOW_HIGH  = By.xpath("//select[@class='product_sort_container']//option[@value='lohi']");
    private final static By SORT_HIGH_LOW = By.xpath("//select[@class='product_sort_container']//option[@value='hilo']");

    WebDriver driver;

    public DashboardPage(WebDriver driver) {
        this.driver = driver;
    }

    public void clickOnMenuButton() {
        driver.findElement(MENU_BUTTON).click();
    }

    public void openDropdown() {
        driver.findElement(DROPDOWN).click();
    }
    public void sortAZ() {
        driver.findElement(SORT_AZ).click();
    }
    public void sortZA() {
        driver.findElement(SORT_ZA).click();
    }
    public void sortLoHi() {
        driver.findElement(SORT_LOW_HIGH).click();
    }
    public void sortHiLo() {
        driver.findElement(SORT_HIGH_LOW).click();
    }
}

