package com.neotech.pages;

// Selenium Lesson 14
// Need to watch again!!

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.neotech.utils.BaseClass;

public class DashboardPage extends BaseClass {

	public WebElement logo = driver.findElement(By.id("ohrm-small-logo"));

	public WebElement accountName = driver.findElement(By.id("account-name"));
}