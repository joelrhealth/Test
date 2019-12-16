package com.rh.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class MerchantSearch {

	WebDriver ldriver;

	public MerchantSearch(WebDriver rdriver) {
		ldriver = rdriver;
		PageFactory.initElements(rdriver, this);
	}

	@FindBy(how = How.XPATH, using = "(//a[@href='/admin/merchants'])[1]")
	@CacheLookup
	WebElement lnkMerchSearch;

	@FindBy(how = How.ID, using = "button_search")
	@CacheLookup
	WebElement lnkSrh;

	@FindBy(how = How.XPATH, using = "//*[@id=\"search_results_container\"]")
	@CacheLookup
	WebElement lnkMerchId;

	@FindBy(how = How.ID, using = "input_merchant_name")
	@CacheLookup
	WebElement lnkMerchname;

	@FindBy(how = How.XPATH, using = "(//a[@class='mx-1'])[3]")
	@CacheLookup
	WebElement lnkTest;

	@FindBy(how = How.ID, using = "visa_default")
	@CacheLookup
	WebElement lnkvisa;

	@FindBy(how = How.ID, using = "amex_default")
	@CacheLookup
	WebElement lnkamexe;

	@FindBy(how = How.ID, using = "03_default")
	@CacheLookup
	WebElement lnkmar;

	@FindBy(how = How.ID, using = "11_default")
	@CacheLookup
	WebElement lnknov;

	@FindBy(how = How.ID, using = "button_save")
	@CacheLookup
	WebElement lnkSave;

	@FindBy(how = How.ID, using = "values-dropdown")
	@CacheLookup
	WebElement lnkval;

	@FindBy(how = How.ID, using = "commands-dropdown")
	@CacheLookup
	WebElement lnkcmd;

	@FindBy(how = How.XPATH, using = "//option[text()=\"{exp_year}\"]")
	@CacheLookup
	WebElement lnkyr;

	@FindBy(how = How.XPATH, using = "//option[text()=\"{APPWIN}\"]")
	@CacheLookup
	WebElement lnkapp;

	@FindBy(how = How.ID, using = "pm_name")
	@CacheLookup
	WebElement lnkpmname;

	@FindBy(how = How.ID, using = "version")
	@CacheLookup
	WebElement lnkversion;

	@FindBy(how = How.ID, using = "form_name")
	@CacheLookup
	WebElement lnkformname;

	@FindBy(how = How.XPATH, using = "(//*[@class='table table-sm']//tr[last()]/td)[6]/a[last()]")
//	@FindBy(how = How.XPATH, using ="(//a[@data-action='delete'])[3]")
	@CacheLookup
	WebElement lnkdelete;

	@FindBy(how = How.XPATH, using = "(//*[@class='table table-sm']//tr[last()]/td)[6]/a[last()-1]")
	@CacheLookup
	WebElement lnkedit;

	@FindBy(how = How.ID, using = "script_text")
	@CacheLookup
	WebElement lnkScript;
	
	@FindBy(how = How.ID, using = "input_search_term")
	@CacheLookup
	WebElement lnknamesrch;
	
	@FindBy(how = How.ID, using = "application_scripts_table")
	@CacheLookup
	WebElement lnkscriptable;
	
	public boolean clickscriptabl() {
		return lnkscriptable.isDisplayed();
	}
	
	public void clicknamesear(String cunamesrch) {
		lnknamesrch.clear();
		lnknamesrch.sendKeys(cunamesrch);

	}

	public void clickscript(String cuscript) {

		lnkScript.sendKeys(cuscript);

	}

	public void clickdelete() {

		lnkdelete.click();

	}

	public void clickedit() {

		lnkedit.click();

	}

	public void clickpmname(String cupmname) {

		lnkpmname.sendKeys(cupmname);

	}

	public void clickversion(String cuversion) {

		lnkversion.sendKeys(cuversion);

	}

	public void clickfrmname(String cuformname) {

		lnkformname.sendKeys(cuformname);

	}

	public void clickapp() {
		Actions action = new Actions(ldriver);
		action.build();
		action.moveToElement(lnkapp).click();
		action.perform();
	}

	public void clickyr() {
		Actions action = new Actions(ldriver);
		action.build();
		action.moveToElement(lnkyr).click();
		action.perform();
	}

	public void clickVal() {
		lnkval.click();
	}

	public void clicCmd() {
		lnkcmd.click();
	}

	public void clickMerch() {
		lnkMerchSearch.click();
	}

	public void clickvisa(String cuvisa) {
		lnkvisa.clear();
		lnkvisa.sendKeys(cuvisa);

	}

	public void clickamex(String cuamex) {
		lnkamexe.clear();
		lnkamexe.sendKeys(cuamex);

	}

	public void clickmar(String cumar) {
		lnkmar.clear();
		lnkmar.sendKeys(cumar);

	}

	public void clicknov(String cunov) {
		lnknov.clear();
		lnknov.sendKeys(cunov);

	}

	public void clickTest() {
		lnkTest.click();
	}

	public void clicksave() {
		lnkSave.click();
	}

	public void clickSearch() {
		
		lnkSrh.click();
	}

	public void clickId() {
		lnkMerchId.click();
	}

	public void clickMerchField(String merfield) {
		lnkMerchname.sendKeys(merfield);
	}

	public boolean clickMerchFie() {
		return lnkMerchname.isDisplayed();
	}
}
