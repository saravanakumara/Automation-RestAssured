package com.testingmind.builders;

import org.apache.logging.log4j.Logger;

import com.testingmind.utils.LoggerWrapper;

import io.restassured.builder.ResponseSpecBuilder;
import io.restassured.specification.ResponseSpecification;

public class ResponseSpecificationBuilder {
	
	private static final Logger logger = LoggerWrapper.getLogger(ResponseSpecificationBuilder.class);
	
	public static ResponseSpecification get201ResponseSpecification() {
		logger.warn("Response specification created.");
		return new ResponseSpecBuilder()
				.expectStatusCode(201)
				.build();
	}

	public static ResponseSpecification get200ResponseSpecification() {
		logger.warn("Response specification created.");
		return new ResponseSpecBuilder()
				.expectStatusCode(200)
				.build();
	}

	public static ResponseSpecification get204ResponseSpecification() {
		logger.warn("Response specification created.");
		return new ResponseSpecBuilder()
				.expectStatusCode(204)
				.build();
	}

	public static ResponseSpecification get400ResponseSpecification() {
		logger.warn("Response specification created.");
		return new ResponseSpecBuilder()
				.expectStatusCode(400)
				.build();
	}
	
	public static ResponseSpecification get401ResponseSpecification() {
		logger.warn("Response specification created.");
		return new ResponseSpecBuilder()
				.expectStatusCode(401)
				.build();
	}

	public static ResponseSpecification get403ResponseSpecification() {
		logger.warn("Response specification created.");
		return new ResponseSpecBuilder()
				.expectStatusCode(403)
				.build();
	}

	public static ResponseSpecification get404ResponseSpecification() {
		logger.warn("Response specification created.");
		return new ResponseSpecBuilder()
				.expectStatusCode(404)
				.build();
	}

	public static ResponseSpecification get405ResponseSpecification() {
		logger.warn("Response specification created.");
		return new ResponseSpecBuilder()
				.expectStatusCode(405)
				.build();
	}

	public static ResponseSpecification get431ResponseSpecification() {
		logger.warn("Response specification created.");
		return new ResponseSpecBuilder()
				.expectStatusCode(431)
				.build();
	}

	public static ResponseSpecification get415ResponseSpecification() {
		logger.warn("Response specification created.");
		return new ResponseSpecBuilder()
				.expectStatusCode(415)
				.build();
	}
	
	public static ResponseSpecification get429ResponseSpecification() {
		logger.warn("Response specification created.");
		return new ResponseSpecBuilder()
				.expectStatusCode(429)
				.build();
	}
	
	public static ResponseSpecification get500ResponseSpecification() {
		logger.warn("Response specification created.");
		return new ResponseSpecBuilder()
				.expectStatusCode(500)
				.build();
	}
	
	public static ResponseSpecification get503ResponseSpecification() {
		logger.warn("Response specification created.");
		return new ResponseSpecBuilder()
				.expectStatusCode(503)
				.build();
	}

	public static ResponseSpecification get502ResponseSpecification() {
		logger.warn("Response specification created.");
		return new ResponseSpecBuilder()
				.expectStatusCode(502)
				.build();
	}

	public static ResponseSpecification get504ResponseSpecification() {
		logger.warn("Response specification created.");
		return new ResponseSpecBuilder()
				.expectStatusCode(504)
				.build();
	}

}
