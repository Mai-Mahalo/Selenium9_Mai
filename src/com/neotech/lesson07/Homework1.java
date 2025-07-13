package com.neotech.lesson07;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.neotech.utils.BaseClass;

// part 1-1

public class Homework1 extends BaseClass {

	/*
	 * Amazon Department List Verification Open chrome browser Go to
	 * "http://amazon.com/" Verify how many department options available. Print each
	 * department Select Computers Quit browser
	 * 
	 */

	public static void main(String[] args) throws InterruptedException {
		
		setUp();
		
		WebElement department = driver.findElement(By.id("searchDropdownBox"));
		Select departmentDd = new Select(department);
		
		List <WebElement> options = departmentDd.getOptions();
		
		System.out.println("There are " + options.size() + " department");
		
		for (WebElement el : options)
		{
			System.out.println(el.getText());
		}
		
		// Select computers
		// tbd	
		//departmentDd.selectByValue("search-alias=computers");
		// run-time error will be shown up and could not resolve during the class above.
		
		Thread.sleep(4000);
		
		
		tearDown();
		

	}

}
