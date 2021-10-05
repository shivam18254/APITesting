package ApiTesting;


import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.specification.RequestSpecification;
import io.restassured.response.Response;

public class TC001_GET_Request{
	
	@Test
	void getDetails()
	{
		RestAssured.baseURI="https://reqres.in/api/users?page";
		
		RequestSpecification httpRequest=RestAssured.given();
		
		Response response=httpRequest.request(Method.GET,"/2");
		
		String responseBody=response.getBody().asString();
		System.out.println("Response Body is :" +responseBody);
		
		//Status code
		int statusCode=response.getStatusCode();
		System.out.println("status code is :"+statusCode);
	
	
	}


	
		


}

