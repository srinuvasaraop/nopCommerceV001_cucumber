//package utilities;
//
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//
//public class CommonUtility {
//
//	WaitsUtility waitsUtility;
//	public CommonUtility()
//	{
//		waitsUtility=new WaitsUtility();
//	}
////****************Reusable methods for navigation******************
//	// public WebDriver driver;
//	// #1.Re-usable method for Browser back operations
//	public void browserBack(WebDriver driver) {
//		driver.navigate().back();
//		System.out.println("browser back button is pressed");
//	}
//
//	// #2.Re-usable method for Browser forward operations
//	public void browserForword(WebDriver driver) {
//		driver.navigate().forward();
//		System.out.println("browser forword button is pressed");
//	}
//
//	// #3.Re-usable method for Browser refreshPage operations
//	public void refreshPage(WebDriver driver) {
//		driver.navigate().refresh();
//		System.out.println("browser page is refreshed....");
//	}
//
//	// #4.Re-usable method for Url navigation operations
//	public void navigateTo(WebDriver driver, String ValidUrl) {
//		driver.navigate().to(ValidUrl);
//	}
//
//	// 5.Re-usable method for send keys operation.
//	public void setDataToElement(WebDriver driver, WebElement element, String data) {
//		try {
//			//wait until the elemenet is available
//			waitsUtility.waitUntilElementLocated(driver,3,element);
//			//first clear the data
//			element.clear();
//			//send the data
//			element.sendKeys(data);
//			System.out.println("data entered successfully..............");
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
//	}
//	//#6.Re-usable method for click operation.
//	public void clickOnElemengt(WebDriver driver, WebElement element)
//	{
//		try
//		{
//			element.click();
//			System.out.println("Element clicked successfully.............");
//		}catch(Exception e)
//		{
//			e.printStackTrace();
//		}
//	}
//
//}
