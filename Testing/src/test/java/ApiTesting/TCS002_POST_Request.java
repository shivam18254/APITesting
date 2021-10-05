package ApiTesting;


import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.specification.RequestSpecification;
import io.restassured.response.Response;

public class TCS002_POST_Request{
	
	@Test
	void getDetails()
	{
		RestAssured.baseURI="https://reqres.in/api/users";
		
		RequestSpecification httpRequest=RestAssured.given();
		
		JSONObject  requestParams=new JSONObject();
		
		requestParams.put("first_name", "ROM");
		requestParams.put("last_name", "BOM");
		requestParams.put("id", "2");
		requestParams.put("email", "ROM.BOM@reqres.in");
		
		httpRequest.header("Content-Type","application/json");
		
		httpRequest.body(requestParams.toJSONString());
		
		Response response=httpRequest.request(Method.POST,"/users");
		
		String responseBody=response.getBody().asString();
		System.out.println("Response Body is :" +responseBody);
		
		
		
		int statusCode=response.getStatusCode();
		System.out.println("status code is :"+statusCode);
	
	
	}


	
		


}

