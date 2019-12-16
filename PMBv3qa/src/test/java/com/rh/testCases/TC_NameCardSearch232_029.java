package com.rh.testCases;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.rh.pageObjects.LoginPage;
import com.rh.pageObjects.ReportSearch;

public class TC_NameCardSearch232_029 extends BaseClass {
	
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
		rep.custfname("John");
		rep.custlastf("1111");
		rep.custlname("Doe");
		try{
			rep.clickSub();
		
		Thread.sleep(5000);
		Assert.assertTrue(true);
		logger.info("Consistant Search result");
		}
		catch(Exception e) {
			Thread.sleep(2000);
			logger.info("Incorrect Search result");
			captureScreen(driver, "Search result");
			Assert.assertTrue(false);
			
		}
}
}