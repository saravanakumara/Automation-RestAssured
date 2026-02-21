package com.testingmind.utils;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.testingmind.helper.BaseTestHelper;

public class ExtentManager {
	
	private static ExtentReports extentReports;
	
	public static ExtentReports initializeReporter() {
		if(extentReports == null) {
			String reportFolderPath = System.getProperty("user.dir") + "\\reports\\" + BaseTestHelper.getCurrentTime();
			BaseTestHelper.createFolder(reportFolderPath);
			
			ExtentSparkReporter reporter = new ExtentSparkReporter(reportFolderPath + "-RestAssured-Report-" + System.currentTimeMillis() + ".html");
			reporter.config().setDocumentTitle("RestAssured Execution Report");
			reporter.config().setReportName("Automation-RestAssured-TDD Report");
			
			extentReports = new ExtentReports();
			extentReports.attachReporter(reporter);
			extentReports.setSystemInfo("Tester", "Sara");
			extentReports.setSystemInfo("OS", System.getProperty("os.name"));
			extentReports.setSystemInfo("OS Version", System.getProperty("os.version"));
		}
		return extentReports;
	}

}
