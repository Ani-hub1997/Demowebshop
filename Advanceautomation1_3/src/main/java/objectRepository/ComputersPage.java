package objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ComputersPage {
	public ComputersPage(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
	
	@FindBy(xpath = "//a[@href='/computers']")
	private WebElement computerlink;
	
	@FindBy(xpath = "//a[@href='/desktops']")
	private WebElement desktoplink;
	
	@FindBy(xpath = "//a[contains(text(),'Build your own cheap computer')]")
	private WebElement product1;
	
	@FindBy(xpath = "//input[@value='Add to compare list']")
	private WebElement addtocomparebutton;
	
	@FindBy(xpath = "//a[text()='Desktop PC with CDRW']")
	private WebElement product2;
	
	@FindBy(xpath = "//input[@value='Remove']")
	private WebElement removebutton;

	public WebElement getComputerlink() {
		return computerlink;
	}

	public WebElement getDesktoplink() {
		return desktoplink;
	}

	public WebElement getProduct1() {
		return product1;
	}

	public WebElement getAddtocomparebutton() {
		return addtocomparebutton;
	}

	public WebElement getProduct2() {
		return product2;
	}

	public WebElement getRemovebutton() {
		return removebutton;
	}
	

}
