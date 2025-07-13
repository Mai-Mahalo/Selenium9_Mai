package com.neotech.lesson03;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HW2forL3 {

	/*
	 * Homework 2: Using Css ONLY TC 2: Mercury Tours Registration: Open chrome
	 * browser Go to “http://demo.guru99.com/test/newtours/” Click on Register Link
	 * Fill out all required info Click Submit User successfully registered
	 * 
	 */

	// 1. Set a URL as public / static / final / string / (content) outside of the
	// main method.
	// 2. Set a Chrome Driver. (up-casting) (Hint! WebDrive...) -> import!
	// 3. Get an URL
	// 4. Locate Register"button" element and click (Refer step 5) "parent" "a['href=XXXX']"
    // a = HTML tag <a>
	// 5. Locate each element by using css "tag#id"(if "id) or "[name='XXXX']"
	//    (HINT! driver.find...(By...("......").sendKey("...");
	// 6. Wait for 3-4 seconds.
	// 7. Locate Submit "button" element and click (Refer step 5)
	// 8. Close the browser!
	
	public static final String url = "http://demo.guru99.com/test/newtours/";

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.get(url);
		
		driver.findElement(By.cssSelector("td.mouseOut a[href='register.php'")).click();
		
		driver.findElement(By.cssSelector("[name='firstName']")).sendKeys("Mai");
		driver.findElement(By.cssSelector("[name='lastName']")).sendKeys("Malanog");
		driver.findElement(By.cssSelector("[name='phone']")).sendKeys("09012345432");
		driver.findElement(By.cssSelector("input#userName")).sendKeys("KeroKero@gmail.com");
		
		// Mailing information
		driver.findElement(By.cssSelector("[name='address1']")).sendKeys("12-45 Room 405");
		driver.findElement(By.cssSelector("[name='city']")).sendKeys("Takatsuki");
		driver.findElement(By.cssSelector("[name='state']")).sendKeys("HI");
		
		// User Information
		driver.findElement(By.cssSelector("input#email")).sendKeys("Kerokero");
		driver.findElement(By.cssSelector("[name='password']")).sendKeys("neotech@123");
		driver.findElement(By.cssSelector("[name='confirmPassword']")).sendKeys("neotech@123");
		
		Thread.sleep(5000);
		
		// Submit button
		driver.findElement(By.cssSelector("[name='submit']")).click();
		
		Thread.sleep(5000);
		
		driver.quit();
		
		
		
		
		
		
		
		

	}

}
