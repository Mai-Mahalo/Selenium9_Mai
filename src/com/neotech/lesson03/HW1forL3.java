package com.neotech.lesson03;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HW1forL3 {

	/*
	 * Homework 1: Using xPath ONLY 
	 * TC 2: Mercury Tours Registration: Open chrome
	 * browser Go to “http://demo.guru99.com/test/newtours/” 
	 * Click on Register Link
	 * Fill out all required info Click Submit User successfully registered 
	 */
	
	// 1. Set a URL as public / static / final / string / (content) outside of the main method.
	// 2. Set a Chrome Driver. (up-casting) (Hint! WebDrive...) -> import!
	// 3. Get an URL
	// 4. Locate Register"button" element and click (Refer step 5) //tag[@attribute = 'value']
	// 5. Locate each element by using xpath (HINT! driver.find...(By...("......").sendKey("...");
	// 6. Wait for 3-4 seconds.
	// 7. Locate Submit "button" element and click (Refer step 5)
	// 8. Close the browser!
	
	public static final String url = "http://demo.guru99.com/test/newtours/";

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.get(url);
		
		driver.findElement(By.xpath("//a[@href='register.php']")).click();
		// a = tag, href = attribute, value = register.php, we can use "text" as well.
		
		driver.findElement(By.xpath("//input[@name='firstName']")).sendKeys("Mai");
		driver.findElement(By.xpath("//input[@name='lastName']")).sendKeys("Malanog");
		driver.findElement(By.xpath("//input[@name='phone']")).sendKeys("08034561234");
		driver.findElement(By.xpath("//input[@name='userName']")).sendKeys("maimai@gmail.com");
		
		// Mailing Information
		driver.findElement(By.xpath("//input[@name='address1']")).sendKeys("3-4-234, XXXX");
		driver.findElement(By.xpath("//input[@name='city']")).sendKeys("El Paso");
		driver.findElement(By.xpath("//input[@name='state']")).sendKeys("TX");
		driver.findElement(By.xpath("//input[@name='postalCode']")).sendKeys("1234567");
		
		// Omit pull down since we have not leanrt it yet.
		
		// User Information
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("Snoopy");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("pikachu05");
		driver.findElement(By.xpath("//input[@name='confirmPassword']")).sendKeys("pikachu05");
		
		Thread.sleep(3000);
		
		// Submit button
		driver.findElement(By.xpath("//input[@name='submit']")).click();
		
		Thread.sleep(5000);
		
		driver.quit();
		
		
		
		
		
		
		
		
		

	}

}
