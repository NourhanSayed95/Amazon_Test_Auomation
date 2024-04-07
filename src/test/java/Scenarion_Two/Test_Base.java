package Scenarion_Two;

import Scenarion_Tow.Page4;
import Scenarion_Tow.ToDayDealsPage;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.asserts.SoftAssert;

public class Test_Base {
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
}
