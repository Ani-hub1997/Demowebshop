package login;

import org.testng.ITestListener;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;

import genericUtilities.BaseClass;
import genericUtilities.ExcelUtility;
import genericUtilities.ITestListenerUtility;
@Listeners(ITestListenerUtility.class)
public class DWS_Login_01_Test extends BaseClass {
	@Test(dataProvider = "data", dataProviderClass = ExcelUtility.class)
    public void Login_to_application_with_valid_credentials(String email,String password) {
    	loginpage.getLoginlink().click();
    	logger.log(Status.INFO, "user click on login link");
    	loginpage.getEmailTF().sendKeys(email);
    	logger.log(Status.INFO,"user entered email address");
    	loginpage.getPasswordTF().sendKeys(password);
    	logger.log(Status.INFO, "user entered password");
    	loginpage.getLoginbutton().click();
    }
}
