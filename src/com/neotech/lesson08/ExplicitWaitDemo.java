package com.neotech.lesson08;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.neotech.utils.BaseClass;

// Part 3-1

public class ExplicitWaitDemo extends BaseClass {
	// https://neotech.vercel.app/waits

	public static void main(String[] args) throws InterruptedException {
		
		setUp();
		
		// Explicit wait:
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20)); 
		// wait up to 20 seconds above
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("button1")));
		
		WebElement button = driver.findElement(By.id("button1"));
		
		System.out.println("Button1 is displayed " + button.isDisplayed());
		
		button.click();
		
		Thread.sleep(3000);
			
		tearDown();	

	}

}
