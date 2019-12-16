package com.rh.testCases;

import java.io.IOException;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import com.rh.pageObjects.LoginPage;
import com.rh.pageObjects.ReportSearch;

public class TC_PrintReciept238_025 extends BaseClass {
	
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
		Thread.sleep(3000);
		
		rep.clickfirele();
		
		Thread.sleep(3000);
		
		rep.clickreci();
		Thread.sleep(2000);

		

Set<String> pops=driver.getWindowHandles();
 Iterator<String> it =pops.iterator();
  while (it.hasNext()) {
    String popupHandle=it.next().toString();
   System.out.println("Driver Now switched to Pop Up with Title- "+ driver.switchTo().window(popupHandle).getTitle());
  
   }

		
	
//	rep.clickpnt();
//	Thread.sleep(2000);	
		
		
		
		

}
}