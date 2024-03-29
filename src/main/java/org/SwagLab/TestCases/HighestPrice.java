package org.SwagLab.TestCases;
import org.SwagLab.Pages.DashboardPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

public class HighestPrice extends BaseTest {

    @Test
    public void highestPrice()  {
        DashboardPage dashboardPage = new DashboardPage(driver);
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
        dashboardPage.openDropdown();
        dashboardPage.sortHiLo();
        String expectedMaxPrice = driver.findElement(By.xpath("(//div[@class='inventory_item_price'])[1]")).getText().substring(1);
        System.out.println(expectedMaxPrice);
        Assert.assertEquals(max,Double.parseDouble(expectedMaxPrice));

    }

}

