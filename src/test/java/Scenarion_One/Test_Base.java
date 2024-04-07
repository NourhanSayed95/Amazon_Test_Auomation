package Scenarion_One;

import Scenario_One.Search_Page;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.asserts.SoftAssert;

public class Test_Base {
    WebDriver driver = null;
    Search_Page search;
    SoftAssert soft;
    @BeforeTest
    public void OpenBrowser() throws InterruptedException {
        String chromePath = System.getProperty("user.dir") +"\\src\\main\\resources\\chromedriver.exe";

        System.setProperty("webdriver.chrome.driver", chromePath);
        driver = new ChromeDriver();
        driver.navigate().to("https://www.amazon.com");
        Dimension dimension = new Dimension(1024, 768);
        driver.manage().window().setSize(dimension);
        //driver.manage().window().maximize();
        Thread.sleep(2000);
        search = new Search_Page();
        soft = new SoftAssert();
    }
    @AfterTest
    public void CloseDriver() throws InterruptedException {
        Thread.sleep(3000);
        driver.quit();
    }
}
