package com.neotech.lesson01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

/*HW2: Opening Page on Firefox Browser
  Open Firefox browser
  Navigate to “https://www.redfin.com/”
  Verify that you have navigated to (https://www.redfin.com/)
  End the Session (close the browser). 
 */

public class HW2 {

	public static void main(String[] args) throws InterruptedException {
		// 1. Open the browser
		// 2. Go to the URL you want to test (driver.get(URL);)
		// 3. Get a current URL (Hint! String XXX = driver....)
		// 4. Give an expected URL. (Hint! String XXX = URL)
		// 5. Using "if" condition (Hint! actual.equals(expected)
		// 6. Print out "The URL is verified" 
		// 7. else
		// 8. Print out to say wrong URL
		// 9. Quit the browser (always need to close)
		// NOTE: Add sleep for a few seconds in between. (Thread, sleep (2000);)
		
		WebDriver driver = new FirefoxDriver();
		
		driver.get("https://www.redfin.com/");
		
		Thread.sleep(2000);
		
		String currentURL = driver.getCurrentUrl();
		String expectedURL = "https://www.redfin.com/";
		
		if(currentURL.equals(expectedURL))
		{
			System.out.println("This is the correct URL for " + driver.getTitle());
		}
		else
		{
			System.out.println("This is invalid website.");
		}
		
		Thread.sleep(2000);
		
		driver.quit();

	}

}
