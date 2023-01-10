package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import utilities.WaitsHelper;

import java.util.List;

public class SerachCustPage extends BasePage{
    public WebDriver driver;
    public WaitsHelper waitsHelper;

    public SerachCustPage(WebDriver driver) {
        super(driver);
       // this.driver = driver;
        waitsHelper = new WaitsHelper(driver);
    }

    @FindBy(how = How.XPATH, using = "//div[contains(text(),'Search')]")
    @CacheLookup
    WebElement Serach;
    @FindBy(how = How.XPATH, using = "//input[@id='SearchEmail']")
    @CacheLookup
    WebElement txtEmail;
    @FindBy(how = How.ID, using = "SearchFirstName")
    @CacheLookup
    WebElement txtFirstName;
    @FindBy(how = How.ID, using = "SearchLastName")
    @CacheLookup
    WebElement txtLasttName;
    @FindBy(how = How.ID, using = "search-customers")
    @CacheLookup
    WebElement btnSearch;

    @FindBy(how = How.ID, using = "customers-grid_wrapper")
    @CacheLookup
    WebElement tableSearchResult;
    @FindBy(how = How.XPATH, using = "//table[@id='customers-grid']")
    @CacheLookup
    WebElement table;
    @FindBy(how = How.XPATH, using = "//table[@id='customers-grid']/descendant::tbody/tr")
  //  @CacheLookup
    List<WebElement> tableRow;
    @FindBy(how = How.XPATH, using = "//table[@id='customers-grid']/following-sibling::td")
    @CacheLookup
    List<WebElement> tableColumn;

    public void searchmagnifier() {
        try {
            //     waitsHelper.WaitForElement(Serach, 30);
            Serach.click();

        } catch (Exception e) {
            throw new RuntimeException("search magnifier is not present " + e.getMessage());
        }

    }

    public void setEmail(String email) {
        try {
            waitsHelper.WaitForElement(txtEmail, 30);
            txtEmail.clear();
            txtEmail.sendKeys(email);
        } catch (Exception e) {
            throw new RuntimeException("email id not set " + e.getMessage());
        }

    }

    public void setFirstName(String firstName) {
        try {
            waitsHelper.WaitForElement(txtFirstName, 30);
            txtFirstName.clear();
            txtFirstName.sendKeys(firstName);
        } catch (Exception e) {
            throw new RuntimeException("first name is not  set" + e.getMessage());
        }

    }

    public void setLastName(String lasttName) {
        try {
            waitsHelper.WaitForElement(txtLasttName, 30);
            txtLasttName.clear();
            txtLasttName.sendKeys(lasttName);
        } catch (Exception e) {
            throw new RuntimeException("last name is not  set" + e.getMessage());
        }

    }

    public void searchButton() {
        try {
            waitsHelper.WaitForElement(btnSearch, 30);
            btnSearch.click();
        } catch (Exception e) {
            throw new RuntimeException("search button not clicked" + e.getMessage());
        }

    }

    public int getNoOfRows() {
        int rows=tableRow.size();
        return (rows);
    }

    public int getNoOfColum() {
        return (tableColumn.size());
    }

    public boolean searchCustomerByemail(String email) {
        boolean flag = false;
        for (int i = 1; i <=getNoOfRows(); i++) {
            String emailid = table.findElement(By.xpath("//div[@id='customers-grid_wrapper']//tbody/tr[" + i + "]/td[2]")).getText();
            System.out.println(emailid);
            if (emailid.equals(email)) {
                flag = true;
            }
        }
        return flag;
    }

}
