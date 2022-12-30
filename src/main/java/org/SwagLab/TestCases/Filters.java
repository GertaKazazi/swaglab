package org.SwagLab.TestCases;

import org.SwagLab.Pages.DashboardPage;
import org.SwagLab.Pages.LoginPage;
import org.SwagLab.Pages.LogoutPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Filters extends BaseTest {
    @Test

    public void loginTest() throws InterruptedException {

        DashboardPage dashboard = new DashboardPage(driver);
        LogoutPage logout = new LogoutPage(driver);
        //Verify that the Url is changed and as expected
        String actualUrl = driver.getCurrentUrl();
        String expectedUrl = "https://www.saucedemo.com/inventory.html";

        Assert.assertEquals(actualUrl, expectedUrl, "The Url is incorrect!");

        //Open dropdown
        WebElement dropdown = driver.findElement(By.cssSelector(".product_sort_container"));
        dropdown.click();

        //Choose (A to Z)
        driver.findElement(By.xpath("//select[@class='product_sort_container']//option[@value='az']")).click();
        //Choose (Z to A)
        dropdown.click();
        driver.findElement(By.xpath("//select[@class='product_sort_container']//option[@value='za']")).click();
        System.out.println("DropDown is opended");
        //Choose Price (low to high)
        driver.findElement(By.cssSelector(".product_sort_container")).click();
        driver.findElement(By.xpath("//select[@class='product_sort_container']//option[@value='lohi']")).click();
        System.out.println("DropDown is opended");

        //Choose Price (high to low)
        driver.findElement(By.cssSelector(".product_sort_container")).click();
        driver.findElement(By.xpath("//select[@class='product_sort_container']//option[@value='hilo']")).click();
        System.out.println("DropDown is opended");

        //Open Menu
        dashboard.clickOnMenuButton();

        //Click Logout
        Thread.sleep(2000);
        logout.clickOnLogoutButton();

        //Close window
        driver.quit();
    }
}
