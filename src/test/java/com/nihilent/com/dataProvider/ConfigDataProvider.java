package com.nihilent.com.dataProvider;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

import org.testng.Reporter;

public class ConfigDataProvider {

	static Properties pro;

	public ConfigDataProvider() {
		File src = new File("./Configuration/config.properties");

		try {
			FileInputStream fis = new FileInputStream(src);
			pro = new Properties();
			pro.load(fis);
		} catch (Exception e)

		{
			Reporter.log("Exception display" + e.getMessage(),true);
		}
	}
	
	/*
	 * 
	 * 
	 */
	public String getPropertValue(String propertyName) {
		return pro.getProperty(propertyName);
	}
}
