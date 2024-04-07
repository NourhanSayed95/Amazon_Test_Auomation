package Scenarion_Two;

import Scenarion_Tow.ToDayDealsPage;
import org.openqa.selenium.By;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;
import org.testng.asserts.SoftAssert;
public class ToDayDealsTest extends Test_Base{

    @Test
    public void today_Deals() throws InterruptedException {
        deals.grocery(driver).click();
        deals.headPhone(driver).click();
        deals.discount(driver).click();
        Thread.sleep(7000);
        deals.page2(driver).click();
        Thread.sleep(7000);
        deals.selectItem(driver).click();
        Thread.sleep(7000);
        deals.addToCart(driver).click();
        Thread.sleep(7000);
        String expectedResults = "Added to Cart";
        String actualResults = deals.assertion(driver).getText();
        SoftAssert soft = new SoftAssert();
        soft.assertEquals(actualResults.contains(expectedResults),true,"Item Added To Cart");
    }

}
