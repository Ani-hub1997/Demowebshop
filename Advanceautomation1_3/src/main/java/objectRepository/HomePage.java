package objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	public HomePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//a[text()='14.1-inch Laptop']/../..//input")
	private WebElement Addtocartbutton;
	
	@FindBy(xpath = "//span[text()='Shopping cart']")
	private WebElement Shoppingcartlink;
	
	@FindBy(id = "checkout")
	private WebElement checkoutbutton;

	public WebElement getAddtocartbutton() {
		return Addtocartbutton;
	}

	public WebElement getShoppingcartlink() {
		return Shoppingcartlink;
	}

	public WebElement getCheckoutbutton() {
		return checkoutbutton;
	}
}
	
	
	


