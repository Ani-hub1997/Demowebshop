package genericUtilities;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class ExtentReport {

	public static void main(String[] args) {
		ExtentSparkReporter reporter= new ExtentSparkReporter("./report/samplereport.html");
		reporter.config().setTheme(Theme.STANDARD);
		reporter.config().setDocumentTitle("this is samplereport");
		reporter.config().setReportName("samplereport");
		ExtentReports report=new ExtentReports();
		report.attachReporter(reporter);
		
	   ExtentTest logger=report.createTest("test1");
	  // ExtentTest logger1=report.createTest("test2");
	   ExtentTest logger11=report.createTest("test3");
	   
	   logger.log(Status.FAIL,"this is failed");
	   logger.log(Status.PASS,"this is passed");
	   logger.log(Status.INFO,"this is information");
	   logger.log(Status.SKIP,"this is skipped");
	   logger.log(Status.WARNING,"this is warning");
	   logger.addScreenCaptureFromPath("E:\\eclipse-workspace\\Advanceautomation1_3./target/errorshots/demo.png");
	   logger.addScreenCaptureFromPath("C:\\Users\\Hp\\Pictures\\Feedback\\{CD69AA9B-BA0E-4E02-8062-F4527BF86A3F}\\Capture001.png");
	 //  logger1.log(Status.FAIL,"this is failed");
	   //logger1.log(Status.PASS,"this is passed");
	  // logger1.log(Status.INFO,"this is information");
	   //logger1.log(Status.SKIP,"this is skipped");
	   //logger1.log(Status.WARNING,"this is warning");
	   
	   logger11.log(Status.FAIL,"this is failed");
	   logger11.log(Status.PASS,"this is passed");
	   logger11.log(Status.INFO,"this is information");
	   logger11.addScreenCaptureFromPath("C:\\Users\\Hp\\Pictures\\Feedback\\{CD69AA9B-BA0E-4E02-8062-F4527BF86A3F}\\Capture001.png");
	   report.flush();
	 System.out.println("run");

	}

}
