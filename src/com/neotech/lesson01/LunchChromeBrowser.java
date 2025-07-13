package com.neotech.lesson01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

// Part 2-1 (14:00)
// Ctr + shift + O to import.


public class LunchChromeBrowser {

	public static void main(String[] args) throws InterruptedException {
		
		// If we want to test anything in a web application, we have to follow these steps:
		
		
		// 1. Open the browser
		WebDriver driver = new ChromeDriver(); // Polymorphism
		
		// 2. Go to the URL you want to test
		driver.get("https://www.neotechacademy.com/");
		
		// 3. Do the required test/actions
		
		
		// THe code is very fast. As soon as the browser opens and goes to the 
		// URL the browser will quit.
		
		// to see get more time to see the page we can pause the execution
		Thread.sleep(5000); // pause the execution for 5 seconds (5000 miliseconds)
		// this is from Java's library.
		// ALWAYS to quit!!! The PC will be heavier as it continues processing.
		
	
		// 4. Quit the browser (always need to close)
		driver.quit();

		
		

	}

}
