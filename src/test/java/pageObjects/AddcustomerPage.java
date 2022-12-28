package pageObjects;

import org.junit.experimental.categories.ExcludeCategories;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.zip.DataFormatException;

public class AddcustomerPage {
    public WebDriver ldriver;

    public AddcustomerPage(WebDriver rdriver) {
        ldriver = rdriver;
        PageFactory.initElements(rdriver, this);
    }

    public By Dashboard = By.xpath("//div[@class='content-header']/h1[contains(text(),'Dashboard')]");
    By lnkcutomers_menu = By.xpath("//a[@href='#']//p[contains(text(),'Customers')]");
    By lnkcutomers_menuitem = By.xpath("//a[@href='/Admin/Customer/List']//p[contains(text(),'Customers')]");
    By btnaddnew = By.xpath("//a[@class='btn btn-primary']");
    By txtEmail = By.id("Email");
    By txtPassword = By.id("Password");
    By txtFirstName = By.id("FirstName");
    By txtLastname = By.id("LastName");

    By rdMaleGender = By.id("Gender_Male");  //******Genders*********//
    By rdFemaleGneder = By.id("Gender_Female");

    By txtDob = By.id("DateOfBirth");
    By istax_except= By.id("//input[@id='IsTaxExempt']");
    By txtCompanyname = By.id("Company");

    By txtCustomerRoles = By.id("SelectedCustomerRoleIds_taglist");        //*************rolles**********//
    By listitemAdministrator = By.xpath("//span[contains(text(),'Administrators')]");
    By listitemGuest = By.xpath("//span[contains(text(),'Guests')]");
    By listitemRegistered = By.xpath("//span[contains(text(),'Registered')]");
    By listitemForumModerators = By.xpath("//span[contains(text(),'Forum Moderators')]");

    By ManagerofVendor = By.xpath("//select[@id='VendorId']");                         //******vendors**********//
    By listeitemVendor1 = By.xpath("//select[@id='VendorId']/option[contains(text(),'Vendor 1')]");
    By listitemVendor2 = By.xpath("//select[@id='VendorId']/option[contains(text(),'Vendor 2')]");
    By Active = By.id("Active");
    By Admincomment = By.id("AdminComment");
    By Save = By.name("save");
    public By CustomerInfo = By.xpath("//div[contains(text(),'Customer info')]");

    //***********Action Methods**************//
    public void clickOnCustomersMenu() {
        ldriver.findElement(lnkcutomers_menu).click();
    }

    public void clickOnCustoMersMenuItem() {
        ldriver.findElement(lnkcutomers_menuitem).click();
    }

    public void clickOnAddnew() {
        ldriver.findElement(btnaddnew).click();
    }

    public void setEmail(String email) {
        ldriver.findElement(txtEmail).sendKeys(email);
    }

    public void setPassword(String password) {
        ldriver.findElement(txtPassword).sendKeys(password);
    }

    public void firstName(String firstname) {
        ldriver.findElement(txtFirstName).sendKeys(firstname);
    }

    public void lastName(String lastname) {
        ldriver.findElement(txtLastname).sendKeys(lastname);
    }

    public void gender(String gender) {
        // By Gender = By.xpath("//div[@class='form-check']/lable[contains(text(),'" + gender + "')]");
        By Gender = By.xpath("//input[@type='radio']/following-sibling::label[contains(text(),'" + gender + "')]");
        try {
//            WebElement radioBtn1=ldriver.findElement(Gender);
//            ((JavascriptExecutor) ldriver).executeScript("arguments[0].checked = true;", radioBtn1);
//            WebElement element = ldriver.findElement(Gender);
//            WebDriverWait wait = new WebDriverWait(ldriver, Duration.ofSeconds(120));
//            wait.until(ExpectedConditions.elementToBeClickable(element));
//            element.click();
            ldriver.findElement(Gender).click();
        } catch (Exception e) {
            throw new RuntimeException(" Gender is not selected " + e.getMessage());
        }

    }

    public void setdateofbirth(String dob) {
        try {
            //  By setdob = By.xpath("//input[@id='DateOfBirth']/self::input[@value='" + dob + "']");
            By setdob = By.id("DateOfBirth");
            ldriver.findElement(setdob).sendKeys(dob);
        } catch (Exception e) {


                throw new RuntimeException("date was not matched " + e.getMessage());


        }
    }
    public void istaxecept(String tax)
    {
        if(tax.equals("Yes"))
        {
            ldriver.findElement(istax_except).click();
        }

    }
    public void newsLetter(String letter)
    {
        try{
            //  By txtNewsletter = By.id("SelectedNewsletterSubscriptionStoreIds_taglist");
            By news_letter = By.xpath("//ul[@id='SelectedNewsletterSubscriptionStoreIds_taglist']/descendant::span[contains(text(),'"+letter+"')]");
            ldriver.findElement(news_letter).click();
        }catch (Exception e)
        {
         throw new RuntimeException("newsletter selection error "+e.getMessage());
        }
    }
    public void companyName(String companyname) {
        ldriver.findElement(txtCompanyname).sendKeys(companyname);
    }

    public void selectVendor(String Vendro) {
        ldriver.findElement(ManagerofVendor).click();
        try {
            By listitemVendors = By.xpath("//select[@id='VendorId']/option[contains(text(),'" + Vendro + "')]");
            ldriver.findElement(listitemVendors).click();
        } catch (Exception e) {
            throw new RuntimeException("vendor not selected" + e.getMessage());
        }
    }

    public void adminComments(String admincomments) {
        ldriver.findElement(Admincomment).sendKeys(admincomments);
    }

    public void save() {
        ldriver.findElement(Save).click();
    }

    public void setCustomerRoles(String roles) {
        By AllRoles = By.xpath("//span[contains(text(),'" + roles + "')]");
        try {
            ldriver.findElement(AllRoles).click();
        } catch (RuntimeException re) {
            throw new RuntimeException("Customer Roles are not selected " + re.getMessage());
        }
    }
}
