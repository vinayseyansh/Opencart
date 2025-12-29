package com.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AccountsRegistrationPage extends BasePage {
	
	public AccountsRegistrationPage(WebDriver driver) {
		super(driver);
	}
	
	@FindBy(xpath="//input[@name='firstname']") 
	WebElement txtFirstname;
	
	@FindBy(xpath="//input[@name='lastname']") 
	WebElement txtLasttname;
    
	@FindBy(xpath="//input[@name='email']") 
	WebElement txtEmail;
	
	@FindBy(xpath="//input[@name='telephone']") 
	WebElement txtTelephone;
	
	@FindBy(xpath="//input[@name='password']") 
	WebElement txtPassword;
	
	@FindBy(xpath="//input[@name='confirm']") 
	WebElement txtConfirmPassword;
	
	@FindBy(xpath="//input[@name='agree']") 
	WebElement chkPolicy;
	
	@FindBy(xpath="//input[@value='Continue']") 
	WebElement btnContine;
	
	@FindBy(xpath="//h1[normalize-space()='Your Account Has Been Created!']") 
	WebElement msgConfirmation;
	
	public void setFirstname(String fname) {
		txtFirstname.sendKeys(fname);

	}
	public void setLastname(String lname) {
		txtLasttname.sendKeys(lname);

	}
	public void setEmail(String mailid) {
		txtEmail.sendKeys(mailid);

	}
	public void setTelephone(String tel) {
		txtTelephone.sendKeys(tel);

	}
	public void setPassword(String pwd) {
		txtPassword.sendKeys(pwd);

	}
	public void setConfirmPassword(String pwd) {
		txtConfirmPassword.sendKeys(pwd);

	}
	public void setprivatepolicy() {
		chkPolicy.click();

	}
	public void clickContinue() {
		btnContine.click();

	}
	
	public String getConfirmMsg() {
		try {
			return (msgConfirmation.getText());
		} catch (Exception e) {
			return (e.getMessage());
		}

	}
	
	
	
	
	
}
