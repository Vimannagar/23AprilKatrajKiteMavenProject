package testcases;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import utility.ReadDataFromPropFile;

public class LoginTest extends BaseTest {

	@Test(priority = 1)
	public void validateLogin() throws IOException {

		lpa.loginToApplication(ReadDataFromPropFile.readConfigData("username"), ReadDataFromPropFile.readConfigData("password"));
		lpa.enterPin();

	}

	@Test(priority = 2)
	public void validateTitle() {
		String actualtitle = lpa.titleOfPage();
		
		String expectedtitle = "Kite - Zerodha's fast and elegant flagship trading platform";
		
		Assert.assertEquals(actualtitle, expectedtitle);
	}

}
