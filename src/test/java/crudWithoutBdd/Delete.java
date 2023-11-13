package crudWithoutBdd;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class Delete {
	@Test
	 public void get()
	 {
		RequestSpecification rget = RestAssured.given();
		rget.contentType(ContentType.JSON);
		Response repse = rget.delete("http://rmgtestingserver:8084/projects/TY_PROJ_75284");
		repse.then().log().all();
		
	 }
}
