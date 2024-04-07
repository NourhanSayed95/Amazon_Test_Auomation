package Scenarion_Tow;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Page4 {
    public Page4(WebDriver driver) {
    }
    public WebElement Health_Household(WebDriver driver){
        return driver.findElement(By.xpath("(//input[@type='checkbox'])[29]"));
    }
    public WebElement Home_Kitchen(WebDriver driver){
        return driver.findElement(By.xpath("(//input[@type='checkbox'])[30]"));
    }
    public WebElement discount(WebDriver driver){
        return driver.findElement(By.xpath("//span[normalize-space()='10% off or more']"));
    }
    public WebElement page3(WebDriver driver){
        return driver.findElement(By.xpath("(//a[normalize-space()='3'])[1]"));
    }
    public WebElement page4(WebDriver driver){
        return driver.findElement(By.xpath("(//a[normalize-space()='4'])[1]"));
    }
    public WebElement selectItem(WebDriver driver){
        return driver.findElement(By.xpath("(//div[@class='DealGridItem-module__dealItemDisplayGrid_e7RQVFWSOrwXBX4i24Tqg DealGridItem-module__withBorders_2jNNLI6U1oDls7Ten3Dttl DealGridItem-module__withoutActionButton_2OI8DAanWNRCagYDL2iIqN'])[11]"));
    }


}
