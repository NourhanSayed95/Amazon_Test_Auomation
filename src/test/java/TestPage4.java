import org.example.Page4;
import org.example.ToDayDealsPage;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class TestPage4 {


        WebDriver driver ;

        ToDayDealsPage deals;
         Page4 Deals;

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
            Deals = new Page4(driver);
        }
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
