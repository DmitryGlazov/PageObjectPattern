package tests;

import org.testng.annotations.*;
import org.testng.Assert;

import pageobjects.MainPage;
import pageobjects.FeedProPage;
import base.TestsBase;

public class MainPageTest extends TestsBase{

    @Test
    public void testLoginFail(){
        MainPage mainPage = new MainPage(driver);

        mainPage.login("asdasdasd", "asdasda");
        Assert.assertEquals(driver.getTitle(), "Customer Login");

    }

    @Test
    public void SearchTest(){
        MainPage mainPage = new MainPage(driver);
        mainPage.searchProduct();

        FeedProPage feedProPage = new FeedProPage(driver);
        Assert.assertEquals(feedProPage.getProductHeaderText(),"GoMage Feed Pro for Magento ®");
    }
}
