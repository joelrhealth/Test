package com.rh.testCases;

import java.io.IOException;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.rh.pageObjects.LoginPage;
import com.rh.utilities.XLUtils;

public class TC_LoginDDT_004 extends BaseClass {

	@Test(dataProvider = "LoginData")
	public void loginDDT(String user, String pwd) throws InterruptedException, IOException {
		LoginPage lp = new LoginPage(driver);
		lp.setUserName(user);
		logger.info("Username is provided");
		lp.setPassword(pwd);
		logger.info("Password is provided");
		lp.clickSubmit();

		Thread.sleep(1000);

		logger.info("Validation started...");

		if (driver.getTitle().contains("Virtual Terminal")) {
			Assert.assertTrue(true);
			logger.info("Login Passed");
			lp.clickLogout();
		} else {
			driver.findElement(By.id("username")).clear();
			Thread.sleep(2000);
			logger.info("Login Failed");
			captureScreen(driver, "loginFailed");
			Assert.assertTrue(false);

		}

	}

	@DataProvider(name = "LoginData")
	String[][] getData() throws IOException {
		String path = System.getProperty("user.dir") + "/src/test/java/com/rh/testData/LoginData.xlsx";
		int rownum = XLUtils.getRowCount(path, "Sheet1");
		int colcount = XLUtils.getCellCount(path, "Sheet1", 1);
		String logindata[][] = new String[rownum][colcount];

		for (int i = 1; i <= rownum; i++) {

			for (int j = 0; j < colcount; j++) {
				logindata[i - 1][j] = XLUtils.getCellData(path, "Sheet1", i, j);
			}
		}
		return logindata;
	}
}
