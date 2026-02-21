package com.testingmind.builders;

import com.testingmind.utils.ConfigReader;

import io.restassured.builder.RequestSpecBuilder;
import io.restassured.specification.RequestSpecification;

public class RequestSpecificationBuilder {

	public static RequestSpecification getRequestSpecification() {
		return new RequestSpecBuilder()
				.setBaseUri(ConfigReader.getProperty("base.url"))
				.addHeader("Content-Type", "application/json")
				.build();
	}
}
