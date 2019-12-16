package com.rh.testCases;

import java.io.IOException;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.rh.pageObjects.TakePayment;
import com.rh.pageObjects.LoginPage;

public class TC_TakePaymentTest_002 extends BaseClass {

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

		logger.info("Providing Customer Details....");

		takepay.custcardNum("4111111111111111");
		Thread.sleep(1000);
		takepay.custcardExpiry("10", "25");
		Thread.sleep(1000);
		takepay.custcardCvv("123");
		Thread.sleep(1000);
		takepay.custlname("Doe");
		Thread.sleep(1000);
		takepay.custfname("John");
		Thread.sleep(1000);
		takepay.custaddress("115 Stevens avenue");
		Thread.sleep(1000);
		takepay.custcity("Valhalla");
		Thread.sleep(1000);
		takepay.custState("NY");
		Thread.sleep(1000);
		takepay.custzipcode("10595");
		Thread.sleep(1000);
		takepay.custamt("25.36");
		Thread.sleep(1000);
		takepay.custsubmit();
		Thread.sleep(3000);

		logger.info("Validation started...");

		boolean paym = driver.getPageSource().contains("Payment Approved");
		if (paym == true) {
			Assert.assertTrue(true);
			logger.info("Test case Passed");
		} else if(driver.findElement(By.xpath("//*[@id=\"payment_error_message\"]")).isDisplayed())
			
				
				{	logger.info("Test case Failed");
			Thread.sleep(2000);
			captureScreen(driver, "addNewCustomer");
			Assert.assertTrue(false);

		}else if(driver.findElement(By.xpath("//div[@class=\"validation-error\"]")).isDisplayed())
			
		{	logger.info("Test case Failed");
		Thread.sleep(2000);
		captureScreen(driver, "addNewCustomer");
		Assert.assertTrue(false);

	}

	}
}