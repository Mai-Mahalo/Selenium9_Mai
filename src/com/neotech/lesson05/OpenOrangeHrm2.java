package com.neotech.lesson05;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.neotech.utils.ConfigsReader;
import com.neotech.utils.Constants;

// Part 2-1
// do not need to be able to code everything by myself, need to understand the logic.

public class OpenOrangeHrm2 {

	public static void main(String[] args) throws InterruptedException {
		ConfigsReader.readProperties(Constants.CONFIGURATION_FILEPATH);
		// "ConfigsReader" = another class name
		String browser = ConfigsReader.getProperty("browser");
		System.out.println(browser);
		
		WebDriver driver = null;
		switch(browser.toLowerCase()) {
		case "chrome":{ // { is not necessary, it is optiona
			driver = new ChromeDriver();
			break;
		}
		default:
			break; // automatically code will be shown up but no need to use it.
		}
		
		// now testing code starts
		String url = ConfigsReader.getProperty("url");
		driver.get(url);
		
		System.out.println(driver.getTitle());
		Thread.sleep(2000);
		driver.quit();
		

	}

}
