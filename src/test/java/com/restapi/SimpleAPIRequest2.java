package com.restapi;

import static io.restassured.RestAssured.*;
//import io.restassured.response.Response;
//import io.restassured.specification.RequestSpecification;

public class SimpleAPIRequest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		baseURI = "https://www.google.com";
		
		 
		System.out.println(given().get().getStatusCode());
		System.out.println(given().get().asString());

	}

}
