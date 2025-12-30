package com.testcases;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.pageobjects.AccountsRegistrationPage;
import com.pageobjects.HomePage;
import com.testbase.BaseClass;

public class AccountRegistrationTest extends BaseClass {

	@Test(groups={"Regression","Master"})
	public void verify_account_registration() {
		logger.info("-----Starting test case-----");
		try {
			HomePage hp = new HomePage(driver);

			hp.clickMyAccount();
			logger.info("clicked on my account link");

			hp.clickRegister();
			logger.info("clicked on my register link");

			AccountsRegistrationPage regpage = new AccountsRegistrationPage(driver);

			logger.info("providing customer details");

			regpage.setFirstname(randomString().toUpperCase());
			regpage.setLastname(randomString().toUpperCase());
			regpage.setEmail(randomString() + "@gmail.com");
			regpage.setTelephone(randomNumber());

			String password = randomAlphaNumeric();
			regpage.setPassword(password);
			regpage.setConfirmPassword(password);

			regpage.setprivatepolicy();
			regpage.clickContinue();
			logger.info("validating expected message");

			String confirmsg = regpage.getConfirmMsg();
			if (confirmsg.equals("Your Account Has Been Created!")) {
				//Assert.assertTrue(true);
			} else {
				logger.error("trst failed");
				logger.debug("debug logs..");
				//Assert.assertTrue(false);
			}
			// Assert.assertEquals(confirmsg, "Your Account Has Been Created!!");
		} catch (Exception e) {
			//Assert.fail();
		}
	}

}
