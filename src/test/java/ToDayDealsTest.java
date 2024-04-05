import org.example.ToDayDealsPage;
import org.openqa.selenium.By;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;
import org.testng.asserts.SoftAssert;
public class ToDayDealsTest {
    WebDriver driver ;
    ToDayDealsPage deals;
    @BeforeTest
    public void OpenBrowser()  {
        String chromePath = System.getProperty("user.dir") +"\\src\\main\\resources\\chromedriver.exe";

        System.setProperty("webdriver.chrome.driver", chromePath);
        driver = new ChromeDriver();

        driver.manage().window().setSize(new Dimension(1024, 768));
        driver.get("https://www.amazon.com/gp/goldbox?ref_=nav_cs_gb");
        String expectedResult = "Today's Deals";
        String actualResult = driver.findElement(By.tagName("h1")).getText();
        SoftAssert soft = new SoftAssert();
        soft.assertEquals(actualResult.contains(expectedResult),true,"Open ToDay Deals Directory");

     deals = new ToDayDealsPage(driver);
    }
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
