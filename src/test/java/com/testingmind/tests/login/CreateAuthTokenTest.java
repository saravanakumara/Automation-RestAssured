package com.testingmind.tests.login;

import org.apache.logging.log4j.Logger;
import org.testng.annotations.Test;

import com.testingmind.clients.AuthClient;
import com.testingmind.core.BaseTest;
import com.testingmind.factory.TestDataFactory;
import com.testingmind.models.request.CreateAuthToken;
import com.testingmind.models.response.AuthTokenResponse;
import com.testingmind.utils.LoggerWrapper;
import com.testingmind.utils.SoftAssertions;

import io.restassured.response.Response;

public class CreateAuthTokenTest extends BaseTest {

	private static final Logger logger = LoggerWrapper.getLogger(CreateAuthTokenTest.class);
	@Test
	public void createAuthToken_validCredentails() {
		
		CreateAuthToken createTokenRequest = TestDataFactory.createAuthToken();
		
		AuthClient authClient = new AuthClient();
		
		Response response = authClient.createAuth(createTokenRequest);
		
		SoftAssertions.AssertEquals(response.getStatusCode(), 200, "");
		SoftAssertions.AssertTrue(!response.body().asString().isEmpty(), "Not an empty body.");
		
		AuthTokenResponse authTokenResponse = response.as(AuthTokenResponse.class);
		SoftAssertions.AssertTrue(!(authTokenResponse == null), "Not an empty reposne.");
		String token = authTokenResponse.getToken();
		logger.debug("Token received from server: " + token);
		SoftAssertions.AssertTrue(!(token == ""), "Token is not empty.");
		SoftAssertions.assertAll();
	}
	
	@Test
	public void createAuthToken_inCorrectCredentials() {
		
		CreateAuthToken createTokenRequest = TestDataFactory.createAuthTokenWithWrongCredentials();
		
		AuthClient authClient = new AuthClient();
		
		Response response = authClient.createAuth(createTokenRequest);
		
		SoftAssertions.AssertEquals(response.getStatusCode(), 401, "");
		SoftAssertions.AssertTrue(!response.body().asString().isEmpty(), "Not an empty body.");
		
		SoftAssertions.assertAll();
	}
	
	@Test
	public void createAuthToken_emptyCredentails() {
		
		CreateAuthToken createTokenRequest = TestDataFactory.createAuthTokenWithWrongCredentials();
		
		AuthClient authClient = new AuthClient();
		
		Response response = authClient.createAuth(createTokenRequest);
		
		SoftAssertions.AssertEquals(response.getStatusCode(), 400, "");
		SoftAssertions.AssertTrue(!response.body().asString().isEmpty(), "Not an empty body.");
		
		SoftAssertions.assertAll();
	}
}
