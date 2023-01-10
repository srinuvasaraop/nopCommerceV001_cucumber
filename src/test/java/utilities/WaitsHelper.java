package utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class WaitsHelper {

    public WebDriver driver;

    public WaitsHelper(WebDriver driver) {
        this.driver = driver;
    }

    public void  WaitForElement(WebElement element, long waittime)
    {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(waittime));
        wait.until(ExpectedConditions.visibilityOf(element));
    }
}
