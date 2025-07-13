package com.neotech.lesson02;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

// Part 1-1 (5:00) 

/*
 * HW1: Amazon Page Title Verification: 
   Open chrome browser
   Go to “https://www.amazon.com/”
   Verify Title “Amazon.com: Online Shopping for Electronics, Apparel, Computers, Books, DVDs & more” is displayed
   End the Session (close the browser).
 */

// cmd + shift + O to import

public class Homework1 {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.amazon.com");
		
		String expectedTitle = "Amazon.com: Online Shopping for Electronics, Apparel, Computers, Books, DVDs & more";
		String actualTitle = driver.getTitle();
		
		System.out.println("Actual title: " + actualTitle);
		
		// verification process below
		if(expectedTitle.equalsIgnoreCase(actualTitle)) {
			System.out.println("test passed");
		} else {
			System.out.println("test failed!!");
		}
		
		Thread.sleep(3000);
		driver.quit();
		

	}

}
