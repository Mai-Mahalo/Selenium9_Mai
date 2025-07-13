package com.neotech.lesson06;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.neotech.utils.BaseClass;

//Part 2-2 (32:00) Need to watch it again

public class DropdownDemo2 extends BaseClass {
// https://demoqa.com/select-menu

	public static void main(String[] args) throws InterruptedException {
		
		setUp();
		
		// locate the web element
		WebElement colorDdElement = driver.findElement(By.id("oldSelectMenu"));
		
		
		//create the select object
		Select colorDd = new Select(colorDdElement);
		colorDd.selectByIndex(1); // blue = index 1, red is index 0
		
		// locate the modern dropdown element
		// Inspect -> find parent with "id" then use it. (make sure if it is the correct dropdown.)
		WebElement modernDd = driver.findElement(By.id("withOptGroup"));
		modernDd.click();
		
		Thread.sleep(2000);
		
		
		
		
		
		
		
		tearDown();
		
		

	}

}
