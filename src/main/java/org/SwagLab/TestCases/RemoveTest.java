package org.SwagLab.TestCases;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import java.util.List;

public class RemoveTest extends AddToCartTest {
    @Test
    public void removeTest() {
        //Remove the lowest item product
        List<WebElement> products = driver.findElements(By.className("cart_item"));
        double min = Double.MAX_VALUE;
        for (WebElement product : products) {
            String elementText = product.findElement(By.className("inventory_item_price")).getText();
            String remove = product.findElement(By.className("cart_item_label")).getText();
            elementText = elementText.substring(1);
            double ele = Double.parseDouble(elementText);
            if (ele < min & remove.contains("REMOVE")) {
                min = ele;
                driver.findElement(By.xpath("//button[@class='btn btn_secondary btn_small cart_button']")).click();
            }
        }
    }
}
