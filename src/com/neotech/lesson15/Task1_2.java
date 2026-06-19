package com.neotech.lesson15;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

import com.neotech.utils.CommonMethods;

// Go to https://the-internet.herokuapp.com/key_presses
// Press on ESC, TAB, and ENTER.

public class Task1_2 extends CommonMethods {

	public static void main(String[] args) {

		setUp();

		WebElement searchBox = driver.findElement(By.id("target"));

		searchBox.sendKeys(Keys.ESCAPE);

		wait(2);

		searchBox.sendKeys(Keys.TAB);

		wait(2);

		searchBox.sendKeys(Keys.ENTER);

		// OR
		// box.sendKeys(Keys.ESCAPE.TAB.ENTER);
		// Method chaining

		tearDown();

	}

}
