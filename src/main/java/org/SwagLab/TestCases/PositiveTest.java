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

public class PositiveTest {
    @Test

    public void loginTest() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "src\\main\\resources\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        String url = "https://www.saucedemo.com/";
        driver.get(url); //Open test page
        System.out.println("Page is opened!");
        driver.manage().window().maximize(); //Maximize browser window

        LoginPage login = new LoginPage(driver);
        DashboardPage dashboard = new DashboardPage(driver);
        LogoutPage logout = new LogoutPage(driver);
        login.typeUserName();
        login.typePassword();
        login.clickOnLoginButton();

        String actualUrl = driver.getCurrentUrl();
        String expectedUrl = "https://www.saucedemo.com/inventory.html";
        Assert.assertEquals(actualUrl, expectedUrl, "The Url is incorrect!"); //Verify that the Url is changed and as expected
        dashboard.clickOnMenuButton(); //Click Menu
        logout.clickOnLogoutButton(); //Click Logout
        driver.quit();     //Close window
    }
}