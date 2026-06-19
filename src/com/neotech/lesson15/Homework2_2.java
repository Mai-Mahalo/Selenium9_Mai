package com.neotech.lesson15;

import com.neotech.pages.LoginPageUsingPageFactory_2;
import com.neotech.utils.CommonMethods;
import com.neotech.utils.ConfigsReader;

// Lesson 15, Part-1 (28:00)
// for self-practice

public class Homework2_2 extends CommonMethods {
	
	/*
	 * TC 2: Orange HRM wrong password validation
		1. Go to https://hrm.neotechacademy.com/
		2. Enter valid username and wrong password
		3. Click on login button
		4. Verify error message with text "Invalid credentials" is displayed
	 */
	
	public static void main(String[] args) {
		
		setUp();
		
		LoginPageUsingPageFactory_2 login = new LoginPageUsingPageFactory_2();
		
		sendText(login.username, ConfigsReader.getProperty("username"));
		sendText(login.password, "ABCDE");
		
		wait(2);
		
		click(login.loginButton);
		
		wait(3);
		
		if(login.inValidCredentials.isDisplayed()) {
			System.out.println("Test passed");
		} else {
			System.out.println("Test failed");
		
		}
		
		tearDown();
		
		
	}


}
