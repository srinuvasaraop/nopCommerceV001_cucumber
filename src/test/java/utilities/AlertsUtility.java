//package utilities;
//
//import org.junit.Assert;
//import org.openqa.selenium.Alert;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.support.ui.ExpectedConditions;
//import org.openqa.selenium.support.ui.WebDriverWait;
//
//import java.time.Duration;
//
//public class AlertsUtility {
//	// Re-usable methods for Alert interface
//
//	// #1.Verify alert is present or not
//	public WebDriver driver;
//
//	public boolean verifyPresenceOfAlert(WebDriver driver) {
//		boolean status = false;
//		try {
//			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
//			wait.until(ExpectedConditions.alertIsPresent());
//			status = true;
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
//		return status;
//	}
//
//	// #2.accept method
//
//	public void acceptAlert(WebDriver driver) {
//		try {
//			Alert alert = driver.switchTo().alert();
//			alert.accept();
//			System.out.println("alert is successfully accepted");
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
//	}
//
//	// #3.dismiss method
//	public void dismissAlert(WebDriver driver) {
//		try {
//			Alert alert = driver.switchTo().alert();
//			alert.dismiss();
//			System.out.println("alert is successfully dismissed");
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
//	}
//
////	#4.get the text from Alert
//	public String getTextAlert(WebDriver driver) {
//		String text = null;
//		try {
//			Alert alert = driver.switchTo().alert();
//			text = alert.getText();
//			System.out.println("alert is successfully get the text...." + text);
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
//		return text;
//	}
//
//	// #5.Verify the alert text
//	public boolean verifyAlertText(WebDriver driver,String expAlertText) {
//		boolean status = false;
//		try {
//
//			String textAlert = getTextAlert(driver);
//			Assert.assertEquals(expAlertText, textAlert);
//			System.out.println("Verify the alert text successfull");
//			status = true;
//
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
//
//		return status;
//	}
//	//#6.Send text to alert
//	public void sendText(WebDriver driver,String alertInputText)
//	{
//		try
//		{   StaticWaitUtility staticwaitutility=new StaticWaitUtility();
//			Alert alert = driver.switchTo().alert();
//			staticwaitutility.staticMediumWait();
//			alert.sendKeys(alertInputText);
//			System.out.println("send  text is  successfull");
//
//			//*************wait for 1 sec  time*********************//
//
//			staticwaitutility.staticSecWait();
//			alert.accept();
//
//			//*******again check any aleret is present
//			boolean againAlet=verifyPresenceOfAlert(driver);
//			Assert.assertTrue(againAlet);
//			System.out.println("again alert is present ");
//
//			alert.accept();
//			System.out.println("again alert is accepted ");
//		}catch (Exception e) {
//			e.printStackTrace();
//		}
//			}
//	//#7.verify alert confirmation message***********
//	public void verifyAlertConfirmationMessage(WebDriver driver,String alertInputText,String expalertConfirmation)
//	{
//		try
//		{
//			Alert alert = driver.switchTo().alert();
//			alert.sendKeys(alertInputText);
//			System.out.println("send  text is  successfull");
//
//			//*************wait for 1 sec  time*********************//
//			StaticWaitUtility staticwaitutility=new StaticWaitUtility();
//			staticwaitutility.staticSecWait();
//			alert.accept();
//
//			//*******again check any aleret is present
//			boolean againAlet=verifyPresenceOfAlert(driver);
//			Assert.assertTrue(againAlet);
//			System.out.println("again alert is prsent ");
//		    String actualconfirmation = alert.getText();
//		    Assert.assertEquals(actualconfirmation, expalertConfirmation);
//		    System.out.println("confirmation message validated");
//			alert.accept();
//			System.out.println("again alert is accepted ");
//		}
//		catch(Exception e)
//		{
//			e.printStackTrace();
//		}
//	}
//	//********some times unexpected  alets will come for that 8 and 9 methods are writen*************//
//	//#8.Press ok if alert is presented
//	public void pressOkIfAlertIsPresented(WebDriver driver)
//	{
//		boolean verifyPresenceOfAlert = verifyPresenceOfAlert(driver);
//		Assert.assertTrue(verifyPresenceOfAlert);
//		Alert alert = driver.switchTo().alert();
//		alert.accept();
//		System.out.println("alert is available and pressed ok");
//
//	}
//	//#9.press cancel if alert present
//	public void pressCancelIfAlertIsPresented(WebDriver driver)
//	{
//		boolean verifyPresenceOfAlert = verifyPresenceOfAlert(driver);
//		Assert.assertTrue(verifyPresenceOfAlert);
//		Alert alert = driver.switchTo().alert();
//		alert.dismiss();
//		System.out.println("alert is available and pressed cancel");
//
//	}
//	//#10.Validating Alert box message
//	public void ValidateAlertBoxMessage(WebDriver driver,String alertInput,String alertMessage,String alertCondition)
//	{
//
//     try
//     {
//
//    	// ((AlertsUtility) driver.switchTo().alert()).sendText(driver,alertInput);
//    	 //send email id to alter
//    	 driver.switchTo().alert().sendKeys(alertInput);
//    	 StaticWaitUtility staticWaitUtility=new StaticWaitUtility();
//    	 staticWaitUtility.staticSmallWait();
//    	 //press ok button
//    	 driver.switchTo().alert().accept();
//    	 staticWaitUtility.staticSmallWait();
//    	 //again alert displayed
//    	 driver.switchTo().alert();
//    	 staticWaitUtility.staticSmallWait();
//    	 //getting the text message of alert
//    	 String actualText = driver.switchTo().alert().getText();
//    	 driver.switchTo().alert();
//    	 if(actualText.equals(alertMessage))
//    	 {
//    		 if(alertCondition.contains("Valid User Condition"))
//    		 {
//    			 System.out.println("Forgot password valid Email Verification Scenario passed");
//    		 }
//    		 else if(alertCondition.contains("Invalid User Condition"))
//    		 {
//    			 System.out.println("Forgot password Invali user data is passed");
//    		 }
//    		 else if(alertCondition.contains("Invalid Email Condition"))
//    		 {
//    			 System.out.println("Forgot password Invalid Email Verification Scenario passed");
//    		 }
//    		 else
//    		 {
//    			 System.out.println("forgot password alert box message scenario verification is failed...");
//    		 }
//    	 }
//    	 else
//    	 {
//    		 System.out.println("forgot password validation is failed.....");
//    	 }
//    }catch (Exception e) {
//       e.printStackTrace();
//    }
//
//	}
//
//}
