package com.sugi.resttest;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.restassured.builder.RequestSpecBuilder;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;

import static org.hamcrest.Matchers.*;

import static io.restassured.RestAssured.*;

public class TestRest {
	
	
	
	@BeforeTest
	public void setup()
	{
		baseURI = "https://reqres.in/";
		//port = 8020;
		
		basePath=baseURI + "/api/register";
		
		
		basic(DEFAULT_PATH, DEFAULT_BODY_ROOT_PATH);
	}
	
	
	@Test
	public void restTest()
	{
		
		 String body ="{\n"
		 		+ "    \"email\": \"eve1.holt@reqres.in\",\n"
		 		+ "    \"password\": \"pistol1\"\n"
		 		+ "}";
		
		RequestSpecification spc = new RequestSpecBuilder().setBody(body).setContentType("application/json").build();
		
		//Response flag = given().spec(spc).when().get("https://reqres.in/api/register").andReturn();
		
		 System.out.println(given().when().get("https://reqres.in/api/users").then().extract().body().asString());
		 
		 System.out.println(given().when().get("https://reqres.in/api/users").then().body("per_page",hasSize(6)));
		 
		
		//System.out.println(flag.getStatusCode());
		
		
		
	}
	
	
	
	@AfterTest
	public void tearDown()
	{
		
	}

}

class A{
	
	
}


