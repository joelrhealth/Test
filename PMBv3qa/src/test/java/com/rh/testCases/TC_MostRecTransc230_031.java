package com.rh.testCases;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.rh.pageObjects.LoginPage;
import com.rh.pageObjects.ReportSearch;

public class TC_MostRecTransc230_031 extends BaseClass {
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
		Thread.sleep(4000);
		
		try {	Boolean idd=rep.clicklrec();
		if(idd==true) {
			Assert.assertTrue(true);
			logger.info("Last 20 displayed");
		}}
	catch(Exception e) {
		
		Thread.sleep(2000);
		logger.info("Not displayed");
		captureScreen(driver, "Search result");
		Assert.assertTrue(false);
		
	}

}
}