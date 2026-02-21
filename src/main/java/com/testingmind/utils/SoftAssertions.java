package com.testingmind.utils;

import org.testng.asserts.SoftAssert;

public class SoftAssertions {
	
	private static SoftAssert softAssert;
	
	private SoftAssertions() {}
	
	private static SoftAssert getInstance() {
		if(softAssert == null) {
			softAssert = new SoftAssert();
		}
		return softAssert;
	}
	
	public static void AssertTrue(boolean condition, String message) {
		try {
			getInstance().assertTrue(condition, message);
		} catch (AssertionError e) {
			getInstance().fail(message);
		} 
	}
	public static void AssertFalse(boolean condition, String message) {
		try {
			getInstance().assertFalse(condition, message);
		} catch (AssertionError e) {
			getInstance().fail(message);
		} 
	}
	public static void AssertEquals(Object actual, Object expected, String message) {
		try {
			getInstance().assertEquals(actual, expected, message);
		} catch (AssertionError e) {
			getInstance().fail(message);
		} 
	}
	public static void AssertNotEquals(Object actual, Object expected, String message) {
		try {
			getInstance().assertNotEquals(actual, expected, message);
		} catch (AssertionError e) {
			getInstance().fail(message);
		} 
	}
	
	public static void assertAll() {
		try {
			getInstance().assertAll();
		} catch (AssertionError e) {
			
		}
	}

}
