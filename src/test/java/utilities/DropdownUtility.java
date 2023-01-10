//package utilities;
//
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.support.ui.Select;
//
//public class DropdownUtility {
//
//	   public  Select select;
////********************* methods for single select && multiselect dropdown  ***************//
//	// #1.select by visible text
//	public void selectOptionByVisibleText(WebDriver driver, WebElement element, String optionText) {
//		select = new Select(element);
//		try {
//
//			select.selectByVisibleText(optionText);
//			System.out.println("The required option ia select by visible text ");
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
//
//	}
//
//	// #2.select by index
//	public void selectOptionByIndex(WebDriver driver, WebElement element, int index) {
//		select = new Select(element);
//		try {
//
//			select.selectByIndex(index);
//			System.out.println("The required option ia select by index ");
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
//
//	}
//
//	// 3.select by value
//	public void selectOptionByValue(WebDriver driver, WebElement element, String value) {
//		select = new Select(element);
//		try {
//			select.selectByValue(value);
//			System.out.println("The required option ia select ByValue ");
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
//
//	}
//	//#4.is multiple
//	public boolean isMultiSelctOrNot(WebDriver driver,WebElement element) {
//		select = new Select(element);
//		boolean multiple = select.isMultiple();
//		System.out.println("The required option is multiselect or not ");
//        return multiple;
// 	}
//
//	//***********exclusive methods for multiselect******************//
//
//
//	//#5.deselct option by visible text
//
//	public void deselectOptionByVisibleText(WebDriver driver, WebElement element, String optionText) {
//		select = new Select(element);
//		boolean status =select.isMultiple();
//		if(status)
//		{
//			try {
//
//				select.deselectByVisibleText(optionText);
//				System.out.println("The required option ia de-select by visible text ");
//			} catch (Exception e) {
//				e.printStackTrace();
//			}
//		}else
//		{
//			System.out.println("the select is not multi select");
//		}
//
//
//	}
//   //#6.deselect option by value
//	public void deselectOptionByValue(WebDriver driver, WebElement element, String value) {
//		select = new Select(element);
//		boolean status =select.isMultiple();
//		if(status)
//		{
//			try {
//
//				select.deselectByValue(value);
//				System.out.println("The required option ia de-select byvaluet ");
//			} catch (Exception e) {
//				e.printStackTrace();
//			}
//		}else
//		{
//			System.out.println("the select is not multi select");
//		}
//
//
//	}
//	//7.de-select by index
//	public void deselectOptionByIndex(WebDriver driver, WebElement element, int index) {
//		select = new Select(element);
//		boolean status =select.isMultiple();
//		if(status)
//		{
//			try {
//
//				select.deselectByIndex(index);
//				System.out.println("The required option ia de-select by indext ");
//			} catch (Exception e) {
//				e.printStackTrace();
//			}
//		}else
//		{
//			System.out.println("the select is not multi select");
//		}
//
//
//	}
//
//}
