package com.testingmind.utils;

public enum StatusCodes {
	
	SUCCESS(200, "The request is succeeded."),
	CREATED(201, "New resource is created."),
	DELETED(204, "The resource is deleted."),
	BAD_REQUEST(400, "The request is incorrect."),
	UNAUTHORIZED(401, "Credentials mismatch."),
	FORBIDDEN(403, "Not allowed to access the resource."),
	NOT_FOUND(404, "The resource not found."),
	TOO_MANY_REQUEST(429, "Server is not allowing too many request in a minute or hour."),
	METHOD_NOT_SUPPORTED(405, "The request HTTP method is not supported by the resource."),
	HEADER_SIZE_LARGE(431, "The request contains more than allowed headers size."),
	INTERNAL_SERVER_ERROR(500, "Application error on the server."),
	SERVICE_UNAVAILABLE(503, "Server is unaccessible now."),
	BAD_GATEWAY(502, "Received incorrect or improper response from the upstream site."),
	GATEWAY_TIMEOUT(504, "The upstream is taking more time to respond."),
	METHOD_NOT_IMPLEMENTED(501, "The server does not support the request HTTP method.");
	
	public final String message;
	public final int code;
	
	StatusCodes(int code, String message) {
		this.message = message;
		this.code = code;
	}
}
