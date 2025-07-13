package com.neotech.utils;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

//Part 1-2 (37:00) including created a new package called "com.neotech.utis"

public class ConfigsReader {
	
	private static Properties prop; // must be "static"
	
	/*
	 * This method reads the properties of the given config file
	 * 
	 * @param filePath
	 */
	public static void readProperties(String filePath) { // object
		FileInputStream fis;
		try {
			fis = new FileInputStream(filePath);
			prop = new Properties();
			prop.load(fis); // prop = local variable
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch(IOException e) {
			e.printStackTrace();
		}
	
	}
	
	/*
	 * This method returns the value of the provided key in the config file
	 * @param String key
	 * @return String value
	 */
	public static String getProperty(String key) { // object
		return prop.getProperty(key);
		
	}

}
