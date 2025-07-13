package com.neotech.lesson03;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Homework1 {
	
	// Part 1-1
	
	/*
	 * Open chrome browser
		Go to "https://demo.guru99.com/test/newtours/"
		Click on Register Link
		Fill out ALL required info
		Click Submit
		User successfully registered
		(Create the script using different locators)
	 */
	
	public static final String url = "https://demo.guru99.com/test/newtours/";
	// This is suggested way to do if the address changed, we can access from anywhere in the class.

	public static void main(String[] args) throws InterruptedException {
		// Create a webdriver object for the browser interaction
		WebDriver driver = new ChromeDriver();
		
		// go to the url
		driver.get(url); // "navigate" works as well. We can enter URL here as well but suggested above.
		
		// a = means link (inspection)
		
		// locate the Register link
		// Used "partialLinkText" because we don't find id, name etc...
		// Be careful! We might find the same keyword "REGISTER".
		driver.findElement(By.partialLinkText("REGIS")).click(); 
		
		//driver.findElement(By.linkText("REGISTER")).click(); // linktext is fine.
		WebElement registerLink = driver.findElement(By.linkText("REGISTER"));
		registerLink.click(); // recommended if you use variable multiple times. 
		// or method chaining below works.
		//driver.findElement(By.linkText("REGISTER")).click();
		
		Thread.sleep(2000);
		
		// lets fill out the form
		driver.findElement(By.name("firstName")).sendKeys("Joost"); // first name
		driver.findElement(By.name("lastName")).sendKeys("vagt"); // last name
		driver.findElement(By.name("phone")).sendKeys("555 444 3323"); // Phone
		driver.findElement(By.id("userName")).sendKeys("joost@gmail.com"); // E-mail
		
		// fill in the address info
		driver.findElement(By.name("address1")).sendKeys("123 Main Street");
		driver.findElement(By.name("city")).sendKeys("NYC");
		driver.findElement(By.name("state")).sendKeys("NY");
		driver.findElement(By.name("postalCode")).sendKeys("09334");
		
		// fill in the user info
		driver.findElement(By.id("email")).sendKeys("joost");
		driver.findElement(By.name("password")).sendKeys("123@abc");
		
		driver.findElement(By.name("confirmPassword")).sendKeys("123@abc");
		
		// submit the form 
		driver.findElement(By.name("submit")).click();
		
		Thread.sleep(2000);
		
		// lets verify the registration
		String successfulRegistrationUrl = "https://demo.guru99.com/test/newtours/register_sucess.php";
		String actualUrl = driver.getCurrentUrl();
		
		if (successfulRegistrationUrl.equals(actualUrl)) {
			System.out.println("Registration test was successful");
		} else {
			System.out.println("Test failed!!!");
		}
		
		driver.quit();
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
