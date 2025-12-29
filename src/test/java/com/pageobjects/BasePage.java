package com.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class BasePage {

	WebDriver driver;

	public BasePage(WebDriver driver) {
          this.driver=driver;
          PageFactory.initElements(driver, this);  //this referes to current class obj
	}

}

//driver ->tells selenium which browser instance to use
//this   ->tells selenium which class's elements to initialize