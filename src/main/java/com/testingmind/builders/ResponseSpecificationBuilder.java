package com.testingmind.builders;

import io.restassured.builder.ResponseSpecBuilder;
import io.restassured.specification.ResponseSpecification;

public class ResponseSpecificationBuilder {
	
	public static ResponseSpecification get201ResponseSpecification() {
		return new ResponseSpecBuilder()
				.expectStatusCode(201)
				.build();
	}

	public static ResponseSpecification get200ResponseSpecification() {
		return new ResponseSpecBuilder()
				.expectStatusCode(200)
				.build();
	}

	public static ResponseSpecification get204ResponseSpecification() {
		return new ResponseSpecBuilder()
				.expectStatusCode(204)
				.build();
	}

	public static ResponseSpecification get400ResponseSpecification() {
		return new ResponseSpecBuilder()
				.expectStatusCode(400)
				.build();
	}
	
	public static ResponseSpecification get401ResponseSpecification() {
		return new ResponseSpecBuilder()
				.expectStatusCode(401)
				.build();
	}

	public static ResponseSpecification get403ResponseSpecification() {
		return new ResponseSpecBuilder()
				.expectStatusCode(403)
				.build();
	}

	public static ResponseSpecification get404ResponseSpecification() {
		return new ResponseSpecBuilder()
				.expectStatusCode(404)
				.build();
	}

	public static ResponseSpecification get405ResponseSpecification() {
		return new ResponseSpecBuilder()
				.expectStatusCode(405)
				.build();
	}

	public static ResponseSpecification get431ResponseSpecification() {
		return new ResponseSpecBuilder()
				.expectStatusCode(431)
				.build();
	}

	public static ResponseSpecification get415ResponseSpecification() {
		return new ResponseSpecBuilder()
				.expectStatusCode(415)
				.build();
	}
	
	public static ResponseSpecification get429ResponseSpecification() {
		return new ResponseSpecBuilder()
				.expectStatusCode(429)
				.build();
	}
	
	public static ResponseSpecification get500ResponseSpecification() {
		return new ResponseSpecBuilder()
				.expectStatusCode(500)
				.build();
	}
	
	public static ResponseSpecification get503ResponseSpecification() {
		return new ResponseSpecBuilder()
				.expectStatusCode(503)
				.build();
	}

	public static ResponseSpecification get502ResponseSpecification() {
		return new ResponseSpecBuilder()
				.expectStatusCode(502)
				.build();
	}

	public static ResponseSpecification get504ResponseSpecification() {
		return new ResponseSpecBuilder()
				.expectStatusCode(504)
				.build();
	}

}
