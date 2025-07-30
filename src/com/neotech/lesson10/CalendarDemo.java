package com.neotech.lesson10;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.neotech.utils.BaseClass;

// Part 2-2 (25:00)
// Need to fix the code (failed because we need to choose a language if accessing from Japan)

public class CalendarDemo extends BaseClass {

	public static void main(String[] args) throws InterruptedException {
		// https://www.delta.com/
		
		setUp();
		
		// This is to wait elements showing up to 10 seconds
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		
		
//      Suggested codes by ChatGPT but still failed        
//		try {
//		    WebElement acceptCookie = wait.until(ExpectedConditions.elementToBeClickable(
//		        By.id("onetrust-accept-btn-handler")
//		    ));
//		    acceptCookie.click();
//		} catch (Exception e) {
//		    System.out.println("Cookie banner not shown");
//		}
//
//		WebElement languageBtn = wait.until(ExpectedConditions.elementToBeClickable(
//		    By.xpath("//button[contains(text(), 'English')]")
//		));
//		languageBtn.click();
		
		//This code is required to choose language if you access from Japan.
		driver.findElement(By.xpath("//button[text()=' Japan - English ']")).click();
		
		// Clicking "Depart" button
		driver.findElement(By.id("calDepartLabelCont")).click();
		
		// Freeze the code to see what is happening
		Thread.sleep(2000);
		
		
		// Let us select July 27 for departure
		
		String currentMonth = driver.findElement(By.xpath("//span[@class='dl-datepicker-month-0']")).getText();
		
		// if it is July, click on a date
		// if it is not, the click next
		
		while(!currentMonth.equals("July")) // the month may need to be changed.
		{
			// I need to click next
			
			driver.findElement(By.xpath("//span[text()='Next']")).click();
			
			// update the month value after moving to the next ones
			
			currentMonth = driver.findElement(By.xpath("//span[@class='dl-datepicker-month-0']")).getText();
			
		}
		
		Thread.sleep(4000);
		
		// now select the day
		
		List<WebElement> days = driver.findElements(By.xpath("//table[@class='dl-datepicker-calendar']//td"));
		
		// Let us iterate over all days and once we find our day, click on it and then break out of the loop
		for (WebElement day : days)
		{
			String dayNum = day.getText();
			if (dayNum.equals("27"))
			{
				day.click();
				break;
			}
		}
		Thread.sleep(4000);
		
		// Now let us select the return date as September 17
		
		String returnMonth = driver.findElement(By.xpath("//span[@class='dl-datepicker-month-0']")).getText();
		
		while(!returnMonth.equals("September"))
		{
			// I need to click next
			
			driver.findElement(By.xpath("//span[text()='Next']")).click();
			
			// update the month value after moving to the next one
			returnMonth = driver.findElement(By.xpath("//span[@class='dl-datepicker-month-0']")).getText();
			
		}
		
		Thread.sleep(4000);
		
		// now we iterate to get the day
		List<WebElement> returnDays = driver.findElements(By.xpath("//table[@class='dl-datepicker-calendar']//td"));
		
		for (WebElement day : returnDays)
		{
			String dayNum = day.getText();
			
			if (dayNum.equals("17"))
			{
				day.click();
				break;
			}
		}
		Thread.sleep(4000);
		
		driver.findElement(By.xpath("//button[@value='done']")).click();
		
		Thread.sleep(4000);
		
		tearDown();
		
		
		
		

	}

}
