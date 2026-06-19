package com.neotech.lesson15;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

import com.neotech.utils.CommonMethods;

// Lesson 15 part-2, 41:00
// https://www.google.com

public class GoogleTest_2 extends CommonMethods {
	
	public static void main(String[] args) {
		
		setUp();
		
		WebElement searchBox = driver.findElement(By.name("q"));
		// We found id "APjFqb" but it might be dynamic so we used the name "q".
		
		searchBox.sendKeys("Selenium");
		
		wait(2);
		
		searchBox.sendKeys(Keys.ENTER);
		
		wait(2);
		
		tearDown();
		
		
	}

}
