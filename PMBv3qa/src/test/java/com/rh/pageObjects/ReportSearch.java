package com.rh.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class ReportSearch {

	WebDriver ldriver;

	public ReportSearch(WebDriver rdriver) {
		ldriver = rdriver;
		PageFactory.initElements(rdriver, this);
	}

	@FindBy(how = How.XPATH, using = "//a[@href='/reports/']")
	@CacheLookup
	WebElement lnkRep;

	@FindBy(how = How.ID, using = "start_date")
	@CacheLookup
	WebElement txtstrt;

	@FindBy(how = How.ID, using = "end_date")
	@CacheLookup
	WebElement txtend;

	@FindBy(how = How.XPATH, using = "//*[@id=\"find-tran-submit\"]")
	@CacheLookup
	WebElement lnkSub;
	
	@FindBy(how = How.XPATH, using ="//select[@id='transaction_type']")
	@CacheLookup
	WebElement lnktype;
	
	@FindBy(how = How.ID, using = "export-csv-submit")
	@CacheLookup
	WebElement txtcsv;
	
	@FindBy(how = How.ID, using = "export-xlsx-submit")
	@CacheLookup
	WebElement txtxl;
	
	@FindBy(how = How.ID, using = "pocessing")
	@CacheLookup
	WebElement txtgif;
	
	@FindBy(how = How.XPATH, using = "//*[@id=\"report_container\"]/tbody/tr[1]/td[1]/a")
	@CacheLookup
	WebElement txtfirstele;
	
	@FindBy(how = How.ID, using = "button_print_transaction")
	@CacheLookup
	WebElement txtreci;
	
	@FindBy(how = How.ID, using = "button_print")
	@CacheLookup
	WebElement txtpnt;
	
	@FindBy(how = How.ID, using = "button_void")
	@CacheLookup
	WebElement txtvoid;
	
	@FindBy(how = How.ID, using = "(//div[@class='modal-content'])[2]")
	@CacheLookup
	WebElement txtdet;
	

	
	@FindBy(how = How.ID, using = "min_amount")
	@CacheLookup
	WebElement txtminamt;
	
	@FindBy(how = How.ID, using = "max_amount")
	@CacheLookup
	WebElement txtmaxamt;
	
	@FindBy(how = How.ID, using = "account_last_4")
	@CacheLookup
	WebElement txtlastfour;
	
	@FindBy(how = How.ID, using = "first_name")
	@CacheLookup
	WebElement txtfname;
	
	@FindBy(how = How.ID, using = "last_name")
	@CacheLookup
	WebElement txtlname;
	
	@FindBy(how = How.XPATH, using = "//a[text()='266145301']")
	@CacheLookup
	WebElement txttrid;
	
	@FindBy(how = How.XPATH, using = "(//*[@id=\"transaction_id\"])[4]")
	@CacheLookup
	WebElement txtinpid;
	
	@FindBy(how = How.ID, using = "search_result_wrapper")
	@CacheLookup
	WebElement txtlrec;
	
	public boolean clicklrec() {
		return txtlrec.isDisplayed();

	}
	
	public void custtxtinpid(String ctxtinpid) {
		txtinpid.sendKeys(ctxtinpid);
	}
	
	public boolean clicktrid() {
		return txttrid.isDisplayed();

	}
	
	public void custfname(String cfname) {
		txtfname.sendKeys(cfname);
	}
	
	public void custlname(String clname) {
		txtlname.sendKeys(clname);
	}
	
	public void custlastf(String clastf) {
		txtlastfour.sendKeys(clastf);
	}
	
	public void custminamt(String cminamt) {
		txtminamt.sendKeys(cminamt);
	}

	
	public void custmaxamt(String cmaxamt) {
		txtmaxamt.sendKeys(cmaxamt);
	}

	
	public boolean clickdet() {
		return txtdet.isDisplayed();

	}
	
	public void clickpnt() {
		txtpnt.click();

	}
	
	public void clickvoid() {
		txtvoid.click();

	}
	
	public void clickreci() {
		txtreci.click();

	}
	
	public void clickfirele() {
		txtfirstele.click();

	}
	
	public void clickcsv() {
		txtcsv.click();

	}
	
	public boolean clickgif() {
	return txtgif.isDisplayed();

	}
	
	public void clickxl() {
		txtxl.click();

	}

	public void clickTr() {
		lnkRep.click();

	}
	
	public Boolean clicktype() {
		return lnktype.isDisplayed();
	}


	public void custend(String cend) {
		txtend.sendKeys(cend);
	}

	public void custstart(String cstart) {
		txtstrt.sendKeys(cstart);
	}

	public void clickSub() {
		lnkSub.click();

	}
}
