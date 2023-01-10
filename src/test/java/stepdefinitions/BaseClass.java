package stepdefinitions;

import org.apache.commons.lang.RandomStringUtils;
import org.openqa.selenium.WebDriver;
import pageObjects.AddcustomerPage;
import pageObjects.LoginPage;
import pageObjects.SerachCustPage;


public class BaseClass {
    public WebDriver driver;
    public LoginPage lp;
    public AddcustomerPage addcustomerPage;
    public SerachCustPage serachCustPage;


    //created for geneating random string for unique email
    public static String randomstring()
    {
        String generatedstring= RandomStringUtils.randomAlphabetic(5);
        return generatedstring;
    }
}
