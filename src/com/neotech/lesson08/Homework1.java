package com.neotech.lesson08;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;

import com.neotech.utils.BaseClass;

public class Homework1 extends BaseClass {
	
	// Part 1-1 (after 9:00)
	
	/*	 
	1) Launch the browser and open the site "https://neotech.vercel.app/email"
	2) Click on link "Click Here". When the user clicks on the "Click Here" link, new child window opens.
	3) On the Child Window, Enter your email ID and submit.
	4) Then Access Credentials will be Displayed on submitted page. You will see the child window is open in new tab.
	5) Close the Child window on which credentials are displayed.Switch to the parent window.
	6) Quit all browsers
	*/

	public static void main(String[] args) throws InterruptedException {
	// https://neotech.vercel.app/email
		
		setUp();
		
		// locate and click on the Click here link
		driver.findElement(By.linkText("Click Here")).click();
		
		// Will be opening 2 windows so we need to focus what window will be handled.
		Set <String> handles = driver.getWindowHandles();
		
		Iterator <String> it = handles.iterator();
		String parentWindow = it.next();
		String childWindow = it.next();
		
		// we have to switch into the child window
		driver.switchTo().window(childWindow);
		
		// Enter the email in child window
		driver.findElement(By.id("emailid")).sendKeys("test@gmail.com");
		
		// Another way to find: //input[@name='emailid']
		// driver.findElement(By.xpath("//input[@name='emailid']")).sendKeys("test@gmail.com");
		
		Thread.sleep(3000);
		
		// click on the button
		driver.findElement(By.name("btnLogin")).click();
		
		Thread.sleep(3000);
		
		// get the credential from the page
		String username = driver.findElement(By.id("username")).getText();
		String password = driver.findElement(By.id("password")).getText();
		
		System.out.println("Username is: " + username);
		System.out.println("Password is: " + password);
		
		// Close the child window, switch back to the main window
		driver.close(); // = active window = child window
		// driver.switchTo().window(parentWindow); = NO need to switch but 
		
		Thread.sleep(3000);
			
		tearDown();
		
		
		
		
		
		

	}

}
