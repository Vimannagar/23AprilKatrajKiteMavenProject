package pages;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPageAdvance extends BaseClass {

	@FindBy(xpath = "//*[@id='userid']")
	private	WebElement username;

	@FindBy(xpath = "//*[@id='password']")
	private	WebElement password;

	@FindBy(xpath = "//*[@type='submit']")
	private WebElement loginbutton;

	@FindBy(xpath = "//*[@id='pin']")
	private WebElement pin;

	WebDriver driver;

	public LoginPageAdvance(WebDriver driver) throws IOException{
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public void loginToApplication(String uname, String pwd) {
		username.sendKeys(uname);

		password.sendKeys(pwd);

		loginbutton.click();
		
	
	}

	public void enterPin() {
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		pin.sendKeys("866918");
		loginbutton.click();
	}

	public String titleOfPage() {
		String title = driver.getTitle();

		System.out.println(title);
		
		return title;
				
	}

}
