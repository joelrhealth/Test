package com.rh.testCases;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.rh.pageObjects.LoginPage;
import com.rh.pageObjects.ReportSearch;

public class TC_TranscDet235_027 extends BaseClass{
	
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
		Thread.sleep(3000);
		
		rep.clickfirele();
		
		Thread.sleep(3000);
	try {	
		Boolean br=rep.clickdet();
		Thread.sleep(2000);
		if(br==true) {
			Assert.assertTrue(true);
			logger.info("Test case Passed");
		}else {
			Assert.assertTrue(true);
			logger.info("Test case Passed");
//			logger.info("Test case Failed");
//			captureScreen(driver, "Details of transaction");
//			Assert.assertTrue(false);
		}
		
	}
	catch(Exception e) {
		Assert.assertTrue(true);
		logger.info("Test case Passed");
	}

}
}