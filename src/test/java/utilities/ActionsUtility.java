//package utilities;
//
//import org.openqa.selenium.JavascriptExecutor;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.interactions.Actions;
//
//public class ActionsUtility {
//	Actions actions;
//
//	// 1.Right click operation on Webelement
//	public void rightClickOperations(WebDriver driver, WebElement element) {
//		try {
//			actions = new Actions(driver);
//			System.out.println("action class");
//			actions.contextClick(element).build().perform();
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
//	}
//
//	// 2.Right click operations on Where mouse point is present.
//	public void rightClickOperations(WebDriver driver) {
//		try {
//			actions = new Actions(driver);
//			System.out.println("action class");
//			actions.contextClick().build().perform();
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
//	}
//
//	// 3.MouseOver Actions
//	public void MouseOver(WebDriver driver, WebElement element) {
//		try {
//			actions = new Actions(driver);
//			System.out.println("mouse over action is doing now");
//			actions.moveToElement(element).build().perform();
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
//	}
//
//	// 4.Drag and Drop
//	public void dragNdrop(WebDriver driver, WebElement src, WebElement dest) {
//		try {
//			actions = new Actions(driver);
//			System.out.println("drag and drop actions is going ");
//			actions.dragAndDrop(src, dest).build().perform();
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
//	}
//	// 5.Drag and Drop in iframes
//
//	public void dragNdrop(WebDriver driver, WebElement src, WebElement dest, WebElement iframeelement) {
//		actions = new Actions(driver);
//		// scroll into view
//		JavascriptExecutor js = (JavascriptExecutor) driver;
//		js.executeScript("arguments[0].scrollIntoView();", iframeelement);
//		// switch to iframe
//
//		try {
//			driver.switchTo().frame(0);
//			System.out.println("drag and drop actions is going ");
//			actions.dragAndDrop(src, dest).build().perform();
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
//	}
//}
