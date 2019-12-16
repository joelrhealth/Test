package com.rh.testCases;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.rh.pageObjects.LoginPage;
import com.rh.pageObjects.MerchantSearch;

public class TC_Merchant493_019 extends BaseClass{
	
	@Test
	public void addMerchant() throws InterruptedException, IOException {
		LoginPage lp = new LoginPage(driver);
		lp.setUserName(username);
		logger.info("Username is provided");
		lp.setPassword(password);
		logger.info("Password is provided");
		lp.clickSubmit();
		Thread.sleep(2000);
	try {	
		MerchantSearch merchsrch = new MerchantSearch(driver);
		merchsrch.clickMerch();
		Thread.sleep(2000);
		merchsrch.clickSearch();
		Thread.sleep(2000);
		merchsrch.clickId();
		Thread.sleep(2000);
		merchsrch.clicknamesear("Retr");
		merchsrch.clickSearch();
		Thread.sleep(2000);
		merchsrch.clickId();
		Thread.sleep(2000);
		merchsrch.clicknamesear("rectangl");
		merchsrch.clickSearch();
		Thread.sleep(2000);
		merchsrch.clickId();
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