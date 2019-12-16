package com.rh.testCases;

import java.io.IOException;

import org.testng.annotations.Test;

import com.rh.pageObjects.LoginPage;
import com.rh.pageObjects.ReportSearch;

public class TC_AmountSearch234_028 extends BaseClass{
	
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
		rep.custminamt("10");
		rep.custmaxamt("11");
		rep.clickSub();
		Thread.sleep(1000);

}
}