package com.rh.testCases;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.rh.pageObjects.LoginPage;
import com.rh.pageObjects.ReportSearch;


public class TC_SearchReports233_007 extends BaseClass {
	
	
	@Test
	public void SearchRep() throws InterruptedException, IOException {
		LoginPage lp = new LoginPage(driver);
		lp.setUserName(username);
		logger.info("Username is provided");
		lp.setPassword(password);
		logger.info("Password is provided");
		lp.clickSubmit();
		Thread.sleep(2000);
		logger.info("Providing Search Criteria....");
		ReportSearch rep = new ReportSearch(driver);
		rep.clickTr();
		Thread.sleep(1000);
		
		rep.custstart("12/11/2019 10:00 AM");
		
		rep.custend("12/11/2019 10:45 AM");
		
		
		
		
		
		rep.clickSub();
		Thread.sleep(1000);
		
		
		WebElement paym =	driver.findElement(By.xpath("//*[text()='NO TRANSACTIONS FOUND']"));
		
		Boolean searres = paym.isDisplayed();

		if (searres == true) {
			Thread.sleep(2000);
			logger.info("Incorrect Search result");
			captureScreen(driver, "Search result");
			Assert.assertTrue(false);
		}else
			
		
		Assert.assertTrue(true);
		logger.info("Consistant Search result");
		lp.clickLogout();
		{
			
			}


		
		

}
}