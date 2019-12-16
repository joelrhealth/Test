package com.rh.testCases;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.NoAlertPresentException;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.rh.pageObjects.LoginPage;
import com.rh.pageObjects.MerchantSearch;

public class TC_Delete520_014 extends BaseClass {

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
		merchsrch.clicknov("Nov");
		merchsrch.clickmar("Mar");
		merchsrch.clickvisa("{DOWN 2}");
		merchsrch.clickamex("{DOWN 4}");
		Thread.sleep(1500);
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
		merchsrch.clickpmname("Test2");
		merchsrch.clickversion("1.11");
		merchsrch.clickfrmname("Notepad");
		merchsrch.clicksave();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		Thread.sleep(1500);
		merchsrch.clickId();
		Thread.sleep(1500);
		merchsrch.clickdelete();
		Thread.sleep(1500);

		if (isAlertPresent() == true) {

			Assert.assertTrue(true);
			logger.info("Deleted");

			Thread.sleep(2000);
			driver.switchTo().alert().accept();
			driver.switchTo().defaultContent();

		} else {

			driver.switchTo().alert().accept();
			driver.switchTo().defaultContent();
			Assert.assertTrue(false);
			logger.warn("Error while deleting");
		}

	}

	public boolean isAlertPresent() {

		try {
			driver.switchTo().alert();
			return true;
		} catch (NoAlertPresentException e) {
			return false;
		}

	}

}