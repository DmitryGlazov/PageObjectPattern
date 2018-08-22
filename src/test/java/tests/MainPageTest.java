package tests;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.*;
import org.testng.Assert;

import pageobjects.MainPage;
import pageobjects.FeedProPage;
import base.TestsBase;


public class MainPageTest extends TestsBase{

    @DataProvider
    public Object[][] loginFailTestData() {
        return new Object[][] {
                new Object[] { "12", "12"},
                new Object[] { "asdasd", "asdasd"},
                new Object[] {"fghh", "asdasd"}
        };
    }

    @Test(dataProvider = "loginFailTestData", enabled = true)
    public void testLoginFail(String email, String passw){
        MainPage mainPage = new MainPage(driver);

        mainPage.login(email, passw);
        Assert.assertEquals(driver.getTitle(), "Customer Login");

    }

    @Test
    public void SearchTest() {
        MainPage mainPage = new MainPage(driver);
        mainPage.searchProduct();

        FeedProPage feedProPage = new FeedProPage(driver);
        Assert.assertEquals(feedProPage.getProductHeaderText(), "GoMage Feed Pro for Magento ®");
    }


}
