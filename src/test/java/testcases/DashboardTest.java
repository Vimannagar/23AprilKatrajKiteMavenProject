package testcases;

import org.testng.annotations.Test;

import listeners.TestNGListeners;

public class DashboardTest extends TestNGListeners{

	@Test(priority = 3)
	public void searchSharesTest()
	{
		test.info("searching the shares");
		dp.searchShares();
		
		
	}
	
	
	@Test(priority = 4, dependsOnMethods = "searchSharesTest")
	public void validateBuyShare()
	{
		test.info("Placing the order");
		dp.buyShare();
	}
	
}
