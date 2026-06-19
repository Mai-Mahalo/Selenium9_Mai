package com.neotech.lesson15;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.neotech.utils.CommonMethods;
import com.neotech.utils.ConfigsReader;

// Lesson 15, Part-3, 12:00
// https://hrm.neotechacademy.com/

public class LoginWIthAdvancedXpath_2 extends CommonMethods {
	
	public static void main(String[] args) {
		
		setUp();
		
		// find username and pasword using advanced xpath
		// username
		WebElement username = driver.findElement(By.xpath("//div[@class='input-field'][1]/input"));
		sendText(username, ConfigsReader.getProperty("username"));
		
		// password (using "following-sibling::")
		WebElement password = driver.findElement(By.xpath("//div[@class='input-field'][1]/following-sibling::div[1]/input"));
		sendText(password, ConfigsReader.getProperty("password"));
		
		// Login button (using "following-sibling::")
		WebElement loginBtn = driver.findElement(By.xpath("//div[@class='input-field'][1]/following-sibling::div[2]/button"));
		click(loginBtn);
		
		wait(2);
		
		tearDown();
		
	}

}
