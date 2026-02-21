package com.testingmind.clients;

import org.apache.logging.log4j.Logger;

import com.testingmind.builders.ResponseSpecificationBuilder;
import com.testingmind.core.BaseRequest;
import com.testingmind.models.request.CreateAuthToken;
import com.testingmind.utils.Endpoints;
import com.testingmind.utils.LoggerWrapper;

import io.restassured.response.Response;
import static io.restassured.RestAssured.given;

public class AuthClient extends BaseRequest{
	private static final Logger logger =  LoggerWrapper.getLogger(AuthClient.class);
	
	public Response createAuth(CreateAuthToken createTokenRequest) {
		logger.debug("Creating auth token.");
		Response response = given()
				.spec(requestSpec)
				.body(createTokenRequest)
				.when()
				.post(Endpoints.CREATE_TOKEN)
				.then()
				//.spec(ResponseSpecificationBuilder.get200ResponseSpecification())
				.extract()
				.response();
		return response;
	}

}
