package com.neotech.lesson09;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.neotech.utils.BaseClass;

// Part 2-1

public class WebTableDemo extends BaseClass{
	// https://neotech.vercel.app/tables/2

	public static void main(String[] args) {
		setUp();
		
		System.out.println("------ TABLE HEADER ------");
		
		List<WebElement> headerData = driver.findElements(By.xpath("//table[@id='task-table']/thead/tr/th"));
		// Inspection process to find "//table[@id='task-table']/thead/tr/th".
		// 1. Right click "Task" area
		// 2. Find "id=" above
		// 3. Find "thead" after id.
		// 4. Find "th" afater thead to get the header
		
		Iterator<WebElement> it = headerData.iterator();
		
		while (it.hasNext()) {
			String headerText = it.next().getText();
			System.out.print(headerText + " | ");
			
		}
		
		System.out.println();
		
		// lets find the number of rows
		List<WebElement> rows = driver.findElements(By.xpath("//table[@id='task-table']/tbody/tr"));
		
		System.out.println("Table has " + rows.size() +  " rows. ");
		
		// What does this do?
		System.out.println(rows.get(0).getText());
		
		// lets print the content of each td (= Column)
		// short-cut way (xpath): "//table[@id='task-table']//td" 
		//  = "//table[@id='task-table']/tbody/tr/td"
		// tds = multiple td
		
		List<WebElement> tds = driver.findElements(By.xpath("//table[@id='task-table']//td"));
		
		for (WebElement td : tds) {
			System.out.println(td.getText());
		}
		
		tearDown();

	}

}
