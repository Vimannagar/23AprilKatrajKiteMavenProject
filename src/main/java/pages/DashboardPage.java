package pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DashboardPage {
	
	@FindBy(xpath = "//*[@type='button']")
	private WebElement getstartedbutton;

	@FindBy(xpath = "(//*[@type='text'])[2]")
	private WebElement searchbox;

	@FindBy(xpath = "//*[@class='eight columns text-right']//*[@class='button-outline button-blue']")
	private WebElement buybutton;

	@FindBy(xpath = "//*[@type='submit']")
	private WebElement finalbuybutton;

	WebDriver driver;

	public DashboardPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	public void searchShares()
	{
		getstartedbutton.click();
		
		searchbox.sendKeys("SBIN");
		
		Actions act = new Actions(driver);
		
		act.sendKeys(Keys.ENTER).perform();
	}
	
	
	public void buyShare()
	{
		buybutton.click();
		
		finalbuybutton.click();
	}
	
	
	
	

}
