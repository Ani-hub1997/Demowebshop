package computerPage;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import genericUtilities.BaseClass;
import genericUtilities.ITestListenerUtility;
import genericUtilities.WebDriverUtility;
@Listeners(ITestListenerUtility.class)
public class DWS_Desktop_05_Test extends BaseClass {
	@Test
	public void Add_two_products_to_compare_and_check() {
    WebElement computers = computerspage.getComputerlink();
    Actions action =driverUtility.actionReference();
    action.moveToElement(computers).perform();
    computerspage.getDesktoplink().click();
    computerspage.getProduct1().click();
    computerspage.getAddtocomparebutton().click();
    driver.navigate().back();
    driver.navigate().back();
    computerspage.getProduct2().click();
    computerspage.getAddtocomparebutton().click();
      List<WebElement> remove = driver.findElements(By.xpath("//input[@value='Remove']"));
      if(remove.size()==2) {
    	  System.out.println("the products are in compare");
      }
	}

}
