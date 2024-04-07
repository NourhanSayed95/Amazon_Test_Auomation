package Scenarion_One;

import org.testng.annotations.Test;

public class Check_Cart extends Test_Base{


    @Test(priority = 1)
    public void search_product() throws InterruptedException {
        Thread.sleep(10000);

        search.searchSteps(driver,"car accessories");
        search.choosePOM(driver).click();



    }
    @Test(priority = 2)
    public void selectItem () throws InterruptedException{
        search.add_to_cart_POM(driver).click();
        String expectedResult ="Added to Cart";
        String actualResult = search.actualResultPOM(driver).getText();
        soft.assertTrue(actualResult.equals(expectedResult));
        Thread.sleep(1000);
    }
    @Test(priority = 3)
    public void check_cart(){
        search.go_to_cart_POM(driver).click();

        soft.assertAll();

    }
}
