package org.SwagLab.TestCases;

import org.SwagLab.Pages.LoginPage;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class AddToCart {
    @Test
    public void addToCart() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "src\\main\\resources\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        //Open test page
        String url = "https://www.saucedemo.com/";
        driver.get(url);
        System.out.println("Page is opened!");
        //Maximize browser window
        driver.manage().window().maximize();


        LoginPage loginPage = new LoginPage(driver);
        loginPage.login();

        //Scroll to end
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,-350)", "");
        Thread.sleep(2000);
        // Add to cart
        driver.findElement(By.id("add-to-cart-sauce-labs-onesie")).click();
        Thread.sleep(2000);
    }
}