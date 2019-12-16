


package com.rh.testCases;


import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.rh.pageObjects.LoginPage;

public class TC_LoginTest_001 extends BaseClass

{
	@Test
	public void loginTest() throws IOException, InterruptedException {
		

		
		
		
		logger.info("URL is open");
		
		LoginPage lp  = new LoginPage(driver);
		lp.setUserName(username);
		logger.info("Username entered");
		
		lp.setPassword(password);
		
		logger.info("Password entered");
		
		lp.clickSubmit();
		Thread.sleep(2000);
		
		if(driver.getTitle().equals("Virtual Terminal - Practice Management Bridge"))
		{
			Assert.assertTrue(true);
			logger.info("Login Test passed");
		}else
		{
			captureScreen(driver,"loginTest");
			Assert.assertTrue(false);
			logger.info("Login Test failed");
			
		}
		

	}



}
