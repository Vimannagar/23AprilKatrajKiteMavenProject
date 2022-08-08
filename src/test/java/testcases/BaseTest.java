package testcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;

import io.github.bonigarcia.wdm.WebDriverManager;
import pages.DashboardPage;
import pages.LoginPage;
import pages.LoginPageAdvance;

public class BaseTest {
	
	public static WebDriver driver;
	
	LoginPage lp;
	LoginPageAdvance lpa;
	
	DashboardPage dp;
	@BeforeSuite
	public void initBrowser()
	{
//		System.setProperty("webdriver.chrome.driver", "F:\\Desktop\\Katraj\\23 April\\Selenium downloads\\chromedriver_win32\\chromedriver.exe");
	
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://kite.zerodha.com/");
		}
	
	
	@BeforeClass
	public void createObject()
	{
		 lp = new LoginPage(driver);
		 
		 lpa = new LoginPageAdvance(driver);
	
		 dp = new DashboardPage(driver);
	}
	
	
//	@AfterSuite
//	public void tearDown()
//	{
//		driver.quit();
//	}
//	
	
	

}
