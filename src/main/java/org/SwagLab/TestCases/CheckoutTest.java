package org.SwagLab.TestCases;

import org.SwagLab.Pages.CheckoutPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CheckoutTest extends AddToCartTest{

    @Test
    public void checkout() throws InterruptedException {
        CheckoutPage checkoutPage = new CheckoutPage(driver);
        Thread.sleep(2000);
        checkoutPage.clickOnCheckoutButton();
        Thread.sleep(2000);
        checkoutPage.typeFirstName();
        checkoutPage.typeLastName();
        checkoutPage.typePostalCode();
        checkoutPage.clickOnContinueButton();
        scrollToEnd();
        checkoutPage.clickOnFinishButton();
        scrollUp();
        //Verify that the order is Completed
        String expectedResult ="CHECKOUT: COMPLETE!";
        WebElement title = driver.findElement(By.xpath("//*[@id=\"header_container\"]/div[2]"));
        String actualResult = title.getText();
        Assert.assertEquals(actualResult, expectedResult);
    }
}
