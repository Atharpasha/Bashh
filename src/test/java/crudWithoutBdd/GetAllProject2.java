package crudWithoutBdd;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class GetAllProject2 {
	@Test
	 public void get()
	 {
		RequestSpecification rget = RestAssured.given();
		rget.contentType(ContentType.JSON);
		Response repse = rget.get("http://rmgtestingserver:8084/projects");
		repse.then().log().all();
		int status=repse.getStatusCode();
		Assert.assertEquals(200,status);
		System.out.println("status is valid");
	
	 }
}
