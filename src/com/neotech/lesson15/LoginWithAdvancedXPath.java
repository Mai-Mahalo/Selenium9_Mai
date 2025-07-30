package com.neotech.lesson15;

// Lesson 15
// Need to watch again!!!

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.neotech.utils.CommonMethods;
import com.neotech.utils.ConfigsReader;

public class LoginWithAdvancedXPath extends CommonMethods {
	// https://hrm.neotechacademy.com/
	public static void main(String[] args) {
		setUp();

		// find username and password using advanced xpath
		WebElement username = driver.findElement(By.xpath("//div[@class='input-field'][1]/input"));
		sendText(username, ConfigsReader.getProperty("username"));

		WebElement password = driver
				.findElement(By.xpath("//div[@class='input-field'][1]/following-sibling::div[1]/input"));
		sendText(password, ConfigsReader.getProperty("password"));

		WebElement loginBtn = driver
				.findElement(By.xpath("//div[@class='input-field'][1]/following-sibling::div[2]/button"));
		click(loginBtn);

		wait(2);

		tearDown();

	}

}