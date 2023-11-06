package homepage;

import org.openqa.selenium.WebElement;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;

import genericUtilities.BaseClass;
import genericUtilities.ITestListenerUtility;
import genericUtilities.WebDriverUtility;
@Listeners(ITestListenerUtility.class)
public class DWS_Features_Products_03_Test extends BaseClass {
	@Test
	public void Add_product_to_cart_and_check_in_cart() {
		driverUtility.scrollByAction(0, 150);
		homepage.getAddtocartbutton().click();
		logger.log(Status.INFO,"user add the product to cart");
		driverUtility.scrollIntoViewAction(homepage.getShoppingcartlink(),true);
		homepage.getShoppingcartlink().click();
		WebElement checkbutton = homepage.getCheckoutbutton();
		if(checkbutton.isDisplayed()) {
			System.out.println("the product is added cart");
		}
	}

}
