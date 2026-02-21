package com.testingmind.factory;

import com.testingmind.models.request.CreateAuthToken;

public class TestDataFactory {

	public static CreateAuthToken createAuthToken() {
		CreateAuthToken createAuthToken = new CreateAuthToken();
		createAuthToken.setUsername("admin");
		createAuthToken.setPassword("password123");
		return createAuthToken;
	}
	
	public static CreateAuthToken createAuthTokenWithWrongCredentials() {
		CreateAuthToken createAuthToken = new CreateAuthToken();
		createAuthToken.setUsername("admin");
		createAuthToken.setPassword("password1234");
		return createAuthToken;
	}
	
	public static CreateAuthToken createAuthTokenWithEmptyCredentails() {
		CreateAuthToken createAuthToken = new CreateAuthToken();
		createAuthToken.setUsername("");
		createAuthToken.setPassword("");
		return createAuthToken;
	}
	
	public static CreateAuthToken createAuthTokenWithEmptyUserName() {
		CreateAuthToken createAuthToken = new CreateAuthToken();
		createAuthToken.setUsername("");
		createAuthToken.setPassword("password123");
		return createAuthToken;
	}
	
	public static CreateAuthToken createAuthTokenWithEmptyPassword() {
		CreateAuthToken createAuthToken = new CreateAuthToken();
		createAuthToken.setUsername("admin");
		createAuthToken.setPassword("");
		return createAuthToken;
	}
}
