package com.neotech.pages;

// Lesson 14
// Need to watch again!!!

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.neotech.utils.BaseClass;

public class LoginPage extends BaseClass {

	public WebElement username = driver.findElement(By.id("txtUsername"));
	public WebElement password = driver.findElement(By.id("txtPassword"));
	public WebElement loginBtn = driver.findElement(By.xpath("//button"));
}