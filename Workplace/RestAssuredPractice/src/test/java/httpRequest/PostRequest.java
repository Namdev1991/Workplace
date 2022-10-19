package httpRequest;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import static  io.restassured.RestAssured.*;

public class PostRequest {

	@Test
	public void create_and_Get() {
		//https://reqres.in/api/users
		RestAssured.baseURI = "https://reqres.in";   // Initially Set Base URI   Base URI Means Domain from Request
		
		//Given  - Request Details
		//When - Resource Parameter and Path Parameter
		//Then - Validations
		
		
		String response=given().header("Content-Type","application/json").body("{\"name\": \"morpheus\",\r\n" + 
				"    \"job\": \"leader\"}").when().post("api/users").then().assertThat().statusCode(201).extract().response().asPrettyString();
		System.out.println(response);
		
		
		
		
		//Request 2
		//https://reqres.in/api/users?page=2
		
		String responseofGet=given().queryParam("page", "2").when().get("api/users").then().assertThat().statusCode(200).extract().response().asPrettyString();
		
		System.out.println(responseofGet);
		
		
		//Request 3 
		//https://reqres.in/api/users/2
		
		String responsesingle=when().get("api/users/2").then().assertThat().statusCode(200).extract().response().asPrettyString();
		
		System.out.println("----------*--------**------------***-----------**-------");
		System.out.println(responsesingle);
		
	}
	
}
