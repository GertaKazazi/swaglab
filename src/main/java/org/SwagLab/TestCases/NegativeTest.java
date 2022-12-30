package org.SwagLab.TestCases;

import org.SwagLab.Pages.LoginPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class NegativeTest {
    @Test
    public void loginNegativeTest() throws InterruptedException {

        System.out.println("Starting login test!");
        System.setProperty("webdriver.chrome.driver", "src\\main\\resources\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        String url = "https://www.saucedemo.com/"; //Open test page
        driver.get(url);
        driver.manage().window().maximize();

        LoginPage loginPage = new LoginPage(driver);
        loginPage.loginWrongUsername(); //Click Login

        String expectedResult = "Epic sadface: Username and password do not match any user in this service";
        WebElement actualResult = driver.findElement(By.xpath("//div[@id='login_button_container']//form//h3"));
        String actualResultTest = actualResult.getText();
        Assert.assertTrue(actualResultTest.contains(expectedResult)); //Error Message Assertion

        driver.quit();//Close browser

    }

    @Test
    public void falsePasswordTest() throws InterruptedException {
        System.out.println("Starting login test!");
        System.setProperty("webdriver.chrome.driver", "src\\main\\resources\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        String url = "https://www.saucedemo.com/";
        driver.get(url); //Open test page
        driver.manage().window().maximize();

        LoginPage loginPage = new LoginPage(driver);
        loginPage.loginWrongPassword();

        String expectedResult = "Epic sadface: Username and password do not match any user in this service";
        WebElement actualResult = driver.findElement(By.xpath("//div[@id='login_button_container']//form//h3"));
        String actualResultTest = actualResult.getText();
        Assert.assertTrue(actualResultTest.contains(expectedResult));  //Error Message Assertion

        driver.quit();  //Close browser
    }
}