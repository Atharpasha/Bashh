package staticandDynamic;

import static io.restassured.RestAssured.*;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.response.Response;


public class StaticResponseBody {
	@Test
	public void get()
	{
		baseURI="https://reqres.in";
		port=8084;
		String expected="7";
		 Response resp = when().get("/api/users?page=2");
		 
		 String actual=resp.jsonPath().get("data[0].id");
		 Assert.assertEquals(actual, expected);
		 System.out.println("verified");
		 resp.then().log().all();
		 
				
	
		
	} 

}
