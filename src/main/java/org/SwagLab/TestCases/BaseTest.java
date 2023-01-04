package org.SwagLab.TestCases;

import org.SwagLab.Pages.LoginPage;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class BaseTest {

    public WebDriver driver;

    @BeforeClass
    public void LoginDriver() {
        System.setProperty("webdriver.chrome.driver", "src\\main\\resources\\chromedriver.exe");
        driver = new ChromeDriver();

        //Open test page
        String url = "https://www.saucedemo.com/";
        driver.get(url);
        System.out.println("Page is opened!");
        //Maximize browser window
        driver.manage().window().maximize();

        LoginPage loginPage = new LoginPage(driver);
        loginPage.login();
        //Verify that the Url is changed and as expected
        String actualUrl = driver.getCurrentUrl();
        String expectedUrl = "https://www.saucedemo.com/inventory.html";
        Assert.assertEquals(actualUrl, expectedUrl, "The Url is incorrect!");
    }
    public void scrollUp() throws InterruptedException {
        JavascriptExecutor jsu = (JavascriptExecutor) driver;
        jsu.executeScript("window.scrollBy(0,-350)");
        Thread.sleep(2000);
    }
    public void scrollToEnd() throws InterruptedException {

        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,350)");
        Thread.sleep(2000);
    }@AfterClass
    public void quitDriver()
    {
        driver.quit();
    }

}
