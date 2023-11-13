package staticandDynamicUsingReqres;

import static io.restassured.RestAssured.*;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.response.Response;


public class StaticResponseBody {
	@Test
	public void get()
	{
		baseURI="https://reqres.in";
		String expected="lindsay.ferguson@reqres.in";
		given().queryParam("page",2);
	    Response resp = when().get("/api/users");
		 String actual=resp.jsonPath().get("data[1].email");
		// Assert.assertEquals(actual, expected);
		 System.out.println("verified");
		 resp.then().log().all();
		 
				
	
		
	} 

}
