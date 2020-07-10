package com.apiquality.api_rest_test;

import org.json.JSONObject;
import org.testng.annotations.Test;
import static io.restassured.RestAssured.given;
import io.restassured.RestAssured;
import io.restassured.response.Response;

public class CollectionsTest {

	String ROOT_URI = "https://wmxrwq14uc.execute-api.us-east-1.amazonaws.com";
	
	@Test
	public void addEmployee() {

		// configure the rest assured base url
		RestAssured.baseURI  = ROOT_URI; 
		 
		// Create the json object needed to post /Prod/api/employees
		JSONObject addEmpJSON = new JSONObject().put("firstName", "Stan")
				                                .put("lastName","woods")
				                                .put("depenedants","1");
				                          
		
		// Create Response 
	    given().auth().basic("TestUser19", "J{I$?t;JRS>9")
	    		 			//  .headers("Authorization", "Basic VGVzdFVzZXIxOTpKe0kkP3Q7SlJTPjk=")
	    		 				.body(addEmpJSON.toString()) // body is taking json object as string
	    		 				.contentType("application/json").
	    		 		when()
	    		 				.post("/Prod/api/employees"). //endpoint
	    		 		then()
	    		 				.assertThat()
	    		 				.statusCode(401); // check status code based on test case 401
	    		 				
	    
	        
	    // System.out.println(body);
	     //System.out.println(res.getStatusCode());
	     System.out.println(addEmpJSON.toString());
		
	} 
	
	@Test
	public void login() {
		
		RestAssured.baseURI  = ROOT_URI; 
		 
		// Create the json object needed to post /Prod/api/employees
		JSONObject addEmpJSON = new JSONObject().put("firstName", "Stan")
				                                .put("lastName","woods")
				                                .put("depenedants","1");
				                          
		
		// Create Response 
	    given().auth().basic("TestUser1919", "J{I$?t;JRS>9")
	    		 			//  .headers("Authorization", "Basic VGVzdFVzZXIxOTpKe0kkP3Q7SlJTPjk=")
	    		 				//.body(addEmpJSON.toString()) // body is taking json object as string
	    		 				.contentType("application/json").
	    		 		when()
	    		 				.post("/Prod/Account/Login").
	    		 		then()
	    		 				.assertThat()
	    		 				.statusCode(200); // check 
		
	}
	
}
	
