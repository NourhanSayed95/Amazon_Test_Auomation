package Scenario_One;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Search_Page {
    public WebElement searchPOM(WebDriver driver) {
        return driver.findElement(By.id("twotabsearchtextbox"));
    }
    public WebElement continuePOM(WebDriver driver){

        return driver.findElement(By.className("a-button-text"));
    }
    public WebElement choosePOM(WebDriver driver){
        return driver.findElement(By.xpath("//span[@class=\"a-size-base-plus a-color-base a-text-normal\"]"));
    }
    public WebElement add_to_cart_POM(WebDriver driver){
        return driver.findElement(By.xpath("(//input[@id='add-to-cart-button'])[1]") );
    }
    public WebElement go_to_cart_POM(WebDriver driver){
        return driver.findElement(By.xpath("//a[@href=\"/cart?ref_=sw_gtc\"]"));
    }
    public WebElement actualResultPOM(WebDriver driver){
        return driver.findElement(By.xpath("//h1[normalize-space()='Added to Cart']"));
    }
    public void searchSteps(WebDriver driver, String nameproduct) {
        searchPOM(driver).clear();
        searchPOM(driver).sendKeys(nameproduct);
        searchPOM(driver).sendKeys(Keys.ENTER);
    }
}