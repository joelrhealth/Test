package com.rh.testCases;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import com.rh.pageObjects.LoginPage;
import com.rh.pageObjects.TakePayment;

public class TestReciept extends BaseClass {

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
		takepay.custamt("12.35");
		Thread.sleep(1000);
		takepay.custsubmit();
		Thread.sleep(3000);
		takepay.custprint();
		Thread.sleep(4000);

//		driver.switchTo().window(driver.getWindowHandles().toArray()[1].toString());
//		WebElement webElement = driver.findElement(By.tagName("body"));
//		webElement.sendKeys(Keys.TAB);
//		Thread.sleep(3000);
//		webElement.sendKeys(Keys.ENTER);
//		Thread.sleep(3000);
//		driver.switchTo().window(driver.getWindowHandles().toArray()[0].toString());

	

	}
}