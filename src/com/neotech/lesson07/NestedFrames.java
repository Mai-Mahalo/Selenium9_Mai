package com.neotech.lesson07;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.neotech.utils.BaseClass;

public class NestedFrames extends BaseClass {
	
	// Part 2-2 (26:00)

	public static void main(String[] args) {
		// https://neotech.vercel.app/iframe/nested
		
		setUp();
		
		// switch to parent frame
		driver.switchTo().frame("parent-frame");
		// this way is easiest if you find "id".
		
		
		// switch to child frame
		driver.switchTo().frame(driver.findElement(By.id("child-frame")));
		// We use the option if we can't find "id", we can use xpath, css and so on.
		// since we have the frame (String nameOrId), then if I have an id, of course, I would use that.
		
		// now the driver focus is in the child frame
		WebElement p = driver.findElement(By.tagName("p"));
		String text = p.getText();
		
		System.out.println("The text inside the child frame is: " + text );
		
		// switch to the main page
		driver.switchTo().defaultContent();
		
		tearDown();
		
		
		
		

	}

}
