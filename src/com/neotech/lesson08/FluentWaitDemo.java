package com.neotech.lesson08;

import java.time.Duration;
import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;

import com.neotech.utils.BaseClass;

// Part 3-3 (30:00)

public class FluentWaitDemo extends BaseClass {
	// https://neotech.vercel.app/waits

	public static void main(String[] args) {
		
		setUp();
		
		FluentWait<WebDriver> wait = new FluentWait<WebDriver>(driver);
		wait.withTimeout(Duration.ofSeconds(21));
		wait.pollingEvery(Duration.ofSeconds(3));
		wait.ignoring(NoSuchElementException.class);
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("button1")));
		
		WebElement button1 = driver.findElement(By.id("button1"));
		System.out.println("Button1 is displayed: " + button1.isDisplayed());
		
		button1.click();
		
		tearDown();
		

	}

}
