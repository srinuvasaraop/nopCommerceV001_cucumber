package stepdefinitions;

import io.cucumber.java.en.*;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pageObjects.AddcustomerPage;
import pageObjects.LoginPage;

public class Steps {
    public WebDriver driver;
    public LoginPage lp;
    public AddcustomerPage addcustomerPage;

    @Given("User Launch Chrome browser")
    public void user_launch_chrome_browser() {
        System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "//Drivers/chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        lp = new LoginPage(driver);
        addcustomerPage = new AddcustomerPage(driver);
    }

    @When("User Opens URL {string}")
    public void user_opens_url(String url) {
        driver.get(url);
    }

    @When("User Enters Email as {string} and password as {string}")
    public void user_enters_email_as_and_password_as(String email, String password) {
        lp.setUsername(email);
        lp.setPassword(password);
    }

    @When("Click on Login")
    public void click_on_login() {
        lp.clickLogin();
    }

    @Then("Page Title should be {string}")
    public void page_title_should_be(String title) {
        if (driver.getPageSource().contains("Login was unsuccessful.")) {
            driver.close();
            Assert.assertTrue(false);
        } else {
            Assert.assertEquals(title, driver.getTitle());
        }
    }

    @When("user click on Logout link")
    public void user_click_on_logout_link() throws InterruptedException {
        lp.clickLogout();
        Thread.sleep(3000);
    }

    //    @Then("Page Title Should be {string}")
//    public void page_title_should_be(String string) {
//        // Write code here that turns the phrase above into concrete actions
//        throw new io.cucumber.java.PendingException();
//    }

    //**************addcustomerpage stepdefinitions*************//
    @Then("User can view Dashboard")
    public void user_can_view_dashboard() {
        try {
            String txtlgn = driver.findElement(addcustomerPage.Dashboard).getText();
            if (txtlgn.equals("Dashboard")) {
                Assert.assertTrue(true);
            } else {
                Assert.assertTrue(false);
            }
        } catch (Exception exception) {
            throw new RuntimeException("Dashboard not displayed" + exception.getMessage());
        }
    }

    @When("User click on customers menu")
    public void user_click_on_customers_menu() {
        addcustomerPage.clickOnCustomersMenu();
    }

    @When("User click on customers Menu Item")
    public void user_click_on_customers_menu_item() throws InterruptedException {
        Thread.sleep(5000);
        addcustomerPage.clickOnCustoMersMenuItem();
    }

    @When("click on Add new button")
    public void click_on_add_new_button() throws InterruptedException {
        try {
            Thread.sleep(5000);
            addcustomerPage.clickOnAddnew();
        } catch (InterruptedException interruptedException) {
            throw new InterruptedException("wait interrupted " + interruptedException.getMessage());
        }

    }

    @Then("User can view Add new customer page")
    public void user_can_view_add_new_customer_page() {
        String name = driver.findElement(addcustomerPage.CustomerInfo).getText();
        if (name.equals("Customer info")) {
            Assert.assertTrue(true);
        } else {
            Assert.assertTrue(false);
        }
    }

    @When("User enter customer info")
    public void user_enter_customer_info() {
        try {
            addcustomerPage.setEmail("p.srinu4b1@gmail.com");
            addcustomerPage.setPassword("Paasword@6789");
            addcustomerPage.firstName("srinivas");
            addcustomerPage.lastName("pandi");
            addcustomerPage.gender("Female");
            addcustomerPage.setdateofbirth("15/5/1994");
            addcustomerPage.companyName("Essilor India private limited");
           // addcustomerPage.istaxecept("Yes");
            addcustomerPage.newsLetter("Your store name");
            addcustomerPage.setCustomerRoles("Administrators");
            addcustomerPage.selectVendor("Vendor 1");
            addcustomerPage.adminComments("this is new  admin working");

        } catch (Exception exception) {
            throw new RuntimeException("user info error " + exception.getMessage());
        }

    }

    @When("click on Save button")
    public void click_on_save_button() {
        try {
            addcustomerPage.save();
        } catch (Exception exception) {
            throw new RuntimeException("save button error" + exception.getMessage());
        }
    }

    @Then("User can view confirmation message")
    public void user_can_view_confirmation_message() {

    }

    @Then("close browser")
    public void close_browser() {
        driver.close();
    }


}
