package bookPage;

import org.openqa.selenium.WebElement;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import genericUtilities.BaseClass;
import genericUtilities.ITestListenerUtility;
@Listeners(ITestListenerUtility.class)
public class DWS_Books_04_Test extends BaseClass {
	@Test
	public void Add_a_book_to_the_cart() {
		bookspage.getBookslink().click();
		bookspage.getAddtocartbutton().click();
		bookspage.getShoppingcartlink().click();
	   if( homepage.getCheckoutbutton().isDisplayed()) {
		   System.out.println("the book is added to the cart");
	   }
	}
	

}
