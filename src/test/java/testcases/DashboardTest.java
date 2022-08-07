package testcases;

import org.testng.annotations.Test;

public class DashboardTest extends BaseTest{

	@Test(priority = 3)
	public void searchSharesTest()
	{
		dp.searchShares();
	}
	
	
	@Test(priority = 4)
	public void validateBuyShare()
	{
		dp.buyShare();
	}
	
}
