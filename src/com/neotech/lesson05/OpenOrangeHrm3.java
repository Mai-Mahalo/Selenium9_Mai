package com.neotech.lesson05;

import com.neotech.utils.BaseClass;

//Part 2-4 (40:00) & 3-1

public class OpenOrangeHrm3 extends BaseClass {

	public static void main(String[] args) throws InterruptedException {
		
		// setUp the testing environment
		setUp();
		
		// write your test
		String title = driver.getTitle();
		System.out.println(title);
		Thread.sleep(2000);
		
		// close the browser
		tearDown();
		

	}

}
