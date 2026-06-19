package com.neotech.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.neotech.pages.DashboardPage_2;
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
		
		// if I put the Dashboard object here. It's wrong because we are still in the log in page.
		// We will get the "exception" error.
		// The simple POM is not available but page factory can be possible.
		// DashboardPage_2 dashboard = new DashboardPage_2();
		
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
		
		// if you don't create the Dashboard page file.
		// WebElement logo = driver.findElement(By.id("ohrm-small-logo"));
		
		// Using DashBoardPage_2 object
		DashboardPage_2 dashboard = new DashboardPage_2();
		// you can change any name "dashboard".
		
		if (dashboard.logo.isDisplayed()) {
			System.out.println("Test passed");
		} else {
			System.out.println("Test failed!!!");
		}
		
		// verify the logged in user is "Jacqueline White".
		String expectedName = "Jacqueline White";
		String actualName = dashboard.accountName.getText();
		// "dashboard" from "DashboardPage_2 dashboard = new DashboardPage_2();"
		
		if (actualName.equals(expectedName)) {
			System.out.println(expectedName + " logged in.");
		} else {
			System.out.println(expectedName + " did NOT log in!");
		}
		
		wait(3);
		
		tearDown();
		}

		
		
		
		
		
		
		
		
		
	}


