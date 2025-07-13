package com.neotech.lesson02;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

//Part 2-5 (45:00)

public class BrowserCommands { 
	
	// 1. Open chrome browser.
	// 2. Navigate to "https://www/zillow.com/"
	// 3. Navigate to "https/www.google.com/"
	// 4. Navigate back to Zillow page
	// 5. Refresh current page
	// 6. Verify url contains "Zillow"

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		
		// 1st way: use the get() method
		// driver.get("https://www.zillow.com/"); 
		// will not maintain the browsing history
		
		// 2nd way: use the navogate() method
		driver.navigate().to("https://www.zillow.com/");
		// will maintain the browsing history.
		
		Thread.sleep(4000);
		
		// maximize the window
		// driver.manage().window().maximize(); -> OK!
		driver.manage().window().fullscreen(); // maximize and fullscreen are same.
		
		Thread.sleep(3000);
		
		driver.navigate().to("http://google.com");
		Thread.sleep(3000);
		
		// 4. Navigate back to Zillow Page
		driver.navigate().back();
		Thread.sleep(3000);
		
		// 5. Refresh current page
		driver.navigate().refresh();
		Thread.sleep(3000);
		
		// 6. Verify url contains "Zillow".
		String url = driver.getCurrentUrl();
		if (url.contains("Zillow")) {
			System.out.println("Test passed");
		} else {
			System.out.println("Test failed!!");
			System.out.println("Current Url: " + url);
		}
		
		driver.quit();
		// The sample code shwos the "quit" before 6. but it should be the end of the code.
		
		
		
		

	}

}
