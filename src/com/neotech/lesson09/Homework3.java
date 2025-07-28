package com.neotech.lesson09;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.neotech.utils.BaseClass;
import com.neotech.utils.ConfigsReader;

// Part 1-1

// NOT working on HW1 and 2 in the class but the codes are still on the Document Channel.

public class Homework3 extends BaseClass {

	/*
	 * Add Employee Open chrome browser Go to "https://hrm.neotechacademy.com/"
	 * Login into the application Click on PIM > Add Employee Add Employee Log out
	 * Quit the browser
	 */
	
	// Username: Admin, Password: Neotech@123

	public static void main(String[] args) throws InterruptedException {
		setUp();
		
		// implicit wait = Not to quit finding elements up to 10 seconds
		// This is usually how we write the code for implicit wait below.
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		// login to the application
		// Username -> ConfigReder's file to avoid the codes failed if changed username and password
		driver.findElement(By.id("txtUsername")).sendKeys(ConfigsReader.getProperty("username"));
		driver.findElement(By.id("txtPassword")).sendKeys(ConfigsReader.getProperty("password"));
		
		// click on login button
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		
		// locate and click on the PIM menu
		// Look for "li id=XXXX" (inspect) for expandable button
		driver.findElement(By.id("menu_pim_viewPimModule")).click();
		driver.findElement(By.id("menu_pim_addEmployee")).click();
		// driver.findElement(By.linkText("Add Employee")).click(); // -> from sample code
		// this is from <span class="left-menu-title" combinedmenutitle="PIM > Add Employee">Add Employee</span>
		// but we can use linkText because there is <a> tag as a parent.
		
		// there are some waiting time here
		// so I will wait until the modal is loaded and the first name box is visible
		WebDriverWait firstNameWait = new WebDriverWait(driver,Duration.ofSeconds(30));
		firstNameWait.until(ExpectedConditions.visibilityOfElementLocated(By.id("first-name-box")));
		
		// send the new employee info
		driver.findElement(By.id("first-name-box")).sendKeys("John");
		driver.findElement(By.id("last-name-box")).sendKeys("Doe");
		
		// locate and fill in the location info (pull-down)
		// Tips: look for "select" object for inspection
		WebElement locationElement = driver.findElement(By.id("location"));
		Select locationDd = new Select(locationElement); // to make it usable the drop-down
		locationDd.selectByVisibleText("France Regional HQ");
		
		Thread.sleep(1000);
		driver.findElement(By.id("modal-save-button")).click();
	
		// verify that the personal details page is loaded. (ExplicitWait)
		WebDriverWait personalDetailsWait = new WebDriverWait(driver, Duration.ofSeconds(30));
		personalDetailsWait.until(ExpectedConditions.visibilityOfElementLocated(By.id("personal_details_tab")));
		
		Thread.sleep(2000);
		
		// log out, look for "id" to click drop-down
		driver.findElement(By.id("user-dropdown")).click(); // Other id under "Uuser-dropdown" will work as well.
		driver.findElement(By.id("logoutLink")).click();
		
		Thread.sleep(3000);
		
		tearDown();
		
		
		
		
		

	}

}
