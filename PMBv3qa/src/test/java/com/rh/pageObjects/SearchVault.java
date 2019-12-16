package com.rh.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class SearchVault {
	
WebDriver ldriver;
	
	public SearchVault(WebDriver rdriver) {
		ldriver=rdriver;
		PageFactory.initElements(rdriver, this);
	}
	
	@FindBy(how = How.XPATH, using ="//*[@id=\"col-wrapper\"]/div[1]/ul/li[2]")
	@CacheLookup
	WebElement lnkVault;
	
	@CacheLookup
	@FindBy(how = How.ID, using = "vault_id")
	WebElement txtvid;

	@CacheLookup
	@FindBy(how = How.ID, using = "last_4_account_numbers")
	WebElement txtlastf;
	
	@CacheLookup
	@FindBy(how = How.ID, using = "cardholder_last_name")
	WebElement txtclname;
	
	@CacheLookup
	@FindBy(how = How.ID, using = "cardholder_first_name")
	WebElement txtcfname;
	
	@FindBy(how = How.ID, using ="submit_search")
	@CacheLookup
	WebElement lnkSchVault;
	

	
	public void clickVault() {
		lnkVault.click();
	}
	

	public void custvltid(String cvltid) {
	
		txtvid.sendKeys(cvltid);
		
	}
	
	public void custlastf(String clastf) {
		txtvid.clear();
		txtlastf.sendKeys(clastf);
	}
	
	public void custlnam(String clnam) {
		txtlastf.clear();
		txtclname.sendKeys(clnam);
	}
	
	public void custfnam(String cfnam) {
		txtclname.clear();
		txtcfname.sendKeys(cfnam);
	}
	
	public void clickSearch() {
		
		lnkSchVault.click();
	}

}
