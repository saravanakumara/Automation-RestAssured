package com.testingmind.builders;

import org.apache.logging.log4j.Logger;

import com.testingmind.utils.ConfigReader;
import com.testingmind.utils.LoggerWrapper;

import io.restassured.builder.RequestSpecBuilder;
import io.restassured.specification.RequestSpecification;

public class RequestSpecificationBuilder {
	
	private static final Logger logger = LoggerWrapper.getLogger(RequestSpecificationBuilder.class);
	
	public static RequestSpecification getRequestSpecification() {
		logger.warn("Request specifiaction created.");
		return new RequestSpecBuilder()
				.setBaseUri(ConfigReader.getProperty("base.url"))
				.addHeader("Content-Type", "application/json")
				.build();
	}
}
