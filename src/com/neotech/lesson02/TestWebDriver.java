package com.neotech.lesson02;

import java.util.Scanner;
//Part 2-4 (23:00)

public class TestWebDriver {
	
	static I_WebDriver driver; 
	// parents, has to be "static" because the main method is static.
	// static variable
	
	// run-time polymorphism
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Which browser to use?");
		String browser = scan.next();
		
		if (browser.equals("chrome")) {
			driver = new C_ChromeDriver();	
		} else if (browser.equals("firefox")) {
			driver = new C_FirefoxDriver();
		} else {
			System.out.println("No such browser, I will use chrome instead!");
			driver = new C_ChromeDriver();
		}
		
		driver.get("https://google.com");
		
		driver.getTitle();
		
		driver.quit();
		
		scan.close();
		
	}
	
}

