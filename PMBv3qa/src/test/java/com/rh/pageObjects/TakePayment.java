package com.rh.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class TakePayment {
	
WebDriver ldriver;
	
	public TakePayment(WebDriver rdriver) {
		ldriver=rdriver;
		PageFactory.initElements(rdriver, this);
	}
	
	@FindBy(how = How.XPATH, using ="//a[@href='/virtualTerminal/']")
	@CacheLookup
	WebElement lnkPayments;
	
	 @FindBy(how = How.XPATH, using ="//*[@id=\"ccNumber\"]")
	@CacheLookup
	public
	WebElement txtcardNumber;
	
	@CacheLookup
	@FindBy(how = How.ID_OR_NAME, using = "expiration")
	WebElement txtexpiry;
	
	@FindBy(how = How.ID, using = "cvv")
	@CacheLookup
	WebElement txtcvv;
	
	@CacheLookup
	@FindBy(how = How.NAME, using = "last_name")
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
	@FindBy(how = How.NAME, using = "amount")
	WebElement txtamount;
	
	@CacheLookup
	@FindBy(how = How.ID, using = "process-vt")
	WebElement lnksub;
	
	@CacheLookup
	@FindBy(how = How.XPATH, using = "(//div[@class='validation-error'])[1]")
	WebElement txtval1;
	
	@CacheLookup
	@FindBy(how = How.XPATH, using = "(//div[@class='validation-error'])[2]")
	WebElement txtval2;
	
	@CacheLookup
	@FindBy(how = How.XPATH, using = "(//div[@class='validation-error'])[3]")
	WebElement txtval3;
	
	@CacheLookup
	@FindBy(how = How.XPATH, using = "//div[@class='validation-error']")
	WebElement txtval4;
	
	@CacheLookup
	@FindBy(how = How.XPATH, using = "//div[text()=\"Payment Declined\"]")
	WebElement txtdec;
	
	@CacheLookup
	@FindBy(how = How.XPATH, using = "//div[text()=\"Payment Approved\"]")
	WebElement txtapprove;
	
	@CacheLookup
	@FindBy(how = How.XPATH, using = "//div[text()=\"Email Sent\"]")
	WebElement txtsent;
	
	@CacheLookup
	@FindBy(how = How.ID, using = "recipient")
	WebElement lnkemail;
	
	@CacheLookup
	@FindBy(how = How.ID, using = "button_email")
	WebElement lnkemailbtn;
	
	@CacheLookup
	@FindBy(how = How.XPATH, using = "//*[@id=\"button_print\"]")
	WebElement lnkprint;
	
	public void custprint() {
		lnkprint.click();
		
	}
	
	
	public void custemail(String cemail) {
		lnkemail.sendKeys(cemail);
		
	}
	
	public void custemailbtn() {
		lnkemailbtn.click();
		
	}
	
	public void clickPayment() {
		lnkPayments.click();
			
	}
	
	public boolean clickapprv() {
		return txtapprove.isDisplayed();
			
	}
	
	public boolean clickdec() {
		return txtdec.isDisplayed();
			
	}
	
	public boolean clicksent() {
		return txtsent.isDisplayed();
			
	}
	
	public boolean val1() {
		return txtval1.isDisplayed();
		
	}
	
	public boolean val2() {
		return txtval2.isDisplayed();
		
	}
	
	public boolean val3() {
		return txtval3.isDisplayed();
		
	}
	
	public boolean val4() {
		return txtval4.isDisplayed();
		
	}
	
	

	public void custcardNum(String cnumber) {
		txtcardNumber.sendKeys(cnumber);
		
	}
	
	public void custcardExpiry(String mm,String yy) {
		txtexpiry.sendKeys(mm);
		txtexpiry.sendKeys(yy);
		
	}
	
	public void custcardCvv(String cv) {
		txtcvv.sendKeys(cv);
		
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
	
	public void custamt(String camt) {
		txtamount.sendKeys(camt);
	}
	
	public void custsubmit() {
		lnksub.click();
	}
	
	
	
	

}