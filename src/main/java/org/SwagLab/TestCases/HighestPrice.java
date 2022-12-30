package org.SwagLab.TestCases;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.util.List;

public class HighestPrice extends BaseTest {

    @Test
    public void loginTest()  {
        List<WebElement> products = driver.findElements(By.className("inventory_item"));
        double max = Double.MIN_VALUE;
        for (WebElement product : products) {
            String elementText = product.findElement(By.className("inventory_item_price")).getText();
            elementText = elementText.substring(1);
            double ele = Double.parseDouble(elementText);
            if (ele > max) {
                max = ele;
            }
        }
        System.out.println(max);
        driver.quit();
    }
}

