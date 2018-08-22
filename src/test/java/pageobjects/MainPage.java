package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class MainPage extends PageObject {

    @FindBy(xpath = "//span[contains(text(), 'Search')]")
    private WebElement searchButton;

    @FindBy(id = "search")
    private WebElement searchInput;

    @FindBy(xpath = "//span[contains(text(), 'Login ')]")
    private WebElement loginButton;

    @FindBy(id = "mini-login")
    private WebElement email;

    @FindBy(id = "mini-password")
    private WebElement password;

    @FindBy(xpath = "//button[@type = 'submit']")
    private WebElement submitButton;

    public MainPage(WebDriver driver){
        super(driver);
    }

    public void searchProduct(){
        searchButton.click();
        searchInput.sendKeys(new String("feed pro"));
        searchInput.submit();
    }

    public void login(String loginEmail, String loginPassword) {
        loginButton.click();

        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.elementToBeClickable(email));

        email.sendKeys(loginEmail);
        password.sendKeys(loginPassword);
        submitButton.click();

    }
}
