package genericUtilities;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import com.aventstack.extentreports.ExtentTest;

import io.github.bonigarcia.wdm.WebDriverManager;
import objectRepository.BooksPage;
import objectRepository.ComputersPage;
import objectRepository.ComputersPage;
import objectRepository.HomePage;
import objectRepository.JewelryPage;
import objectRepository.LoginPage;
import objectRepository.RegisterPage;

public class BaseClass implements IAutoConstants {
	public static WebDriver driver;
	PropertyUtility property;
	public static TakesScreenshotUtility ss;
	public static WebDriverUtility driverUtility;
	public static ExtentTest logger;
	public static LoginPage loginpage;
	public static RegisterPage registerpage;
    public static HomePage homepage;
    public static BooksPage bookspage;
    public static ComputersPage computerspage;
    public static JewelryPage jewelrypage;
	DatabaseUtility databaseUtility;
	JavaUtility javaUtility;
	@BeforeClass(alwaysRun = true)
	public void launchingBrowserAndNavigateToApp() {
		property=new PropertyUtility();
		
		if(BROWSER.equalsIgnoreCase("chrome")) {
		WebDriverManager.chromedriver().setup();
		ChromeOptions op=new ChromeOptions();
		op.addArguments("--remote-allow-origins=*");
		driver=new ChromeDriver(op);
		}else if(BROWSER.equalsIgnoreCase("firefox")) {
			WebDriverManager.firefoxdriver().setup();
			driver=new FirefoxDriver();
		}else {
			WebDriverManager.edgedriver().setup();
			driver=new EdgeDriver();
		}
		driver.manage().window().maximize();
		driver.get(property.getDataFromPropertyFile("url"));
		ss=new TakesScreenshotUtility(driver);
		driverUtility=new WebDriverUtility(driver);
		databaseUtility=new DatabaseUtility();
		javaUtility=new JavaUtility(); 
		
		
	}
	@BeforeMethod(alwaysRun = true)
	public void loginToApplication() {
	    loginpage=new LoginPage(driver);
	    registerpage=new RegisterPage(driver);
	    homepage = new HomePage(driver);
	    bookspage = new BooksPage(driver);
	    computerspage=new ComputersPage(driver);
	    jewelrypage=new JewelryPage(driver);
		ss=new TakesScreenshotUtility(driver);
		System.out.println("logged in to the application");
	}
	@AfterMethod(alwaysRun = true)
	public void logoutFromApplication() {
		System.out.println("logged out from the application");
	}
	@AfterClass(alwaysRun = true)
	public void ClosingTheBrowser() {
		driver.quit();
	}
	
}


