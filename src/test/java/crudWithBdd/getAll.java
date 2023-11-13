package crudWithBdd;

import static io.restassured.RestAssured.baseURI;
import static io.restassured.RestAssured.port;
import static io.restassured.RestAssured.when;

import org.testng.annotations.Test;

import io.restassured.http.ContentType;

public class getAll {
	@Test
	public void get()
	{
		baseURI="http://rmgtestingserver";
		port=8084;
		
		//precondition
		
		
		//action
		 when()
		.get("/projects/TY_PROJ_75453")
		 
		 // validation
		 .then()
		// .assertThat()
		 .statusCode(200)
		 .contentType(ContentType.JSON)
		 .log()
		 .all();
		 
		 
	}
}
