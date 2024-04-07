package Scenarion_Two;

import Scenarion_Tow.Page4;
import Scenarion_Tow.ToDayDealsPage;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class TestPage4 extends Test_Base{

        @Test
    public void page4Deals() throws InterruptedException {
      Deals.Health_Household(driver).click();
      Deals.Home_Kitchen(driver).click();
      Deals.discount(driver).click();
            Thread.sleep(7000);
      Deals.page3(driver).click();
            Thread.sleep(7000);
      Deals.page4(driver).click();
            Thread.sleep(7000);
      Deals.selectItem(driver).click();
            Thread.sleep(7000);
      deals.addToCart(driver).click();
            String expectedResults = "Added to Cart";
            String actualResults = deals.assertion(driver).getText();
            SoftAssert soft = new SoftAssert();
            soft.assertEquals(actualResults.contains(expectedResults),true,"Item Added To Cart");
    }
}
