package pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
	WebDriver driver;

	public LoginPage(WebDriver driver) {
		this.driver = driver;
	}

	public void loginToApplication() {
		
		driver.findElement(By.xpath("//*[@id='userid']")).sendKeys("DAA677");

		driver.findElement(By.xpath("//*[@id='password']")).sendKeys("Velocity@123");

		driver.findElement(By.xpath("//*[@type='submit']")).click();
	}

	public void enterPin() {
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//*[@id='pin']")).sendKeys("866918");
		driver.findElement(By.xpath("//*[@type='submit']")).click();
	}

	public void titleOfPage() {
		String title = driver.getTitle();

		System.out.println(title);
	
	}

}
