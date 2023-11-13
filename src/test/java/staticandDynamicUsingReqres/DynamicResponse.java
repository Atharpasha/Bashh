package staticandDynamicUsingReqres;

import static io.restassured.RestAssured.baseURI;
import static io.restassured.RestAssured.port;
import static io.restassured.RestAssured.when;

import java.util.ArrayList;
import java.util.List;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.response.Response;

public class DynamicResponse {

	@Test
	public void get()
	{
		baseURI="https://reqres.in";
		
		int expected=7;
		 Response resp = when().get("/api/users?page=2");
		 
		 List<Integer> list=resp.jsonPath().get("data.id");
		 boolean flag=false;
		 for(Integer d:list)
		 {
			 if(expected==d)
			 {
				 flag=true;
			 }
			 
		 }
		 Assert.assertTrue(flag);
		 System.out.println("data-verified");
		 resp.then().log().all();
	}
	
}
