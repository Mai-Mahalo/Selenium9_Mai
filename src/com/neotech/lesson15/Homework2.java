package com.neotech.lesson15;

// Lesson 15
// Need to watch again!!!

import com.neotech.pages.LoginPageUsingPageFactory;
import com.neotech.utils.CommonMethods;
import com.neotech.utils.ConfigsReader;

public class Homework2 extends CommonMethods {
	/*
	 * TC 2: Orange HRM wrong password validation
		1. Go to https://hrm.neotechacademy.com/
		2. Enter valid username and wrong password
		3. Click on login button
		4. Verify error message with text "Invalid credentials" is displayed
	 */

	public static void main(String[] args) {
		setUp();

		LoginPageUsingPageFactory login = new LoginPageUsingPageFactory();

		sendText(login.username, ConfigsReader.getProperty("username"));
		sendText(login.password, "wrong-password");

		wait(2);

		click(login.loginBtn);

		wait(3);

		if (login.invalidPasswordMsg.isDisplayed()) {
			System.out.println("Test passed");
		} else {
			System.out.println("Test failed!!!");
		}

		tearDown();

	}

}