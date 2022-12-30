package org.SwagLab.TestCases;

import org.SwagLab.Pages.LoginPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class HighestPrice extends BaseTest{

    @Test
    public void loginTest() throws InterruptedException {
        //Open dropdown
        WebElement dropdown = driver.findElement(By.cssSelector(".product_sort_container"));
        dropdown.click();
        Thread.sleep(2000);
        System.out.println("DropDown is opended");
        //Choose price from high to low
        driver.findElement(By.cssSelector(".product_sort_container")).click();
        driver.findElement(By.xpath("//select[@class='product_sort_container']//option[@value='hilo']")).click();
        Thread.sleep(2000);

    }
}

