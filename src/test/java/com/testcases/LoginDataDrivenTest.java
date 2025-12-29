package com.testcases;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.pageobjects.HomePage;
import com.pageobjects.LoginPage;
import com.pageobjects.MyAccountPage;
import com.testbase.BaseClass;
import com.utilities.DataProviders;

public class LoginDataDrivenTest extends BaseClass {

	@Test(dataProvider = "LoginData", dataProviderClass = DataProviders.class,groups="Datadriven")
	public void verify_loginDTD(String email, String pwd, String exp) throws InterruptedException {
		logger.info("***********starting test case login DDT test*********");

		try {
			//homepage
		HomePage hp = new HomePage(driver);
		hp.clickMyAccount();
		hp.clickLogin();

		
		//login
		LoginPage lp = new LoginPage(driver);
		lp.setEmail(email);
		lp.setPassword(pwd);
		lp.clickLogin();

		
		//myaccount
		MyAccountPage macc = new MyAccountPage(driver);
		boolean targetPage = macc.isMyAccountPageExist();

//		data is valid --login success--test pass --logout
//		                login failed--test fail
//		                
//	    data is invalid --login success--test fail --logout
//		                login failed--test pass
//	               

		if (exp.equalsIgnoreCase("valid")) {
			if (targetPage == true) {
				macc.clickLogout();
				Assert.assertTrue(true);
			} else {
				Assert.assertTrue(false);
			}
		}
		if (exp.equalsIgnoreCase("invalid")) {
			if (targetPage == true) {
				macc.clickLogout();
				Assert.assertTrue(false);
			} else {
				Assert.assertTrue(true);
			}
		}
		}catch(Exception e) {
			Assert.fail();
		}
        Thread.sleep(3000);
		logger.info("***********finished test case login DDT test*********");

		// Assert.assertEquals(targetPage, true,"Login failed");
		// Assert.assertTrue(targetPage);
	}

}
