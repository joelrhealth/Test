package com.rh.testCases;

import java.io.IOException;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.rh.pageObjects.AddVault;
import com.rh.pageObjects.LoginPage;

public class TC_EditVault_008 extends BaseClass {
	
	@Test
	public void editVault() throws InterruptedException, IOException {
		LoginPage lp = new LoginPage(driver);
		lp.setUserName(username);
		logger.info("Username is provided");
		lp.setPassword(password);
		logger.info("Password is provided");
		lp.clickSubmit();
		Thread.sleep(2000);
		logger.info("Providing Vault Details....");
		AddVault editvault = new AddVault(driver);
		editvault.clickVault();
		Thread.sleep(1000);
		editvault.editVault();
		String email = "Vault_" + randomeNum();
		editvault.custvaultid(email);
		


		editvault.custvisits("All visits this year");
		driver.findElement(By.id("ccNumber")).clear();
		editvault.custmxamt("100.95");
		
		editvault.custcardNum("4111111111111111");

		

		editvault.custsubmit();
		Thread.sleep(5000);
		editvault.clicknosign();
		Thread.sleep(2000);

		
		Boolean searreaas = editvault.success();

		if (searreaas == true) {
			
			
			Assert.assertTrue(true);
			logger.info("Successfully edited vault");
			editvault.clickPrnt();
		}else
			
		{
			Thread.sleep(2000);
			logger.info("Edit failed");
			captureScreen(driver, "Edit Vault");
			Assert.assertTrue(false);
	
		}
	}
}
