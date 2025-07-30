package com.neotech.lesson09;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.neotech.utils.BaseClass;
import com.neotech.utils.ConfigsReader;

public class DynamicTable extends BaseClass {

	// Part 3-1 (6:00)

	public static void main(String[] args) throws InterruptedException {
		// https://hrm.neotechacademy.com

		setUp();

		// implicit wait = Not to quit finding elements up to 10 seconds
		// This is usually how we write the code for implicit wait below.
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		// login to the application
		// Username -> ConfigReder's file to avoid the codes failed if changed username
		// and password
		driver.findElement(By.id("txtUsername")).sendKeys(ConfigsReader.getProperty("username"));
		driver.findElement(By.id("txtPassword")).sendKeys(ConfigsReader.getProperty("password"));

		// click on login button
		driver.findElement(By.xpath("//button[@type='submit']")).click();

		// locate and click on the PIM menu
		// Look for "li id=XXXX" (inspect) for expandable button
		driver.findElement(By.id("menu_pim_viewPimModule")).click();
		driver.findElement(By.linkText("Employee List")).click();
		// We can use linkText because there is <a> tag as a parent.
		
		Thread.sleep(5000);
		
		// List for all rows
		List<WebElement> rows = driver.findElements(By.xpath("//table[@id='employeeListTable']/tbody/tr"));
		
		String expected = "Linda";
		
		for (int i = 0; i < rows.size(); i++) {
			String rowText = rows.get(i).getText();
			
			if (rowText.contains(expected)) {
				// click on the name
				// get a list of all third column items
				
				List<WebElement> thirdColumnData = driver.findElements(By.xpath("//table[@id='employeeListTable']/tbody/tr/td[3]"));
				
				thirdColumnData.get(i).click();
				break;
			}
				
		}
		
		Thread.sleep(5000);
		
		tearDown();

	}

}
