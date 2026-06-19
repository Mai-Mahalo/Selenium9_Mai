package com.neotech.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.neotech.utils.BaseClass;

//Selenium Lesson 14, Part-2 (after 24:00 - 35:00)
//https://hrm.neotechacademy.com

public class DashboardPage_2 extends BaseClass {
	
	public WebElement logo = driver.findElement(By.id("ohrm-small-logo"));
	
	public WebElement accountName = driver.findElement(By.id("account-name"));
	
	

}
