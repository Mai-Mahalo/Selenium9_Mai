package com.neotech.lesson15;

// Lesson 15
// Need to watch again!!!

import com.neotech.pages.LambdaRegisterPage;
import com.neotech.utils.CommonMethods;

public class LambdaTest extends CommonMethods {
	/*
	 * Go to https://accounts.lambdatest.com/register 
	 * Find the Password Element and enter a password 
	 * Find the Show span as a nephew of the password element and click on it 
	 * Find the Business Email as a cousin of the password element and enter an email 
	 * Close the browser
	 */

	public static void main(String[] args) {
		setUp();

		LambdaRegisterPage register = new LambdaRegisterPage();

		sendText(register.passwordBox, "test123");

		jsClick(register.show);

		wait(3);

		sendText(register.businessEmail, "email@my.com");

		wait(3);

		tearDown();

	}

}