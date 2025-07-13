package com.neotech.lesson07;

//Part 3-1

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;

import com.neotech.utils.BaseClass;

public class WindowHandleDemo extends BaseClass {

	public static void main(String[] args) throws InterruptedException {
		// https://accounts.google.com/signup
		
		setUp();
		
		System.out.println("Title --> " + driver.getTitle());
		
		System.out.println("Window Handle --> " + driver.getWindowHandle());
		// WindowHandle number is varied everyone.
		
		driver.findElement(By.linkText("Help")).click();
		
		Set <String> allWindowHandles = driver.getWindowHandles();
		System.out.println(allWindowHandles); // won't print anything until you do iteration.
		
		Iterator<String> it = allWindowHandles.iterator();
		
		String window1 = it.next();
		String window2 = it.next();
		
		System.out.println("Window 1: " + window1);
		System.out.println("Widow 2: " + window2);
		
		Thread.sleep(3000);
		
		// Just because we see that the new tab shows up, it does not mean 
		// that we can just start working with it. We need to switch the focus of the driver
		
		driver.switchTo().window(window2);
		Thread.sleep(3000);
		
		String title2 = driver.getTitle();
		
		System.out.println("Title --> " + title2);
		
		driver.close();
		
		Thread.sleep(3000);
		
		tearDown();
		
		
		
		

	}

}
