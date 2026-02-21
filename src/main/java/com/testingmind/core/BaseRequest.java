package com.testingmind.core;

import com.testingmind.builders.RequestSpecificationBuilder;

import io.restassured.specification.RequestSpecification;

public class BaseRequest {
	
	protected RequestSpecification requestSpec = RequestSpecificationBuilder.getRequestSpecification();
	
}
