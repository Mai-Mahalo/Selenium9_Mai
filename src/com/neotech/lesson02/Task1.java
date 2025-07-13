package com.neotech.lesson02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

//Part 3-2

public class Task1 {
	
	/*
	Open chrome browser
	Go to "https://demo.guru99.com/test/newtours/"
	Click on Register Link
	
	Fill out just
	First Name:	
	Last Name:	
	Phone:	
	Email:	
	And Click Submit 
	
	*/
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.guru99.com/test/newtours/");
		
		Thread.sleep(3000);
		
		driver.findElement(By.linkText("REGISTER")).click(); // "a" on the inspection = link
		driver.findElement(By.name("firstName")).sendKeys("Anna");
		driver.findElement(By.name("lastName")).sendKeys("Thurman");
		driver.findElement(By.name("phone")).sendKeys("555 665 4445");
		driver.findElement(By.name("userName")).sendKeys("annna@thurman.com");
		
		// "REGISTER" and so on need to be found by "Inspection" right click on the elements
		// on the website.
		
		// "id" is the safest.
		// We commonly use "id" and "name".
		
		Thread.sleep(5000);
		
		// click the submit button
		driver.findElement(By.name("submit")).click();
		
		Thread.sleep(5000);
		
		driver.close();

	}

}
