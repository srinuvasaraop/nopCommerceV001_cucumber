package stepdefinitions;

import io.cucumber.java.en.*;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.junit.Assert;
import org.openqa.selenium.chrome.ChromeDriver;
import pageObjects.AddcustomerPage;
import pageObjects.LoginPage;
import pageObjects.SerachCustPage;

public class Steps extends BaseClass {
    public Steps() {

    }

    @Given("User Launch Chrome browser")
    public void user_launch_chrome_browser() {
        logger = Logger.getLogger("nopcommerce");//added logger
        PropertyConfigurator.configure("log4j.properties");//added logger
        System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "//Drivers/chromedriver.exe");
        driver = new ChromeDriver();
        logger.info("**********launching browser************");
        driver.manage().window().maximize();
        lp = new LoginPage(driver);
        addcustomerPage = new AddcustomerPage(driver);
        serachCustPage = new SerachCustPage(driver);
        driver.manage().window().maximize();
        lp = new LoginPage(driver);
        addcustomerPage = new AddcustomerPage(driver);
        serachCustPage = new SerachCustPage(driver);

    }

    @When("User Opens URL {string}")
    public void user_opens_url(String url) {
        logger.info("**********opening URL************");
        driver.get(url);
    }

    @When("User Enters Email as {string} and password as {string}")
    public void user_enters_email_as_and_password_as(String email, String password) {
        logger.info("**********providing login detaisl************");
        lp.setUsername(email);
        lp.setPassword(password);
    }

    @When("Click on Login")
    public void click_on_login() {
        logger.info("**********started login ************");
        lp.clickLogin();
    }

    @Then("Page Title should be {string}")
    public void page_title_should_be(String title) {
        if (driver.getPageSource().contains("Login was unsuccessful.")) {
            logger.info("**********log in passed ************");
            driver.close();
            Assert.assertTrue(false);
        } else {
            logger.info("**********log in failed ************");
            Assert.assertEquals(title, driver.getTitle());
        }
    }

    @When("user click on Logout link")
    public void user_click_on_logout_link() throws InterruptedException {
        logger.info("**********click on logiut link ************");
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
            logger.info("********** Adding new Customer ************");
            logger.info("********** providing Customer  details ************");
            String email = randomstring() + "@gmail.com";
            addcustomerPage.setEmail(email);
            addcustomerPage.setPassword("Paasword@6789");
            addcustomerPage.firstName("srinivas");
            addcustomerPage.lastName("pandi");
            addcustomerPage.gender("Female");
            addcustomerPage.setdateofbirth("15/07/1994");
            addcustomerPage.companyName("Essilor India private limited");
            addcustomerPage.istaxecept("Yes");
            addcustomerPage.newsLetter("Your store name");
            addcustomerPage.setCustomerRoles("Guests ");
            addcustomerPage.selectVendor("Vendor 1");
            addcustomerPage.adminComments("this is new  admin working");

        } catch (Exception exception) {
            throw new RuntimeException("user info error " + exception.getMessage());
        }

    }

    @When("click on Save button")
    public void click_on_save_button() {
        try {
            logger.info("********** Saving Customer data ************");
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
        // driver.close();
    }

    //**************steps for searching customer by using Email Id*******//
    @Then("User can view Customers dashboard")
    public void user_can_view_customers_dashboard() {
        // serachCustPage.searchmagnifier();
    }


    @When("User Enter Customer  EmailID {string}")
    public void user_enter_customer_email_id(String email) {

        serachCustPage.setEmail(email);
    }

    @When("User Click on search button")
    public void user_click_on_search_button() {
        try {
            logger.info("********** Searching a new Customer ************");
            serachCustPage.searchButton();
            Thread.sleep(5000);
        } catch (Exception e) {
            System.out.println("serach button erro" + e.getMessage());
        }


    }


    @Then("User Should found Email id in the search table {string}")
    public void user_should_found_email_id_in_the_search_table(String email) {
        boolean actual = serachCustPage.searchCustomerByemail(email);
        Assert.assertTrue(actual);
    }

}
