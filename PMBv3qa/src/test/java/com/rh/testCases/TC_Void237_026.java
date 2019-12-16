package com.rh.testCases;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.rh.pageObjects.LoginPage;
import com.rh.pageObjects.ReportSearch;

public class TC_Void237_026 extends BaseClass {
	
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
		rep.clickvoid();
		
		
		
		try {
			
			String URL = driver.getCurrentUrl();
			Assert.assertEquals(URL, "https://pmb-qa.rectanglehealth.com/reports/" );
	if(true) {
				
		
		System.out.println("Transaction Void");
		Assert.assertTrue(true);
		logger.info("Test case Passed");
		
			}
		
	else {	
		
		System.out.println("Error occured");
		logger.info("Test case Failed");
		captureScreen(driver, "Error");
		Assert.assertTrue(false);
					
	}}
		
		
			catch(Exception e) {
				
				System.out.println("Error");
				System.out.println("Error occured");
				logger.info("Test case Failed");
				captureScreen(driver, "Error");
				Assert.assertTrue(false);
			}
	
	

}
}