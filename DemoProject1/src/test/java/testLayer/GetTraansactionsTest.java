package testLayer;

import org.testng.annotations.Test;

import testBase.TestBase;
import utility.UtilityClass;

public class GetTraansactionsTest extends TestBase{
	
	@Test
	public void verifyTransactions() throws InterruptedException
	{
		login.enterEmailAdrees();
		login.enterPassword();
		login.clickOnLogin();
		Thread.sleep(2000);
		UtilityClass.scrollingMethod("window.scrollBy(0,300)");
		Thread.sleep(2000);
		db.clickOnTransaction();
		tp.abc();
		Thread.sleep(4000);
	}

}
