package com.rh.testCases;

import java.io.IOException;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.rh.pageObjects.AddVault;
import com.rh.pageObjects.LoginPage;

public class TC_AddVault_003 extends BaseClass {

	@Test
	public void addNewVault() throws InterruptedException, IOException {
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
		addvault.clickAddv();
		String email = "Vault_" + randomeNum();
		addvault.custvaultid(email);
		
//		addvault.custvaultid("001");

		addvault.custvisits("All visits this year");

		addvault.custmxamt("10.95");

		addvault.custcardNum("4111111111111111");

		addvault.custcardExpiry("10", "25");

		addvault.custlname("Doe");

		addvault.custfname("John");

		addvault.custaddress("115 Stevens avenue");

		addvault.custcity("Valhalla");

		addvault.custState("NY");

		addvault.custzipcode("10595");

		addvault.custsubmit();
		Thread.sleep(5000);

		logger.info("Validation started...");

		Boolean err = addvault.elemerror();
		if (err == true) {
			logger.info("Test case Failed");
			captureScreen(driver, "addVault");
			Assert.assertTrue(false);
		} else {
			Assert.assertTrue(true);
			logger.info("Test case Passed");
		}

	}
}