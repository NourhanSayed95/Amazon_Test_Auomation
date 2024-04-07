package Scenarion_Tow;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ToDayDealsPage {
    public ToDayDealsPage(WebDriver driver) {
    }

    public WebElement grocery(WebDriver driver){
        return driver.findElement(By.xpath("//span[normalize-space()='Grocery & Gourmet Food']"));
    }
    public WebElement headPhone(WebDriver driver){
        return driver.findElement(By.xpath("//span[normalize-space()='Headphones & Earbuds']"));
    }
    public WebElement discount(WebDriver driver){
        return driver.findElement(By.xpath("//span[normalize-space()='10% off or more']"));
    }
    public WebElement page2(WebDriver driver){
        return driver.findElement(By.xpath("//a[normalize-space()='2']"));
    }
    public WebElement selectItem(WebDriver driver){
        return driver.findElement(By.className("DealGridItem-module__dealItemContent_1vFddcq1F8pUxM8dd9FW32"));
    }
    public WebElement addToCart(WebDriver driver){
        return driver.findElement(By.name("submit.add-to-cart"));
    }
    public WebElement assertion(WebDriver driver){
        return driver.findElement(By.xpath("//h1[normalize-space()='Added to Cart']"));
    }
}
