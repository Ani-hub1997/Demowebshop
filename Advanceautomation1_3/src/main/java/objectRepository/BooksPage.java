package objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BooksPage {
	public BooksPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//a[@href='/books']")
	private WebElement bookslink;
	
	@FindBy(xpath = "//a[text()='Fiction']/../..//input")
	private WebElement addtocartbutton;
	
	@FindBy(xpath = "//span[text()='Shopping cart']")
	private WebElement Shoppingcartlink;

	public WebElement getBookslink() {
		return bookslink;
	}

	public WebElement getAddtocartbutton() {
		return addtocartbutton;
	}

	public WebElement getShoppingcartlink() {
		return Shoppingcartlink;
	}
	
	
}
