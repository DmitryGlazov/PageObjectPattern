package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class FeedProPage extends PageObject {

    @FindBy(xpath = "//div[@class='product-name']/h1")
    private WebElement productHeader;

    public FeedProPage(WebDriver driver) {
        super(driver);
    }

    public String getProductHeaderText() {
        return productHeader.getText();
    }
}
