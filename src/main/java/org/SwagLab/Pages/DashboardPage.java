package org.SwagLab.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

public class DashboardPage {
    By menuButton = By.id("react-burger-menu-btn");
    By dropDown = By.cssSelector(".product_sort_container");
    private final static By SORT_AZ = By.xpath("//select[@class='product_sort_container']//option[@value='az']");
    private final static By SORT_ZA = By.xpath("//select[@class='product_sort_container']//option[@value='za']");
    private final static By SORT_LOW_HIGH  = By.xpath("//select[@class='product_sort_container']//option[@value='lohi']");
    private final static By SORT_HIGH_LOW = By.xpath("//select[@class='product_sort_container']//option[@value='hilo']");

    WebDriver driver;

    public DashboardPage(WebDriver driver) {
        this.driver = driver;
    }

    public void clickOnMenuButton() {
        driver.findElement(menuButton).click();
    }
    public void scrollToEnd() throws InterruptedException {

        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,350)");
        Thread.sleep(2000);
    }
    public void scrollUp() throws InterruptedException {
        JavascriptExecutor jsu = (JavascriptExecutor) driver;
        jsu.executeScript("window.scrollBy(0,-350)");
        Thread.sleep(2000);
    }
    public void openDropdown() {
        driver.findElement(dropDown).click();
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

