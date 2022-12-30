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

public class PositiveTest extends BaseTest {
    @Test
    public void loginTest() throws InterruptedException {
        DashboardPage dashboard = new DashboardPage(driver);
        LogoutPage logout = new LogoutPage(driver);
        String actualUrl = driver.getCurrentUrl();
        String expectedUrl = "https://www.saucedemo.com/inventory.html";
        Assert.assertEquals(actualUrl, expectedUrl, "The Url is incorrect!"); //Verify that the Url is changed and as expected
        dashboard.clickOnMenuButton(); //Click Menu
        Thread.sleep(2000);
        logout.clickOnLogoutButton(); //Click Logout
        driver.quit();     //Close window
    }
}