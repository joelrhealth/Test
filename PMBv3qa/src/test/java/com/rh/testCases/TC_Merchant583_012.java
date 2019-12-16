package com.rh.testCases;

import java.io.IOException;

import org.openqa.selenium.NoSuchElementException;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.rh.pageObjects.MerchantSearch;
import com.rh.pageObjects.LoginPage;

public class TC_Merchant583_012 extends BaseClass {
	
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
		merchsrch.clickMerch();
		Thread.sleep(1000);
		
	
		try {
			merchsrch.clickSearch();
			Thread.sleep(1000);
			merchsrch.clickId();
			Thread.sleep(1000);
		Boolean prepa = merchsrch.clickMerchFie();
		
		if(prepa==true) {
			Assert.assertTrue(true);
			logger.info("Test case Passed");
		}}
		catch(NoSuchElementException e)
		{
			logger.info("Test case Failed");
			captureScreen(driver, "addVault");
			Assert.assertTrue(false);
		}
}
}