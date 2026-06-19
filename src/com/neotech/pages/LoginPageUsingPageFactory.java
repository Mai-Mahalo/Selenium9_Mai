package com.neotech.pages;

// Lesson 14 & 15
// Lesson 14, Part-3, (16:00)
// https://hrm.neotechacademy.com

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.neotech.utils.BaseClass;

public class LoginPageUsingPageFactory {

	@FindBy(id = "txtUsername")
	public WebElement username;

	@FindBy(id = "txtPassword")
	public WebElement password;

	@FindBy(xpath = "//button")
	public WebElement loginBtn;

	@FindBy(id = "txtPassword-error")
	public WebElement passwordError;

	@FindBy(xpath = "//div[@class='toast-message']")
	public WebElement invalidPasswordMsg;

	public LoginPageUsingPageFactory() {
		PageFactory.initElements(BaseClass.driver, this);
		// this = LoginPageUsingPageFactory
	}
}