package com.rh.testCases;

import java.io.IOException;

import org.openqa.selenium.NoSuchElementException;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.rh.pageObjects.LoginPage;
import com.rh.pageObjects.ReportSearch;


public class TC_Type682_011 extends BaseClass {
	
	
	@Test
	public void SearchRep() throws InterruptedException, IOException {
		LoginPage lp = new LoginPage(driver);
		lp.setUserName(username);
		logger.info("Username is provided");
		lp.setPassword(password);
		logger.info("Password is provided");
		lp.clickSubmit();
		Thread.sleep(2000);
		
		ReportSearch rep = new ReportSearch(driver);
		rep.clickTr();
		Thread.sleep(1000);
		
		

		
		
		
		try {
			Boolean err = rep.clicktype();
			if (err == true) {
				
				System.out.println("Element present");
				Thread.sleep(2000);
				logger.info("Element present");
				captureScreen(driver, "Search Present");
				Assert.assertTrue(false);
			}
			
			
			
			
	      }
		catch(NoSuchElementException e)
		{
			System.out.println("Element absent");
			Assert.assertTrue(true);
			logger.info("Test case Passed");
		} 
		
		
		
		
		
	}

}
