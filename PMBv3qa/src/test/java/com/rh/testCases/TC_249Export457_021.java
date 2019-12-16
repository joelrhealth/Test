package com.rh.testCases;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.rh.pageObjects.LoginPage;
import com.rh.pageObjects.ReportSearch;

public class TC_249Export457_021 extends BaseClass {
	
	@Test
	public void SearchRep() throws InterruptedException, IOException {
		LoginPage lp = new LoginPage(driver);
		lp.setUserName(username);
		logger.info("Username is provided");
		lp.setPassword(password);
		logger.info("Password is provided");
		lp.clickSubmit();
		Thread.sleep(2000);
		logger.info("Providing Search Criteria....");
		ReportSearch rep = new ReportSearch(driver);
		rep.clickTr();
		Thread.sleep(1000);
		rep.custstart("10/04/2019 11:45 AM");		
		rep.custend("10/04/2019 11:50 AM");		
		try {
		rep.clickSub();
		Thread.sleep(2000);
	
		rep.clickcsv();
		Thread.sleep(2000);
		rep.clickxl();
		Assert.assertTrue(true);
		logger.info("Test case Passed");
		}
		catch(Exception e)
		{
			logger.info("Test case Failed");
			captureScreen(driver, "Report export");
			Assert.assertTrue(false);
		}

}
}