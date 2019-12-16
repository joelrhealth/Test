package com.rh.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class Support {
	
WebDriver ldriver;
	
	public Support(WebDriver rdriver) {
		ldriver=rdriver;
		PageFactory.initElements(rdriver, this);
	}
	
	@FindBy(how = How.XPATH, using ="//a[@href ='https://support.rectanglehealth.com/remotesupport']")
	@CacheLookup
	WebElement lnkSupport;
	
	public void clickSupport() {
		lnkSupport.click();
		
		
	}
	
	

}
