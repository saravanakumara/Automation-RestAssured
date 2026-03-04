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
			logger.warn("path-load: " + filePath);
			FileInputStream fis = new FileInputStream(new File(filePath));			
			properties.load(fis);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	public static String getProperty(String key) {
		logger.warn("Key to read from properties: " + key);
		logger.warn("Value to read from properties: " + properties.getProperty(key));
		return properties.getProperty(key);
	}

}
