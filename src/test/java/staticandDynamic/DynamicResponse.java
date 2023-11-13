package staticandDynamic;

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
		baseURI="http://rmgtestingserver";
		port=8084;
		String expected="TY_PROJ_23580";
		 Response resp = when().get("/projects");
		 
		 List<String> list=resp.jsonPath().get("projectId");
		 boolean flag=false;
		 for(String d:list)
		 {
			 if(expected.equalsIgnoreCase(d))
			 {
				 flag=true;
			 }
			 
		 }
		 Assert.assertTrue(flag);
		 System.out.println("data-verified");
		 resp.then().log().all();
	}
}
