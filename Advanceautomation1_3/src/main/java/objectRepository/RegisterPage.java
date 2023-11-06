package objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RegisterPage {
	
	public RegisterPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(linkText = "Register")
	private WebElement registerlink;
	
	@FindBy(xpath = "//input[@type='radio' and @value='M']")
	private WebElement malebutton;
	
	@FindBy(id = "FirstName")
	private WebElement firstnameTF;
	
	@FindBy(id = "LastName")
	private WebElement lastnameTF;
	
	@FindBy(id = "Email")
	private WebElement emailTF;
	
	@FindBy(id = "Password")
	private WebElement passwordTF;
	
	@FindBy(id = "ConfirmPassword")
	private WebElement confirmpasswordTF;
	
	@FindBy(id = "register-button")
	private WebElement registerbutton;

	public WebElement getRegisterbutton() {
		return registerbutton;
	}

	public WebElement getRegisterlink() {
		return registerlink;
	}

	public void setRegisterlink(WebElement registerlink) {
		this.registerlink = registerlink;
	}

	public WebElement getMalebutton() {
		return malebutton;
	}

	public WebElement getFirstnameTF() {
		return firstnameTF;
	}

	public WebElement getLastnameTF() {
		return lastnameTF;
	}

	public WebElement getEmailTF() {
		return emailTF;
	}

	public WebElement getPasswordTF() {
		return passwordTF;
	}

	public WebElement getConfirmpasswordTF() {
		return confirmpasswordTF;
	}
	
	

}
