package com.rh.testCases;

import static org.testng.Assert.assertTrue;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.rh.pageObjects.LoginPage;
import com.rh.pageObjects.TakePayment;

public class TC_ValuesRetained201_033 extends BaseClass {

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
//		takepay.custamt("0.1");
//		Thread.sleep(1000);

		takepay.custsubmit();
		Thread.sleep(1000);

		logger.info("Validation started...");

//		WebElement newa = takepay.txtcardNumber;
//		String actualString = newa.getAttribute("value");
//		System.out.println(actualString);
//		
//		
//		assertTrue(actualString.contains("4111111111111111"));
		try {
			WebElement newa = takepay.txtcardNumber;
			String actualString = newa.getAttribute("value");
			System.out.println(actualString);

			assertTrue(actualString.contains("4111111111111111"));

			if (true) {

				System.out.println("It is there");
			}
		} catch (Exception e) {
			System.out.println("Nope");
		}

	}
}