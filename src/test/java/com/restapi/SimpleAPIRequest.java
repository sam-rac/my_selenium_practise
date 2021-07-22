package com.restapi;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class SimpleAPIRequest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RestAssured.baseURI = "https://www.google.com";
		RequestSpecification request = RestAssured.given();
		Response response =request.get();
		System.out.println(response.getStatusCode());
		System.out.println(response.asString());

	}

}
