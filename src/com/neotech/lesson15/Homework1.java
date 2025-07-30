package com.neotech.lesson15;

// Lesson 15
// Need to watch again!!!

import com.neotech.pages.LoginPageUsingPageFactory;
import com.neotech.utils.CommonMethods;
import com.neotech.utils.ConfigsReader;

public class Homework1 extends CommonMethods {
	/*
	 * TC 1: Orange HRM blank password validation
		1. Go to https://hrm.neotechacademy.com/
		2. Enter valid username and leave password field empty
		3. Click on login button
		4. Verify error message with text "Password cannot be empty" is displayed
	 */
	public static void main(String[] args) {
		setUp();

		LoginPageUsingPageFactory login = new LoginPageUsingPageFactory();

		sendText(login.username, ConfigsReader.getProperty("username"));

		wait(2);

		click(login.loginBtn);

		wait(2);

		// check if we see the proper error message
		String expectedMessage = "Password cannot be empty";
		String actualMessage = login.passwordError.getText();

		if (actualMessage.equals(expectedMessage)) {
			System.out.println("Test passed.");
		} else {
			System.out.println("Test failed!!!");
		}

		tearDown();
	}

}