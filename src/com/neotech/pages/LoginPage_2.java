package com.neotech.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.neotech.utils.BaseClass;

// Selenium 9, Lesson 14
// https://hrm.neotechacademy.com
// for self practice

public class LoginPage_2 extends BaseClass {
	// We use "BaseClass" to extend because we only want to locate the element, no need actions such as "click" etc.
	
	public WebElement username = driver.findElement(By.id("txtUsername"));
	public WebElement password = driver.findElement(By.id("txtPassword"));
	public WebElement loginBtn = driver.findElement(By.xpath("//button"));
	
		
	}


