package genericUtilities;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WebDriverUtility {

	WebDriver driver;
	JavascriptExecutor js;
	public WebDriverUtility(WebDriver driver) {
		this.driver=driver;
		js=(JavascriptExecutor) driver;
	}

	/**
	 * This method is used to clicking on element using javascript executor
	 * @param element
	 * @param data which has to enter to the element
	 */

	public void clickingTheWebElement(WebElement element) {
		js.executeScript("arguments[0],click();",element);
	}
	/**
	 * This method is used to enter the data using javascript executor
	 * @param element
	 * @param data which has to enter to the element
	 */
	public void enteringTheDataIntoElement(WebElement element,String data) {
		js.executeScript("arguments[0].value='"+data+"'", element);
	}
	/**
	 * this method is used to give explicitwait to the script
	 * it will return Webdriverwait
	 * this method returns the reference for webdriverwait to achieve explicitly wait
	 * @param time to wait
	 * @return
	 */

	public WebDriverWait explicitWaitReference(int time) {
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(time));
		return wait;
	}
	/**
	 * this method is used to action method and it will return action class reference
	 * @return
	 */
	public Actions actionReference() {
		Actions act=new Actions(driver);
		return act;
	}
     /**
      * this method is use to handle the dropdown
      * @param element
      * @param value
      */
	public void dropDownHandling(WebElement element,String value) {
		Select select=new Select(element);
		try {
			select.selectByVisibleText(value);
		}catch(Exception e1) {
			try {
				select.selectByValue(value);

			}catch(Exception e) {
				int val=Integer.parseInt(value);
				select.selectByIndex(val);
			}
		}
	}


	/**
	 * this method is used to perform scrollby action
	 * @param x
	 * @param y
	 */

	public void scrollByAction(int x,int y) {
		js.executeScript("window.scrollBy("+x+","+y+")");
	}
	/**
	 * this method is used to scrollTo perform
	 * @param x
	 * @param y
	 */

	public void scrollToAction(int x,int y) {
		js.executeScript("window.scrollTo("+x+","+y+")");
	}
	/**
	 * this method is used to scroll to the element to increase the element view
	 * if the status is true the window will scroll until the element reached
	 * if the element is false the window will scroll until the element reached bottom 
	 * @param element
	 * @param status
	 */
	public void scrollIntoViewAction(WebElement element,Boolean status) {
		js.executeScript("arguments[0].scrollIntoView("+status+")",element);
	}

/**
 * 
 * @param index
 */

	public void switchingToFrame(int index) {
		driver.switchTo().frame(index);
	}

	public void switchingToFrame(String name) {
		driver.switchTo().frame(name);
	}
	public void switchingToFrame(WebElement element) {
		driver.switchTo().frame(element);

		/**
		 * this method used to switch the driver control from frame to window
		 */
	}
	public void switchingBackToMainWindow() {
		driver.switchTo().defaultContent();
	}
/**
 * this method is returning the alert reference
 * @return
 */


	public Alert returnAlertReference () {
		//driver.switchTo().alert();
		return driver.switchTo().alert();
	}
	
	/**
	 * this method is used to switch the driver control from one window to another window
	 * @param allwindowId
	 * @param expectedTitle
	 * @param parentId
	 */
	public void switchingToWindow(Set<String> allwindowId,String expectedTitle,String parentId) {
		allwindowId.remove(parentId);
		for(String id:allwindowId) {
			driver.switchTo().window(id);
			if(expectedTitle.equalsIgnoreCase(driver.getTitle())) {
				break;
			}
		}
	}
	/**
	 * this method is used to switch the control back to parent window
	 * @param parentId
	 */
	public void switchingBackToWindow(String parentId) {
		driver.switchTo().window(parentId);
		
	}
}
