package com.testingmind.core;

import org.apache.logging.log4j.Logger;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.testingmind.utils.ConfigReader;
import com.testingmind.utils.ExtentManager;
import com.testingmind.utils.ExtentTestManager;
import com.testingmind.utils.LoggerWrapper;

public class BaseTest {
	
	public static final Logger logger = LoggerWrapper.getLogger(BaseTest.class);
		
	@BeforeSuite(alwaysRun = true)
	public void startReporter() {
		ExtentManager.initializeReporter();
		ConfigReader.load("QA");
		System.out.println("Test execution started.");
		logger.info("Test execution started.");
		logger.info("Reports and logs initialized.");
	}
	
	@BeforeMethod(alwaysRun = true)
	public void createTestReport(ITestResult result) {
		ExtentTest test = ExtentManager.initializeReporter().createTest(result.getMethod().getMethodName());
		ExtentTestManager.setTest(test);
	}
	
	@AfterMethod(alwaysRun = true)
	public void getTestResultAndUpdateInReport(ITestResult result) {
		switch (result.getStatus()) {
			case ITestResult.SUCCESS:
				ExtentTestManager.getTest().log(Status.PASS, "Test case " + result.getName() + " is passed.");
				break;
			case ITestResult.FAILURE:
				ExtentTestManager.getTest().log(Status.FAIL, "Test case " + result.getName() + " is failed.");
				ExtentTestManager.getTest().log(Status.FAIL, "Test case " + result.getName() + " is failed due to " + result.getThrowable());
				break;
			case ITestResult.SKIP:
				ExtentTestManager.getTest().log(Status.SKIP, "Test case " + result.getName() + " is skipped.");
				break;
		}
		ExtentTestManager.removeTest();
	}
	
	@AfterSuite(alwaysRun = true)
	public void closeTestReport() {
		ExtentManager.initializeReporter().flush();
		logger.info("Test execution completed.");
	}
}
