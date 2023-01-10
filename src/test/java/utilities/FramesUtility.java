//package utilities;
//
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//
//import java.util.List;
//
//public class FramesUtility {
//	public WebDriver driver;
//	public WaitsUtility waitsUtility;
//	public FramesUtility()
//	{
//		waitsUtility=new WaitsUtility();
//	}
//
//	// 1.switch into frame by using frame name or id
//	public void switchToFrameByusing(WebDriver driver, String FrameNameorId) {
//		try {
//			//first check frame is visible on page
//
//			waitsUtility.waitUntilFrameIsLoaded(driver, 3, FrameNameorId);
//			driver.switchTo().frame(FrameNameorId);
//			System.out.println("driver is switched to frame by using Name or Id");
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
//	}
//
//	// 2.switch into frame by using frame index
//	public void switchToFrameByusing(WebDriver driver, int Frameindex) {
//		try {
//			//first check frame is visible on page
//
//			waitsUtility.waitUntilFrameIsLoaded(driver, 3, Frameindex);
//			//then switch to frame
//			driver.switchTo().frame(Frameindex);
//			System.out.println("driver is switched to frame by usingFrameindex");
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
//	}
//
//	// 3.switch into frame by using frame element
//	public void switchToFrameByusing(WebDriver driver, WebElement FrameElement) {
//		try {
//			//first check frame is visible on page
//			waitsUtility.waitUntilFrameIsLoaded(driver, 3, FrameElement);
//			driver.switchTo().frame(FrameElement);
//			System.out.println("driver is switched to frame by using frame element");
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
//	}
//
//	// 4.switch to parent frame
//	public void switchToFrameByusing(WebDriver driver) {
//		try {
//			driver.switchTo().parentFrame();
//			System.out.println("driver is switched to frame by using pareentFrame");
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
//	}
//
//	// 5.count all iframes
//	public void countAllIframesInPage(WebDriver driver) {
//		List<WebElement> elements = driver.findElements(By.tagName("iframe"));
//		int size = elements.size();
//		System.out.println(size);
//	}
//}
