package httpRequest;

import static io.restassured.RestAssured.given;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;

public class BasicValidations {

	//Get Request=https://reqres.in/api/users?page=2
	
	
	@Test
	public void basicvalidations() {
		RestAssured.baseURI="https://reqres.in";
	Response response=given().log().all().queryParam("page", "2").when().get("api/users").then().log().all()
		.assertThat().statusCode(200).header("Connection", "keep-alive").extract().response(); // It Will Return the response of this request
		
		// Validate Status code
		int statuscode=response.getStatusCode();
		Assert.assertEquals(statuscode, 200);
		
		//Validate the Time
		long timerequired=response.getTime();
		
		Assert.assertTrue(timerequired<2500);
		
		//To get the response in String format
		
		String responsebody=response.asPrettyString();
		String responsebody1=response.asString();
		System.out.println(responsebody);
		
		
		//Validate Json Response Body
		JsonPath js=new JsonPath(responsebody);
		String lastname=js.getString("first_name");
		Assert.assertEquals(lastname, "Michael");
		
	
	
	}
	
	
}
