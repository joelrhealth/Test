package com.rh.testCases;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.rh.pageObjects.LoginPage;
import com.rh.pageObjects.ReportSearch;

public class TC_SearchTransId231_030 extends BaseClass {
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
		rep.custtxtinpid("266145301");
		rep.clickSub();
		Thread.sleep(2000);
		
	try {	Boolean idd=rep.clicktrid();
		if(idd==true) {
			Assert.assertTrue(true);
			logger.info("Consistant Search result");
		}}
	catch(Exception e) {
		
		Thread.sleep(2000);
		logger.info("Incorrect Search result");
		captureScreen(driver, "Search result");
		Assert.assertTrue(false);
		
	}
}
}