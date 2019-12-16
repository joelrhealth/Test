package com.rh.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class AddVault {
	
WebDriver ldriver;
	
	public AddVault(WebDriver rdriver) {
		ldriver=rdriver;
		PageFactory.initElements(rdriver, this);
	}
	
	@FindBy(how = How.XPATH, using ="//a[@href='/vault/']")
	@CacheLookup
	WebElement lnkVault;
	
	@FindBy(how = How.XPATH, using ="//a[@href='/vault/create']")
	@CacheLookup
	WebElement lnkAddVaul;
	
	@FindBy(how = How.ID, using ="vault_id")
	@CacheLookup
	WebElement txtvaultid;
	
	@FindBy(how = How.XPATH, using ="(//i[@class='fas fa-pencil-alt'])[3]")
	@CacheLookup
	WebElement lnkEditVaul;
	
	@CacheLookup
	@FindBy(how = How.ID, using = "max_amount")
	WebElement txtmxamount;
	
	@FindBy(how = How.NAME, using = "visits")
	@CacheLookup
	WebElement rdVisits;
	
	@FindBy(how = How.ID, using ="ccNumber")
	@CacheLookup
	WebElement txtcardNumber;
	
	@CacheLookup
	@FindBy(how = How.ID_OR_NAME, using = "expiration")
	WebElement txtexpiry;
	

	
	@CacheLookup
	@FindBy(how = How.ID, using = "last_name")
	WebElement txtlastname;
	
	@CacheLookup
	@FindBy(how = How.NAME, using = "first_name")
	WebElement txtfirstname;
	
	@CacheLookup
	@FindBy(how = How.NAME, using = "address_line_1")
	WebElement txtaddress;
	
	@CacheLookup
	@FindBy(how = How.NAME, using = "city")
	WebElement txtcity;
	
	@FindBy(how = How.NAME, using = "state")
	@CacheLookup
	WebElement seState;
	
	@CacheLookup
	@FindBy(how = How.NAME, using = "zipcode")
	WebElement txtzipcode;
	
	
	
	@CacheLookup
	@FindBy(how = How.ID, using = "process-vt")
	WebElement lnksub;
	
	@CacheLookup
	@FindBy(how = How.ID, using = "server_error_message")
	WebElement elerror;
	
	@FindBy(how = How.XPATH, using ="(//*[@id=\"button_print\"])[2]")
	@CacheLookup
	WebElement lnkPrnt;
	
	@FindBy(how = How.XPATH, using ="//div[@id='pahcf_header']")
	@CacheLookup
	WebElement lnksucc;
	
	@FindBy(how = How.XPATH, using ="(//i[@class='fas fa-university'])[2]")
	@CacheLookup
	WebElement lnkRun;
	
	@FindBy(how = How.XPATH, using ="//*[@id=\"success_message\"]")
	@CacheLookup
	WebElement lnksuccc;
	
	@CacheLookup
	@FindBy(how = How.ID, using = "amount")
	WebElement txtamont;
	
	@CacheLookup
	@FindBy(how = How.XPATH, using = "//p[text()='Signature requested.']")
	WebElement txtsign;
	
	@CacheLookup
	@FindBy(how = How.XPATH, using = "//span[text()='No Signature']")
	WebElement txtnosign;
	
	public void clicknosign() {
		txtnosign.click();
	}
	
	public boolean sign() {
		return txtsign.isDisplayed();
		
	}
	
	public void clickVault() {
		lnkVault.click();
	}
	
	public void clickRunPay() {
		lnkRun.click();
	}
	public boolean success() {
		return lnksucc.isDisplayed();
		
	}
	public boolean successs() {
		return lnksuccc.isDisplayed();
		
	}
	
	public void editVault() {
		lnkEditVaul.click();
	}
	
	public void clickPrnt() {
		lnkPrnt.click();
	}
		
		public void clickAddv() {
			lnkAddVaul.click();
			
	}
	
	public void custvaultid(String cvaultid) {
		txtvaultid.sendKeys(cvaultid);
	}
	
	public void custamt(String camtt) {
		txtamont.sendKeys(camtt);
	}
	
	public void custvisits(String cvisists) {
		rdVisits.click();
	}
	
	public Boolean elemerror() {
		return elerror.isDisplayed();
	}
	
	
	public void custmxamt(String cmxamt) {
		txtmxamount.sendKeys(cmxamt);
	}
	
	public void custcardNum(String cnumber) {
		txtcardNumber.sendKeys(cnumber);
		
	}
	
	public void custcardExpiry(String mm,String yy) {
		txtexpiry.sendKeys(mm);
		txtexpiry.sendKeys(yy);
		
	}

	
	public void custState(String cstate) {
		seState.sendKeys(cstate);
	}

	
	public void custlname(String clname) {
		txtlastname.sendKeys(clname);
	}
	
	public void custfname(String cfname) {
		txtfirstname.sendKeys(cfname);
	}
	
	public void custaddress(String caddress) {
		txtaddress.sendKeys(caddress);
	}
	
	public void custcity(String ccity) {
		txtcity.sendKeys(ccity);
	}
	
	public void custzipcode(String czipcode) {
		txtzipcode.sendKeys(czipcode);
	}
	

	
	
	public void custsubmit() {
		lnksub.click();
	}
	
	
	
	

}
