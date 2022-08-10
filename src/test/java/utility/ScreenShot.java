package utility;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class ScreenShot {
	public static String captureScreenShotWithPath(WebDriver driver, String filename) throws IOException
	{
		TakesScreenshot ts = (TakesScreenshot)driver;
		
		 File source = ts.getScreenshotAs(OutputType.FILE);
		 
//		 String path = "F:\\Desktop\\VimanNagar\\May 21\\23AprSeleniumBasics\\screenshots\\"+filename+".png";
		
		String path = System.getProperty("user.dir")+"\\screenshots\\"+filename+".png";		 
		File destination = new File(path);
		
		FileHandler.copy(source, destination);
		
		return path;
		
	}
	
	
	public static void captureScreenShot(WebDriver driver, String filename) throws IOException
	{
		TakesScreenshot ts = (TakesScreenshot)driver;
		
		 File source = ts.getScreenshotAs(OutputType.FILE);
		 
//		 String path = "F:\\Desktop\\VimanNagar\\May 21\\23AprSeleniumBasics\\screenshots\\"+filename+".png";
		
		String path = System.getProperty("user.dir")+"\\screenshots\\"+filename+".png";		 
		File destination = new File(path);
		
		FileHandler.copy(source, destination);
		
	}
	
	
	public static void main(String[] args) throws IOException {
		
System.setProperty("webdriver.chrome.driver", "F:\\Desktop\\Katraj\\23 April\\Selenium downloads\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();// to maximize the browser
		
		
		driver.get("https://opensource-demo.orangehrmlive.com/");
		

		WebElement username = driver.findElement(By.xpath("//input[@id='txtUsername']"));
		
		
		username.sendKeys("Adminn");
		
		
		WebElement pwd = driver.findElement(By.xpath("//input[@name='txtPassword']"));
		
		
		pwd.sendKeys("admin123");
		
		
		WebElement loginbutton = driver.findElement(By.xpath("//input[@type='submit']"));

	
		loginbutton.click();
		
//		capturing the screenshot:
		
		
		TakesScreenshot ts = (TakesScreenshot)driver;
		
		 File source = ts.getScreenshotAs(OutputType.FILE);
		 
		 String path = "F:\\Desktop\\Katraj\\23 April\\Selenium Docs\\captured Screenshot\\orangelogin.png";
		
		File destination = new File(path);
		
		FileHandler.copy(source, destination);

		
		
	}

}
