package com.neotech.lesson02;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Homework2 {
	
	/*HW2: Opening Page on Firefox Browser
	  Open Firefox browser
	  Navigate to “https://www.redfin.com/”
	  Verify that you have navigated to (https://www.redfin.com/)
	  End the Session (close the browser). 
	 */
	
	// cmd + shift + O to import

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new FirefoxDriver(); 
		// upcasting because if we want to change from Firefox to Chrome.
		// Firefox Driver = new FirefoxDriver(); is also fine but can't change to another browser
		
		driver.get("https://www.redfin.com/");
		
		Thread.sleep(3000);
		
		String expectedUrl = "https://www.redfin.com/";
		String actualUrl = driver.getCurrentUrl();
		
		if (actualUrl.equalsIgnoreCase(expectedUrl)) {
			System.out.println("Test passed!");
		} else {
			System.out.println("Test failed!!");
			System.out.println("Expected: " + expectedUrl);
			System.out.println("Actual: " + actualUrl);
		}
		
		driver.quit();
		
		
		
		
		
		
		
		
		

	}

}
