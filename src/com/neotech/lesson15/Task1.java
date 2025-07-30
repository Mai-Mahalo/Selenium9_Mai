package com.neotech.lesson15;

// Lesson 15
// Need to watch again!!!

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

import com.neotech.utils.CommonMethods;

public class Task1 extends CommonMethods {
	// Go to https://the-internet.herokuapp.com/key_presses
	// Press on ESC, TAB, and ENTER.

	public static void main(String[] args) {
		setUp();

		WebElement box = driver.findElement(By.id("target"));

		box.sendKeys(Keys.ESCAPE);
		wait(2);

		box.sendKeys(Keys.TAB);
		wait(2);

		box.sendKeys(Keys.ENTER);
		wait(2);

		// OR
		// box.sendKeys(Keys.ESCAPE.TAB.ENTER);

		tearDown();

	}

}