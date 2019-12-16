package com.rh.testCases;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.rh.pageObjects.AddVault;
import com.rh.pageObjects.LoginPage;

public class TC_RunPaymentVault_010 extends BaseClass {
	
	@Test
	public void RunPaymentVault() throws InterruptedException, IOException {
		LoginPage lp = new LoginPage(driver);
		lp.setUserName(username);
		logger.info("Username is provided");
		lp.setPassword(password);
		logger.info("Password is provided");
		lp.clickSubmit();
		Thread.sleep(2000);
		logger.info("Providing Vault Details....");
		AddVault addvault = new AddVault(driver);
		addvault.clickVault();
		Thread.sleep(1000);
		addvault.clickRunPay();
		addvault.custamt("10.95");
		addvault.custsubmit();
		Thread.sleep(5000);
		
		Boolean err = addvault.successs();
		
		if (err == true) {
			Assert.assertTrue(true);
			logger.info("Test case Passed");
		}
		
		else {
			logger.info("Test case Failed");
			Thread.sleep(2000);
			captureScreen(driver, "Run Payment Failed");
			Assert.assertTrue(false);
		}
		
	}

}
