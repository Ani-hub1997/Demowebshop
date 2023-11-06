package registerpage;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import org.testng.internal.annotations.ITest;

import com.aventstack.extentreports.Status;

import genericUtilities.BaseClass;
import genericUtilities.ITestListenerUtility;
@Listeners(ITestListenerUtility.class)
public class DWS_Register_02_Test extends BaseClass {
	@Test(groups = "FT")
	public void Register_to_the_application_with_valid_credentials () {
		registerpage.getRegisterlink().click();
		logger.log(Status.INFO,"user click on register link");
		registerpage.getMalebutton().click();
		logger.log(Status.INFO, "user click on gender");
		registerpage.getFirstnameTF().sendKeys("Anisur");
		logger.log(Status.INFO,"user click on firstname");
		registerpage.getFirstnameTF().sendKeys("Rahaman");
		logger.log(Status.INFO,"usser click on lastname");
		registerpage.getEmailTF().sendKeys("ar478840@gmail.com");
		logger.log(Status.INFO,"user entered email address");
		registerpage.getPasswordTF().sendKeys("12345");
		logger.log(Status.INFO,"user entered password");
		registerpage.getConfirmpasswordTF().sendKeys("12345");
		logger.log(Status.INFO, "user entered confirmpassword");
		registerpage.getRegisterbutton().click();
		
		
	}

}
