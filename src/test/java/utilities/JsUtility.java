//package utilities;
//
//import org.apache.logging.log4j.LogManager;
//import org.apache.logging.log4j.Logger;
//import org.openqa.selenium.JavascriptExecutor;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//
//public class JsUtility {
//	/*
//	 * for previous utilities we are paasing (Webriver driver) for each method its not
//	 * good practice so that create a constroctor(Webriver driver) and pass the Webdriver its
//	 * available to all the methods
//	 */
//	public WebDriver driver;
//
//	public JsUtility(WebDriver driver)
//	{
//		this.driver=driver;
//	}
//	public static Logger log = LogManager.getLogger(JsUtility.class);
//
////#1.utility method for scroll down from top to bottom.
//	public void scrollDownTop_Bottom() {
//		JavascriptExecutor js = (JavascriptExecutor) driver;
//		js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
//		log.debug("page scroll down completed");
//	}
//
////#2.utility method for scroll down from using numbe of pixels
//	public void scrollDownTop_Botto_WithHeight( int Height) {
//		JavascriptExecutor js = (JavascriptExecutor) driver;
//		js.executeScript("window.scrollBy(0,'" + Height + "')", "");
//		log.debug("page scroll down completed with pixels we provided");
//	}
//
////#3.utility method for scroll into web element
//	public void scrollinto_Webelement( WebElement element) {
//		try {
//			JavascriptExecutor js = (JavascriptExecutor) driver;
//			js.executeScript("arguments[0].scrollIntoView();", element);
//			log.debug("page scroll down using particular element in view");
//		} catch (Exception ex) {
//			log.info("Exception raised..." + ex);
//		}
//
//	}
//
////#4.utility method for scroll up page
////change negitive sign that's enough for coding
//	public void scrollUpPage() {
//		try {
//			JavascriptExecutor js = (JavascriptExecutor) driver;
//			js.executeScript("window.scrollBy(0,-document.body.scrollHeight)");
//			log.debug("page scroll up executed....");
//		} catch (Exception ex) {
//			log.info("Exception raised..." + ex);
//		}
//
//	}
//
//	// #5.utility method for get Title page
//	public void getPageTitle() {
//		try {
//			JavascriptExecutor js = (JavascriptExecutor) driver;
//			//String string =	js.executeScript("return document.getElementsByTagName('title')[0].innerHTML;").toString();
//			String string = js.executeScript("return document.title").toString();
//			  System.out.print("title captured****"+string);
//			log.debug("page Title captured@@@@"+string);
//		} catch (Exception ex) {
//			log.info("Exception raised..." + ex);
//		}
//
//	}
//	// #5.utility method for  page Refresh
//		public void refreshPage() {
//			try {
//				JavascriptExecutor js = (JavascriptExecutor)driver;
//				js.executeScript("history.go(0)");
//				log.debug("page refreshed ");
//			} catch (Exception ex) {
//				log.info("Exception raised..." + ex);
//			}
//
//		}
//}
