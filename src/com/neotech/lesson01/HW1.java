package com.neotech.lesson01;

/*
 * HW1: Amazon Page Title Verification: 
   Open chrome browser
   Go to “https://www.amazon.com/”
   Verify Title “Amazon.com: Online Shopping for Electronics, Apparel, Computers, Books, DVDs & more” is displayed
   End the Session (close the browser).
 */

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HW1 {

	public static void main(String[] args) throws InterruptedException {

		// 1. Open the browser
		// 2. Go to the URL you want to test (driver.get(URL);)
		// 3. Get a current URL (Hint! String XXX = driver....)
		// 4. Give an expected URL. (Hint! String XXX = URL)
		// 5. Using "if" condition (Hint! actual.equals(expected)
		// 6. Print out "Page title" + driver.getTitle
		// 7. else
		// 8. Print out to say wrong URL
		// 9. Quit the browser (always need to close)
		// NOTE: Add sleep for a few seconds in between. (Thread, sleep (2000);)


		WebDriver driver = new ChromeDriver();

		driver.get("https://www.amazon.com/");
		
		Thread.sleep(3000);
		
		String currentURL = driver.getCurrentUrl();
		String expectedURL = "https://www.amazon.com/";
		
		if (currentURL.equals(expectedURL)) 
		{
			System.out.println("Title: " + driver.getTitle());
		}
		else
		{
			System.out.println("Wrong page!");
		}
		
		Thread.sleep(3000);
		
		driver.quit();		

	

	}

}
