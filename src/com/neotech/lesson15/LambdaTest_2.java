package com.neotech.lesson15;

import com.neotech.pages.LambdaRegisterPage_2;

// Lesson 15 (37:00)

/*
 * Go to https://accounts.lambdatest.com/register 
 * Find the Password Element and enter a password 
 * Find the Show span as a nephew of the password element and click on it 
 * Find the Business Email as a cousin of the password element and enter an email 
 * Close the browser
 */

//UI has been changed so the code is changed from the one we learned in the class.

import com.neotech.utils.CommonMethods;

public class LambdaTest_2 extends CommonMethods {
	
	public static void main(String[] args) {
		
		setUp();
		LambdaRegisterPage_2 registration = new LambdaRegisterPage_2();
		
		sendText(registration.passwordBox, "Neotech_Mai");
		
		jsClick(registration.showPW);
		
		wait(3);
		
		sendText(registration.email, "MaiTest1234@neotech.com");
		
		wait(3);
		
		tearDown();
		
	}

}
