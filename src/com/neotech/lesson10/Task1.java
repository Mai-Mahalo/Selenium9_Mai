package com.neotech.lesson10;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.neotech.utils.BaseClass;
import com.neotech.utils.ConfigsReader;

// Part 3-1

public class Task1 extends BaseClass {

	public static void main(String[] args) throws InterruptedException {

		/*
	 	1) Open chrome browser
		2) Go to https://hrm.neotechacademy.com/
		3) Login into the application
		4) Select Discipline
		5) Select Disciplinary Cases
		6) Click on Filter (Up-Right next to Help)
		7) Select from June 6, 2024 to July 15, 2024
		8) Click on Search
		9) Validate that there are no rows in result table
		10) Quit the browser
	 
	 */
		
		setUp();
		
		// This is to wait elements showing up to 10 seconds
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		driver.findElement(By.id("txtUsername")).sendKeys(ConfigsReader.getProperty("username"));
		driver.findElement(By.id("txtPassword")).sendKeys(ConfigsReader.getProperty("password"));
		
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		// "//button" works because there is no another button in the page.
		
		Thread.sleep(2000);
		
		// 4) Select Discipline
		driver.findElement(By.id("menu_discipline_defaultDisciplinaryView")).click();
		
		// 5) Select Disciplinary Cases
		driver.findElement(By.id("menu_discipline_viewDisciplinaryCases")).click();
		
		Thread.sleep(2000);
		
		// the filter element is inside a frame. We have to move to that frame in order to click it.
		// 3 ways to move to the iframe below.
		// driver.switchTo().frame(0); // by index
		driver.switchTo().frame("noncoreIframe");
		//driver.switchTo().frame(driver.findElement(By.id("noncoreIframe")));
		
		driver.findElement(By.id("searchModal")).click();
		
		Thread.sleep(2000);
		
		driver.findElement(By.id("DisciplinaryCaseSearch_createdDateFrom")).click();
		
		// now the calendar is showing
		
		// select the month
		driver.findElement(By.xpath("//div[@class='select-wrapper picker__select--month']/input")).click(); // click the pull-down
		// "/input" = when you inspect the arrow, the elements shows staring from "input".
		
		driver.findElement(By.xpath("//div[@class='select-wrapper picker__select--month']//span[text()='July']")).click();
		
		// select the year (= 2024)
		driver.findElement(By.xpath("//div[@class='select-wrapper picker__select--year']/input")).click(); // click the pull-down
		
		driver.findElement(By.xpath("//div[@class='select-wrapper picker__select--year']//span[text()='2024']")).click();
		
		
		// select the day
		//table[@id='DisciplinaryCaseSearch_createdDateFrom_table']//td
		
		List<WebElement> days = driver.findElements(By.xpath("//table[@id='DisciplinaryCaseSearch_createdDateFrom_table']//td"));
		
		for (WebElement day : days)
		{
			if (day.getText().equals("5"))
			{
				day.click();
				break;
			}
		}
		
		Thread.sleep(2000);
		
		// now select the second date
		
		// click on the calendar
		driver.findElement(By.id("DisciplinaryCaseSearch_createdDateTo")).click();
		
		// select the month
		driver.findElement(By.xpath("//div[@id='DisciplinaryCaseSearch_createdDateTo_root']//input[1]")).click();
		// Used id to diffrentiate from the first calendar
		// [1] is the first one indicate the month.
		driver.findElement(By.xpath("//div[@id='DisciplinaryCaseSearch_createdDateTo_root']//span[text()='August']")).click();
		
		// select the year
		driver.findElement(By.xpath("//div[@id='DisciplinaryCaseSearch_createdDateTo_root']//div[@class='select-wrapper picker__select--year']//input")).click();
		// "class" found 2 elements, so added "id" as well to specify location.
		
		driver.findElement(By.xpath("//div[@id='DisciplinaryCaseSearch_createdDateTo_root']//span[text()='2026']")).click();
		
		// select the day
        List<WebElement> days2 = driver.findElements(By.xpath("//table[@id='DisciplinaryCaseSearch_createdDateTo_table']//td"));
		
		for (WebElement day : days2)
		{
			if (day.getText().equals("15"))
			{
				day.click();
				break;
			}
		}
		
		driver.findElement(By.id("searchBtn")).click();
		
		Thread.sleep(4000);
		

		tearDown();
		

	}

}
