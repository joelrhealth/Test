package com.rh.testCases;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.rh.pageObjects.LoginPage;
import com.rh.pageObjects.MerchantSearch;

public class TC_ManualScript501_016 extends BaseClass {
	
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
	try {	merchsrch.clickMerch();
		Thread.sleep(1000);
		merchsrch.clickSearch();
		Thread.sleep(1000);
		merchsrch.clickId();
		Thread.sleep(1000);
		merchsrch.clicknov("Nov");
		merchsrch.clickmar("Mar");
		merchsrch.clickvisa("{DOWN 2}");
		merchsrch.clickamex("{DOWN 4}");
		merchsrch.clickscript("{account_lastname}{auth_code}{account_masked}{SPACE}{CLEAR}{BKSP}{txn_date_d}{auth_code}{exp_month}");
		merchsrch.clickpmname("Test2");
		merchsrch.clickversion("1.11");
		merchsrch.clickfrmname("Notepad");
		merchsrch.clicksave();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		Thread.sleep(1500);
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