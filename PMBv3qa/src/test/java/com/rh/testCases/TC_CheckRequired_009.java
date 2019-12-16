package com.rh.testCases;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.rh.pageObjects.LoginPage;
import com.rh.pageObjects.TakePayment;

public class TC_CheckRequired_009 extends BaseClass {

	
	@Test
	public void addPayment() throws InterruptedException, IOException {
		LoginPage lp = new LoginPage(driver);
		lp.setUserName(username);
		logger.info("Username is provided");
		lp.setPassword(password);
		logger.info("Password is provided");
		lp.clickSubmit();
		Thread.sleep(1000);
		TakePayment takepay = new TakePayment(driver);
		takepay.clickPayment();
//		takepay.custsubmit();
		takepay.custcardNum("4111111111111111");
		Thread.sleep(1000);
		takepay.custcardExpiry("10", "25");
//		Thread.sleep(1000);
//		takepay.custcardCvv("123");
		Thread.sleep(1000);
		takepay.custamt("25.36");
		takepay.custsubmit();
		Thread.sleep(1000);
		
//		Boolean err = takepay.val1();
//		Boolean err1 = takepay.val2();
//		Boolean err2 = takepay.val3();
		Boolean err3 = takepay.val4();
//		if (err == true) {
//			Assert.assertTrue(true);
//			logger.info("Test case Passed");
//		} 
//		else if (err1 == true) {
//			Assert.assertTrue(true);
//			logger.info("Test case Passed");
//		}
		
//		else if (err2 == true) {
//			Assert.assertTrue(true);
//			logger.info("Test case Passed");
//		}
		
		if (err3 == true) {
			Assert.assertTrue(true);
			logger.info("Test case Passed");
		}
		
		else {
			logger.info("Test case Failed");
			Thread.sleep(2000);
			captureScreen(driver, "Required Filed");
			Assert.assertTrue(false);
		}
		
}
}