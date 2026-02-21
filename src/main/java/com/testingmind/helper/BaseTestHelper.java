package com.testingmind.helper;

import java.io.File;
import java.util.Date;

public class BaseTestHelper {
	
	/*
	 * Create folder
	 */
	public static void createFolder(String path) {
		try {
			File file = new File(path);
			if(file.isDirectory() && !file.exists()) {
				file.mkdir();
			} else {
				System.out.println("Folder already  created.");
			}
		} catch (Exception e) {
			System.out.println("unable to create folder.");
			System.out.println(e);
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
}
