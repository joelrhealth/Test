package com.rh.testCases;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.rh.pageObjects.LoginPage;
import com.rh.pageObjects.Support;

public class TC_Support378_022 extends BaseClass {
	
	@Test
	public void Support() throws InterruptedException, IOException {
		LoginPage lp = new LoginPage(driver);
		lp.setUserName(username);
		logger.info("Username is provided");
		lp.setPassword(password);
		logger.info("Password is provided");
		lp.clickSubmit();
		Thread.sleep(2000);
		
		Support sprt = new Support(driver);
		sprt.clickSupport();
		Thread.sleep(2000);
		
		
	try {
		
		String URL = driver.getCurrentUrl();
		Assert.assertEquals(URL, "https://support.rectanglehealth.com/remotesupport" );
if(true) {
			
	System.out.println("Error occured");
	logger.info("Test case Failed");
	captureScreen(driver, "Error");
	Assert.assertTrue(false);
			
		}
	
else {	
	System.out.println("Opened in a new tab or window");
	Assert.assertTrue(true);
	logger.info("Test case Passed");
			
}
	}
	
		catch(Exception e) {
			
			System.out.println("Error");
		}


}
}