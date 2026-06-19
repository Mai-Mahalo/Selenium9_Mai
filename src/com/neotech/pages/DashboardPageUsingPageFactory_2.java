package com.neotech.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.neotech.utils.BaseClass;

// Lesson 14, Part-3, 35:00

public class DashboardPageUsingPageFactory_2 extends BaseClass {

	@FindBy(id = "ohrm-small-logo")
	public WebElement logo;

	@FindBy(id = "account-name")
	public WebElement accountName;

	// Creating a constructor
	// Initialize @FindBy elements using driver from BaseClass
	// "this" = this class
	public DashboardPageUsingPageFactory_2() {
		PageFactory.initElements(BaseClass.driver, this);
	}
	

}
