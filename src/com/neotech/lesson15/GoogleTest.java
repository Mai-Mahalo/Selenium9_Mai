package com.neotech.lesson15;

// Lesson 15
// Need to watch again!!!

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

import com.neotech.utils.CommonMethods;

public class GoogleTest extends CommonMethods {

	public static void main(String[] args) {

		setUp();

		WebElement searchBox = driver.findElement(By.name("q"));

		searchBox.sendKeys("selenium");

		wait(2);

		// now lets click on Enter key to start the search
		searchBox.sendKeys(Keys.ENTER);

		wait(2);

		tearDown();

	}

}