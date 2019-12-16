package com.rh.testCases;

import java.io.IOException;

import org.openqa.selenium.NoSuchElementException;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.rh.pageObjects.LoginPage;

public class TC_VirTerm211_032 extends BaseClass {

	@Test
	public void SearchRep() throws InterruptedException, IOException {
		LoginPage lp = new LoginPage(driver);
		lp.setUserName(username);
		logger.info("Username is provided");
		lp.setPassword(password);
		logger.info("Password is provided");
		lp.clickSubmit();
		Thread.sleep(2000);

		try {
			Boolean pr = lp.lUser();
			Boolean prr = lp.lout();
			if (pr == true && prr == true) {
				Assert.assertTrue(true);
				logger.info("Username andn logoff button displayed");
			} else {
				Thread.sleep(2000);
				logger.info("Not displayed");
				captureScreen(driver, "Login Info");
				Assert.assertTrue(false);
			}
		} catch (NoSuchElementException e) {
			Thread.sleep(2000);
			logger.info("Not displayed");
			captureScreen(driver, "Login Info");
			Assert.assertTrue(false);
		}

	}
}