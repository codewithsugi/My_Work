package com.sugi.resttest;
import org.json.simple.JSONObject;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import io.restassured.response.Response;

import static io.restassured.RestAssured.*;

public class RestTestSample {
	
	
	
	@Test
	public void testGet()
	{
		Response response = get("https://reqres.in/api/users?page=2");
		
		System.out.println(response.getStatusCode());
		System.out.println(response.getBody().asString());
		//Reporter.log(response.getBody().toString(),true);
	}
	
	@Test
	public void testPost()
	{
		JSONObject request = new JSONObject();
		request.put("name", "test");
		request.put("job", "welcome");
		
		Response response =given().body(request.toJSONString()).when().post("https://reqres.in/api/users");
		
		Assert.assertEquals(201,response.getStatusCode());
		
		System.out.println(response.getStatusCode());
		System.out.println(response.getBody().asString());
		//Reporter.log(response.getBody().toString(),true);
	}


}