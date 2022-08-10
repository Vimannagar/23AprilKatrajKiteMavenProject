package testcases;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import listeners.TestNGListeners;
import utility.ReadDataFromPropFile;

public class LoginTest extends TestNGListeners {

	@Test(priority = 1)
	public void validateLogin() throws IOException {

		test.info("Entering credentials");
		lpa.loginToApplication(ReadDataFromPropFile.readConfigData("username"), ReadDataFromPropFile.readConfigData("password"));
		test.info("Entered creds are: "+ReadDataFromPropFile.readConfigData("username")+" "+ReadDataFromPropFile.readConfigData("password"));
		lpa.enterPin();
		test.info("Entered pin");

	}

	@Test(priority = 2)
	public void validateTitle() {
		String actualtitle = lpa.titleOfPage();
		
		String expectedtitle = "Kite - Zerodha's fast and elegant flagship trading platform";
		test.info("Title of the page validated");
		Assert.assertEquals(actualtitle, expectedtitle);
	}

}
