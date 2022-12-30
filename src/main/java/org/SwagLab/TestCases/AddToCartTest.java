package org.SwagLab.TestCases;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;

import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;


public class AddToCartTest extends BaseTest {
    @Test
    public void addToCart() throws InterruptedException {
        //Scroll to end
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,350)");
        Thread.sleep(2000);
        // Add to cart
        WebElement addProd = driver.findElement(By.id("add-to-cart-sauce-labs-onesie"));
        WebElement addProd1 = driver.findElement(By.id("add-to-cart-test.allthethings()-t-shirt-(red)"));
        WebElement itemDecp = driver.findElement(By.xpath("//*[@id=\"item_2_title_link\"]/div"));
        String beforeResult = itemDecp.getText();
        addProd.click();
        addProd1.click();
        Thread.sleep(2000);
        //Scroll up
        JavascriptExecutor jsu = (JavascriptExecutor) driver;
        jsu.executeScript("window.scrollBy(0,-350)");
        Thread.sleep(2000);

        driver.findElement(By.xpath("//div[@id='shopping_cart_container']/a[@class='shopping_cart_link']")).click();
        List<WebElement> itemAdded = driver.findElements(By.className("cart_item"));
        for(int i =0;i<itemAdded.size();i++) {
            String elementText =  itemAdded.get(i).findElement(By.className("inventory_item_name")).getText();
            if(elementText.equals(beforeResult)){
                System.out.println("The item"+": "+ elementText+" is added to cart");
            }
        }
        WebElement quantity = driver.findElement(By.xpath("//*[@id=\"cart_contents_container\"]/div/div[1]/div[3]/div[1]"));
        String nr = quantity.getText();
        String expNr = "1";
        //Verify that the quantity is correct
        Assert.assertEquals(nr, expNr, "Quantity is not correct");

    }
}