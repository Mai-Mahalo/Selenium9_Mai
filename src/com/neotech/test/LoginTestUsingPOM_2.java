package com.neotech.test;

import com.neotech.pages.LoginPage_2;
import com.neotech.utils.CommonMethods;
import com.neotech.utils.ConfigsReader;

public class LoginTestUsingPOM_2 extends CommonMethods {
	
	// Selenium 9, Lesson 14, until 24:00
	// https://hrm.neotechacademy.com
	// for self-practice
	
	public static void main(String[] args) {
		
		setUp();
		
		// after setUpp(), we are  in login page and the elements are ready.
		LoginPage_2 loginPage = new LoginPage_2();
		
		// enter the username
		sendText(loginPage.username, ConfigsReader.getProperty("username"));
		
		// enter the password
		sendText(loginPage.password, ConfigsReader.getProperty("password"));
		
		// click on the login button
		click(loginPage.loginBtn);
		
		// or:
		// loginPage.loginBtn.click();
		
		wait(5);
		
		// Need to create another page called "Dashboard page" under "com.neotech.pages". 
		// After 23:00 in Selenium Class, Lesson 14, Part-2
		

		
		
		
		
		tearDown();
		
		
		
		
	}

}
