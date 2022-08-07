package pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPageAdvance {

	@FindBy(xpath = "//*[@id='userid']")
	WebElement username;

	@FindBy(xpath = "//*[@id='password']")
	WebElement password;

	@FindBy(xpath = "//*[@type='submit']")
	WebElement loginbutton;

	@FindBy(xpath = "//*[@id='pin']")
	WebElement pin;

	WebDriver driver;

	public LoginPageAdvance(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public void loginToApplication() {
		username.sendKeys("DAA677");

		password.sendKeys("Velocity@123");

		loginbutton.click();
	}

	public void enterPin() {
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		pin.sendKeys("866918");
		loginbutton.click();
	}

	public void titleOfPage() {
		String title = driver.getTitle();

		System.out.println(title);
	}

}
