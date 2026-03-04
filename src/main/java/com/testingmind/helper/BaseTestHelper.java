package com.testingmind.helper;

import java.io.File;
import java.time.LocalDate;
import java.util.Calendar;
import java.util.Date;

import org.apache.logging.log4j.Logger;

import com.testingmind.utils.LoggerWrapper;

public class BaseTestHelper {
	
	private static final Logger logger = LoggerWrapper.getLogger(BaseTestHelper.class);
	/*
	 * Create folder
	 */
	public static void createFolder(String path) {
		try {
			File file = new File(path);
			if(!file.exists()) {
				file.mkdir();
			} else {
				logger.warn("Folder already  created.");
			}
		} catch (Exception e) {
			logger.warn("Unable to create folder.");
			logger.warn(e);
		}
	}
	
	/*
	 * Get current time
	 */
	public static String getCurrentTime() {
		Date now =  new Date();		
		String currentTime = now.toString().replace(' ','-').replace(':', '-');
		return currentTime;		
	}
	
	/*
	 * Get current date
	 */
	public static String getCurrentDate() {
		return LocalDate.now().toString();		
	}
}
