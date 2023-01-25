package org.SwagLab.TestCases;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import java.util.List;

public class AddToCartTest extends BaseTest {
    @Test
    public void addToCart() throws InterruptedException {
        //Scroll to end
        scrollToEnd();
        // Add to cart
        WebElement addProd = driver.findElement(By.id("add-to-cart-sauce-labs-onesie"));
        WebElement addProd1 = driver.findElement(By.id("add-to-cart-test.allthethings()-t-shirt-(red)"));
        WebElement itemDecp = driver.findElement(By.xpath("//a[@id='item_2_title_link']"));
        String beforeResult = itemDecp.getText();
        System.out.println(beforeResult);
        addProd.click();
        addProd1.click();
        Thread.sleep(2000);
        //Scroll up
        scrollUp();

        //Verify that the product is added to cart
        driver.findElement(By.xpath("//div[@id='shopping_cart_container']/a[@class='shopping_cart_link']")).click();
        List<WebElement> itemAdded = driver.findElements(By.className("cart_item"));
        for (WebElement webElement : itemAdded) {
            String elementText = webElement.findElement(By.className("inventory_item_name")).getText();
            if (elementText.equals(beforeResult)) {
                System.out.println("The item" + ": " + elementText + " is added to cart");
            }
        }
        //Verify that the quantity is correct
        WebElement quantity = driver.findElement(By.xpath("(//div[@class='cart_quantity'])[2]"));
        String nr = quantity.getText();
        String expNr = "1";
        Assert.assertEquals(nr, expNr, "Quantity is not correct");

    }
}