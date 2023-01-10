package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends BasePage{
    public WebDriver ldriver;

    public LoginPage(WebDriver rdriver) {
super(rdriver);
    }

    @FindBy(id = "Email")
    @CacheLookup
    WebElement txtEmail;

    @FindBy(id = "Password")
    @CacheLookup
    WebElement txtPassword;

    @FindBy(xpath = "//div[@class='buttons']/button[contains(text(),'Log in')]")
    @CacheLookup
    WebElement btnLogin;

    @FindBy(linkText = "Logout")
    @CacheLookup
    WebElement lnkLogout;

    public void setUsername(String username) {
        txtEmail.clear();
        txtEmail.sendKeys(username);
    }

    public void setPassword(String password) {
        txtPassword.clear();
        txtPassword.sendKeys(password);

    }

    public void clickLogin() {
        btnLogin.click();

    }

    public void clickLogout() {
        lnkLogout.click();

    }
}
