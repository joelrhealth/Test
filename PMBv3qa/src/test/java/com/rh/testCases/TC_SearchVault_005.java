package com.rh.testCases;

import java.io.IOException;

import org.testng.annotations.Test;

import com.rh.pageObjects.SearchVault;
import com.rh.pageObjects.LoginPage;

public class TC_SearchVault_005 extends BaseClass {

	@Test
	public void SearchVault() throws InterruptedException, IOException {
		LoginPage lp = new LoginPage(driver);
		lp.setUserName(username);
		logger.info("Username is provided");
		lp.setPassword(password);
		logger.info("Password is provided");
		lp.clickSubmit();
		Thread.sleep(2000);
		logger.info("Providing Vault Details....");
		SearchVault srchvault = new SearchVault(driver);
		srchvault.clickVault();
		Thread.sleep(1000);
		
		srchvault.custvltid("Vault_6433");
		srchvault.clickSearch();
		Thread.sleep(2000);

		srchvault.custlastf("1111");
		srchvault.clickSearch();
		Thread.sleep(2000);

		srchvault.custlnam("Doe");
		srchvault.clickSearch();
		Thread.sleep(2000);

		srchvault.custfnam("john");
		srchvault.clickSearch();
		Thread.sleep(2000);

	}
}
