package com.neotech.lesson15;

import com.neotech.pages.LoginPageUsingPageFactory_2;
import com.neotech.utils.CommonMethods;
import com.neotech.utils.ConfigsReader;

// Lesson 15, part-1, 15:00

/*
 * TC 1: Orange HRM blank password validation
	1. Go to https://hrm.neotechacademy.com/
	2. Enter valid username and leave password field empty
	3. Click on login button
	4. Verify error message with text "Password cannot be empty" is displayed
 */

// Also used "LoginPageUsingPageFactory" class from "com.neotech.pages" package 
// and "CommonMethods" and "ConfigsReader" classes from "com.neotech.utils" package.

public class Homework1_2 extends CommonMethods {
	
	public static void main(String[] args) {
		
		setUp();
		
		LoginPageUsingPageFactory_2 login = new LoginPageUsingPageFactory_2();
		
		sendText(login.username, ConfigsReader.getProperty("username"));
		click(login.loginButton);
		
		wait(2);
		
		String expectedMessage = "Password cannot be empty";
		String actualMessage = login.pwError.getText();
		
		if (actualMessage.equals(expectedMessage)) {
			System.out.println("Test passed");
		} else {
			System.out.println("Test failed!!!");
		}
		
		
		tearDown();
		
	}
	
	
	


}
