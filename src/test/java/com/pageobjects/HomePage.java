package com.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage {

	public HomePage(WebDriver driver) {     //without invoke this Home constructor we can not invoke parent class constructor
		super(driver);
		
	}
	
    @FindBy(xpath="//span[text()='My Account']") WebElement lnkMyaccount;

    @FindBy(xpath="//a[text()='Register']") WebElement lnkRegister;
    
    @FindBy(xpath="//ul[@class='dropdown-menu dropdown-menu-right']//li//a[text()='Login']") WebElement lnklogin;
   
    public void clickMyAccount() {
    	lnkMyaccount.click();

	}
    
    public void clickRegister() {
    	lnkRegister.click();
	}
    
    public void clickLogin() {
    	lnklogin.click();
    }
}
