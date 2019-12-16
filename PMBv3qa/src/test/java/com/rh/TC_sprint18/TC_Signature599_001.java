package com.rh.TC_sprint18;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.rh.pageObjects.AddVault;
import com.rh.pageObjects.LoginPage;
import com.rh.testCases.BaseClass;

public class TC_Signature599_001 extends BaseClass {
	

	@Test
	public void signRequest() throws InterruptedException, IOException {
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
		String email = "Vault" + randomeNum();
		addvault.custvaultid(email);
		


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
		
		try{
			Boolean pr = addvault.sign();
		
		if(pr==true) {
			System.out.println("Sign requested. Clicking 'No Signature'");
			addvault.clicknosign();
			Thread.sleep(2000);
			Assert.assertTrue(true);
			logger.info("Test case Passed");
		}else {
			System.out.println("Some error");
			logger.info("Test case Failed");
			Thread.sleep(2000);
			captureScreen(driver, "Signature not requested");
			Assert.assertTrue(false);
		}}
		catch(Exception e) {
			System.out.println("Element not found");
			logger.info("Test case Failed");
			Thread.sleep(2000);
			captureScreen(driver, "Signature not requested");
			Assert.assertTrue(false);
		}
	}

}
