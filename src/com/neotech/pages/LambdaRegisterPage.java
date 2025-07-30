package com.neotech.pages;

// Lesson 15
// Need to watch again!!!

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.neotech.utils.BaseClass;

public class LambdaRegisterPage {

	@FindBy(id = "userpassword")
	public WebElement passwordBox;

	@FindBy(xpath = "//input[@id='userpassword']/following-sibling::div/span")
	public WebElement show;

	@FindBy(xpath = "//input[@id='userpassword']/../../preceding-sibling::div/div/input")
	public WebElement businessEmail;

	public LambdaRegisterPage() {
		PageFactory.initElements(BaseClass.driver, this);
	}

}
