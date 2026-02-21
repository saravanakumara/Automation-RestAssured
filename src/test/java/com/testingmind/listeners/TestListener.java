package com.testingmind.listeners;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.testingmind.utils.ExtentManager;
import com.testingmind.utils.ExtentTestManager;

public class TestListener implements ITestListener{

	public void onTestStart(ITestResult result) {
		ExtentTest test = ExtentManager.initializeReporter().createTest(result.getMethod().getMethodName());
		ExtentTestManager.setTest(test);
	}

	public void onTestSuccess(ITestResult result) {
		ExtentTestManager.getTest().log(Status.PASS, "Test passed.");
		ExtentTestManager.removeTest();
	}

	public void onTestFailure(ITestResult result) {
		ExtentTestManager.getTest().log(Status.FAIL, result.getThrowable());
		ExtentTestManager.removeTest();
	}

	public void onTestSkipped(ITestResult result) {
		ExtentTestManager.getTest().log(Status.SKIP, "Test skipped.");
		ExtentTestManager.removeTest();
	}

	public void onStart(ITestContext context) {
		ExtentManager.initializeReporter();
	}

	public void onFinish(ITestContext context) {
		ExtentManager.initializeReporter().flush();
	}


}
