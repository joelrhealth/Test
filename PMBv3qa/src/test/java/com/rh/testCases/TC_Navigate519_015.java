package com.rh.testCases;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.rh.pageObjects.LoginPage;
import com.rh.pageObjects.MerchantSearch;
import com.rh.pageObjects.ReportSearch;

public class TC_Navigate519_015 extends BaseClass {
	

	@Test
	public void addMerchant() throws InterruptedException, IOException {
		LoginPage lp = new LoginPage(driver);
		lp.setUserName(username);
		logger.info("Username is provided");
		lp.setPassword(password);
		logger.info("Password is provided");
		lp.clickSubmit();
		Thread.sleep(2000);

		MerchantSearch merchsrch = new MerchantSearch(driver);
		ReportSearch rep = new ReportSearch(driver);
		
		
		
		try {
			merchsrch.clickMerch();
			Thread.sleep(1000);
			merchsrch.clickSearch();
			Thread.sleep(1000);
			merchsrch.clickId();
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			rep.clickTr();
			Thread.sleep(1000);
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			Assert.assertTrue(true);
			logger.info("Test case Passed");
		}
		catch(Exception e) {
			System.out.println("Error occured");
			logger.info("Test case Failed");
			captureScreen(driver, "Error");
			Assert.assertTrue(false);
		}
	
	

}
}