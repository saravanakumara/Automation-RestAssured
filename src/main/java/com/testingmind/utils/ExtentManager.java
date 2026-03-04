package com.testingmind.utils;

import org.apache.logging.log4j.Logger;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.testingmind.helper.BaseTestHelper;

public class ExtentManager {
	
	private static ExtentReports extentReports;
	private static final Logger logger = LoggerWrapper.getLogger(ExtentManager.class);
	
	public static ExtentReports initializeReporter() {
		if(extentReports == null) {
			String reportFolderPath = System.getProperty("user.dir") + "\\reports\\" + BaseTestHelper.getCurrentDate();
			BaseTestHelper.createFolder(reportFolderPath);
			
			ExtentSparkReporter reporter = new ExtentSparkReporter(reportFolderPath + "\\RestAssured-Report-" + BaseTestHelper.getCurrentTime() +"-" + System.currentTimeMillis() + ".html");
			reporter.config().setDocumentTitle("RestAssured Execution Report");
			reporter.config().setReportName("Automation-RestAssured-TDD Report");
			
			extentReports = new ExtentReports();
			extentReports.attachReporter(reporter);
			extentReports.setSystemInfo("Tester", "Sara");
			extentReports.setSystemInfo("OS", System.getProperty("os.name"));
			extentReports.setSystemInfo("OS Version", System.getProperty("os.version"));
			logger.warn("Extent report initialized.");
		}
		return extentReports;
	}

}
