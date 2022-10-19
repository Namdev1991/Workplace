package httpRequest;

import static io.restassured.RestAssured.given;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;

public class PostwithcodeOptimisation {
	
	//https://reqres.in/api/users
	@Test
	public void Post() {
		RestAssured.baseURI="https://reqres.in";
		String username="Namdev";
		String Job="QA Engineer";
		
	Response response=given().header("Content-Type","application/json").body("{\r\n" + 
			"    \"name\": \""+ username +"\",\r\n" + 
			"    \"job\": \"" + Job + "\"\r\n" + 
			"}").when().post("api/users").then().log().all().assertThat().statusCode(201).
			extract().response();
		
		String job=response.asPrettyString();
		
		
		JsonPath js=new JsonPath(job);
		String Position=js.getString("job");
		Assert.assertEquals(Position, "QA Engineer");
		
		
	}
}
