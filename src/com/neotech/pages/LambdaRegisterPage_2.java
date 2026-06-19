package com.neotech.pages;

//Lesson 15 (37:00)

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.neotech.utils.BaseClass;

public class LambdaRegisterPage_2 extends BaseClass{
	
	/*
	 * Go to https://accounts.lambdatest.com/register 
	 * Find the Password Element and enter a password 
	 * Find the Show span as a nephew of the password element and click on it 
	 * Find the Business Email as a cousin of the password element and enter an email 
	 * Close the browser
	 */

	// UI has been changed so the code is changed from the one we learned in the class.
	
	@FindBy (id = "userpassword")
	public WebElement passwordBox;
	
	@FindBy (xpath = "//input[@id='userpassword']/following-sibling::span")
	public WebElement showPW;
	
	@FindBy (xpath = "//input[@id='userpassword']/../../preceding-sibling::div/input")
	public WebElement email;
	// ".." = go to the parent
	// "//" = search anywhere below (descendant)
	// "preceding-sibling" = go to the previous sibling
	// "following-sibling" = go to the next sibling
	// "::div" = look for a div element in that axis
	// "/" = move to the next direct level
	
	// This is static, We NEED it below.
	public LambdaRegisterPage_2() {
		PageFactory.initElements(BaseClass.driver, this);
	}
	

}
