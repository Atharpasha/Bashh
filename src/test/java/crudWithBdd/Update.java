package crudWithBdd;

import static io.restassured.RestAssured.baseURI;
import static io.restassured.RestAssured.given;
import static io.restassured.RestAssured.port;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import generic.JavaGeneric;
import io.restassured.http.ContentType;

public class Update {
	@Test
	public void post()
	{
		baseURI="http://rmgtestingserver";
		port=8084;
		JavaGeneric jlib=new JavaGeneric();
		JSONObject jobj=new JSONObject();
		jobj.put("createdBy","athar");
		jobj.put("projectName", "pasha"+jlib);
		jobj.put( "status", "inprogress");
		jobj.put(  "teamSize", 5);
		
		//precondition
		
		 given()
		.body(jobj)
		.contentType(ContentType.JSON)
		
		//action
		.when()
		.put("/projects/TY_PROJ_75453")
		 
		 // validation
		 .then()
		// .assertThat()
		 .statusCode(200)
		 .contentType(ContentType.JSON)
		 .log()
		 .all();
		 
		 
	}
}
