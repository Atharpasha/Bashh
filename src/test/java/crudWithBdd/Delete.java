package crudWithBdd;

import static io.restassured.RestAssured.baseURI;
import static io.restassured.RestAssured.port;
import static io.restassured.RestAssured.when;

import org.testng.annotations.Test;

import io.restassured.http.ContentType;

public class Delete {
	@Test
	public void delete()
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
		 .statusCode(204)
		 .log()
		 .all();
		 
		 
	}
}
