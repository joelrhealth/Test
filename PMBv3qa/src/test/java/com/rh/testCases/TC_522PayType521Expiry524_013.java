package com.rh.testCases;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.rh.pageObjects.LoginPage;
import com.rh.pageObjects.MerchantSearch;

public class TC_522PayType521Expiry524_013 extends BaseClass {
	
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
		merchsrch.clickSearch();
		Thread.sleep(1000);
		merchsrch.clickId();
		Thread.sleep(1000);
		merchsrch.clickTest();		
		Thread.sleep(1000);
		merchsrch.clicknov("Nov");
		merchsrch.clickmar("Mar");
		merchsrch.clickvisa("{DOWN 2}");
		merchsrch.clickamex("{DOWN 4}");
		Thread.sleep(3000);
		merchsrch.clicCmd();
		Thread.sleep(1000);
		merchsrch.clickapp();
		merchsrch.clickapp();
		merchsrch.clickapp();
		merchsrch.clickVal();
		Thread.sleep(1000);
		merchsrch.clickyr();
		merchsrch.clickyr();
		merchsrch.clickyr();
		

		

		
		
		
		try {
			merchsrch.clicksave();
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