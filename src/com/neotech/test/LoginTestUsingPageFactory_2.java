package com.neotech.test;

import com.neotech.pages.DashboardPageUsingPageFactory_2;
import com.neotech.pages.LoginPageUsingPageFactory_2;
import com.neotech.utils.CommonMethods;
import com.neotech.utils.ConfigsReader;

// Lesson 14, Part 3, 27:00
// https://hrm.neotechacademy.com

public class LoginTestUsingPageFactory_2 extends CommonMethods {
	
	public static void main(String[] args) {
		
		setUp();
		
		// Create a object = blue print
		LoginPageUsingPageFactory_2 loginPage2 = new LoginPageUsingPageFactory_2();
		DashboardPageUsingPageFactory_2 dashboard2 = new DashboardPageUsingPageFactory_2();
		
		// enter username
		sendText(loginPage2.username, ConfigsReader.getProperty("username"));
		
		// enter password
		sendText(loginPage2.password, ConfigsReader.getProperty("password"));
		
		// click on login button
		click(loginPage2.loginButton);
		
		wait(5);
		
		// verify if the logo is displayed or not
		if (dashboard2.logo.isDisplayed()) {
			System.out.println("Test passed");
		} else {
			System.out.println("Test failed!!!");
		}
		
		// verify the logged in user is "Jacqueline White"
		String expectedName2 = "Mai Yamamura";
		String actualName2 = dashboard2.accountName.getText();
		
		if (actualName2.equals(expectedName2)) {
			System.out.println(expectedName2 + " logged in.");
		} else {
			System.out.println(expectedName2 + " did NOT log in!");

		}
		
		wait(3);
		
		tearDown();
	
	}

}
