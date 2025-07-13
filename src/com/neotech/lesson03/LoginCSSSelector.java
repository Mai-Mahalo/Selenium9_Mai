package com.neotech.lesson03;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

//Part 3-2 (25:00)

public class LoginCSSSelector {
	
	public static final String url = "https://neotech.vercel.app/login";

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.get(url);
		
		driver.findElement(By.cssSelector("input#username")).sendKeys("admin");
		// "#"=id, input = tag
		driver.findElement(By.cssSelector("input#password")).sendKeys("admin");	
		
		Thread.sleep(2000);
		
		// Log In button
		driver.findElement(By.cssSelector("button#btnLogin")).click();
		
		// After log in, "Students" button does not have "id", "class"...
		// We can't use CSS for this case.
		// Linkedtext or Xpath are options to use.
		
		Thread.sleep(2000);
		
		driver.findElement(By.linkText("Students")).click();
		
		driver.quit();
		
		// "." = class name, "a.link" = will find <a class>.
		// css performs faster and better.
		
		
		

	}

}
