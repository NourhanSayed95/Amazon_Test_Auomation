package Scenarion_One;

import org.testng.annotations.Test;

public class Car_Accessories  extends Test_Base{


    @Test(priority = 2)
    public void search_product() throws InterruptedException {
        Thread.sleep(10000);

        search.searchSteps(driver,"car accessories");
        search.choosePOM(driver).click();



    }



}
