package com.testcases;

import static org.testng.Assert.assertEquals;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.pageobjects.HomePage;
import com.pageobjects.LoginPage;
import com.pageobjects.MyAccountPage;
import com.testbase.BaseClass;

public class LoginTest extends BaseClass {

	
	@Test(groups={"Sanity","Master"})
	public void verify_login() {
		logger.info("***** starting Login test case*******");
		try {
			HomePage hp=new HomePage(driver);
			hp.clickMyAccount();
			hp.clickLogin();
			
			LoginPage lp=new LoginPage(driver);
			lp.setEmail(p.getProperty("email"));
			lp.setPassword(p.getProperty("password"));
			lp.clickLogin();
			
			MyAccountPage macc=new MyAccountPage(driver);
			boolean targetPage=macc.isMyAccountPageExist();
			//Assert.assertEquals(targetPage, true,"Login failed");
			//Assert.assertTrue(targetPage);
		}
		catch(Exception e) {
			//Assert.fail();

		}
		logger.info("***** finish Login test case*******");

		
	}
	
}
