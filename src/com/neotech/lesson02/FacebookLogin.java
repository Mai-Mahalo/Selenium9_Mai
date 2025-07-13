package com.neotech.lesson02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

// Part 3-1

public class FacebookLogin {
	
	// go to https://facebook.com/
	// fill out the username
	// fill out the password

	public static void main(String[] args) throws InterruptedException {
		
		// navigate to facebook.com
		WebDriver driver = new ChromeDriver();
		driver.get("https://facebook.com/");
		
		// locate the username box
		
		// Create a WebElement object
		WebElement usernameBox = driver.findElement(By.id("email")); // "id" most guaranteed one.
		// send the username to userbox
		usernameBox.sendKeys("neo@tech.com"); // "sendKeys" method
		
		Thread.sleep(2000);
		
		// locate the password box
		driver.findElement(By.id("pass")).sendKeys("p@ssword"); // method chaining
		
		Thread.sleep(2000);
		
		// locate the submit button
		driver.findElement(By.name("login")).click();
		
		Thread.sleep(5000);
		
		driver.quit();
	}
	
	// "id" supposed to be unique.
	// "name" is not unique.

}
