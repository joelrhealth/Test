package com.rh.testCases;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.rh.pageObjects.LoginPage;
import com.rh.pageObjects.ReportSearch;

public class TC_Gif349_023 extends BaseClass {
	
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
		rep.clickSub();
		WebDriverWait wait = new WebDriverWait(driver, 10);
		WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("pocessing")));
		
		Boolean status = element.isDisplayed();
	try {	if(status==true) {
			
			Assert.assertTrue(true);
			logger.info("GIF is displayed");
			
			
		}
		else {
			
			System.out.println("Element not present");
			logger.info("Test case Failed");
			captureScreen(driver, "Error");
			Assert.assertTrue(false);
			
		}
	}
	catch(Exception e) {
		System.out.println("Some other error");
	}

}
}