package com.rh.pageObjects;



import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
	
	WebDriver ldriver;
	
	public LoginPage(WebDriver rdriver)
	{
		ldriver=rdriver;
		PageFactory.initElements(rdriver, this);
	}
	
	@FindBy(name="username")
	@CacheLookup
	public
	WebElement txtUserName;
	
	@FindBy(name="password")
	@CacheLookup
	WebElement txtPassword;
	
	@FindBy(xpath="//*[@id=\"login-form\"]/form/button")
	@CacheLookup
	WebElement btnLogin;
	
	@FindBy(xpath="//a[@class='logout']")
	@CacheLookup
	WebElement lnkLogout;
	
	@FindBy(xpath="//span[text()='Test_admin']")
	@CacheLookup
	WebElement lnkUser;

	
	public void setUserName(String uname)
	{
		txtUserName.sendKeys(uname);
	}
	
	public void clearuser()
	{
		txtUserName.clear();
	}
	
	public Boolean lout() {
		return lnkLogout.isDisplayed();
	}
	
	public Boolean lUser() {
		return lnkUser.isDisplayed();
	}
	
	
	public void setPassword(String pwd)
	{
		txtPassword.sendKeys(pwd);
	}
	
	public void clickSubmit()
	{
		btnLogin.click();
	}
	
	public void clickLogout()
	{
		lnkLogout.click();
	}
	
	

}





