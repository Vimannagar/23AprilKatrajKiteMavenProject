package testcases;

import org.testng.annotations.Test;

public class LoginTest extends BaseTest {

	@Test(priority = 1)
	public void validateLogin() {

		lpa.loginToApplication();
		lpa.enterPin();

	}

	@Test(priority = 2)
	public void validateTitle() {
		lpa.titleOfPage();
	}

}
