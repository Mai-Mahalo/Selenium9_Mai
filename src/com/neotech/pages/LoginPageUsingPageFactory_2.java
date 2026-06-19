package com.neotech.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.neotech.utils.BaseClass;

// Lesson 14 & 15
// Lesson 14, Part-3, (16:00)
// https://hrm.neotechacademy.com

public class LoginPageUsingPageFactory_2 {

	@FindBy(id = "txtUsername")
	public WebElement username;

	@FindBy(id = "txtPassword")
	public WebElement password;

	@FindBy(xpath = "//button")
	public WebElement loginButton;

	// From Lesson 15, part-1, 15:00, Homework1_2 class
	// https://hrm.neotechacademy.com/

	@FindBy(id = "txtPassword-error")
	public WebElement pwError;

	// From Lesson 15, part-1, 28:00, Homework2_2 class
	// https://hrm.neotechacademy.com/
	
	@FindBy(css = "div.toast-message") // Instructor used xpath but tried using css for my practice.
	public WebElement inValidCredentials;

	// Creating a constructor
	// Initialize @FindBy elements using driver from BaseClass
	// "this" = this class
	public LoginPageUsingPageFactory_2() {
		PageFactory.initElements(BaseClass.driver, this);
	}

}
