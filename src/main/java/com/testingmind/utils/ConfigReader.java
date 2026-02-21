package com.testingmind.utils;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

import org.apache.logging.log4j.Logger;

public class ConfigReader {
	private static final Logger logger = LoggerWrapper.getLogger(ConfigReader.class);
	private static Properties properties = new Properties();
	
	public static void load(String env) {
		try {
			String filePath = Constants.ENVIRONMENT_PROPERTY_FILE_PATH + env + ".properties";
			System.out.println("path-load: " + filePath);
			FileInputStream fis = new FileInputStream(new File(filePath));			
			properties.load(fis);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	public static String getProperty(String key) {
		System.out.println("Path:" + key);
		System.out.println("Path:" + properties.getProperty(key));
		return properties.getProperty(key);
	}

}
