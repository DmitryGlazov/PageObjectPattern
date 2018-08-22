package base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.*;
import pageobjects.MainPage;

public class TestsBase {
    protected static WebDriver driver;

    @BeforeClass
    public void setUp(){
        System.setProperty("webdriver.chrome.driver",
                "Resources/chromedriver");

        System.setProperty("webdriver.gecko.driver", "Resources/geckodriver");
        driver = new ChromeDriver();
//        driver = new FirefoxDriver();
    }

    @BeforeMethod
    public void setEnv(){
        driver.navigate().to("https://www.gomage.com");
        driver.manage().window().maximize();
    }

    @AfterMethod
    public void cleanUp(){
        driver.manage().deleteAllCookies();

    }

    @AfterClass
    public static void tearDown(){
        driver.quit();
    }
}
