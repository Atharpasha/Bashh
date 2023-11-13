package crudWithBdd;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import generic.JavaGeneric;
import static io.restassured.RestAssured.*;
import io.restassured.http.ContentType;

public class CreateResource {

	
	@Test
	public void post()
	{
		baseURI="http://rmgtestingserver";
		port=8084;
		JavaGeneric jlib=new JavaGeneric();
		JSONObject jobj=new JSONObject();
		jobj.put("createdBy","pasha");
		jobj.put("projectName", "athar"+jlib);
		jobj.put( "status", "completed");
		jobj.put(  "teamSize", 0);
		
		//precondition
		
		 given()
		.body(jobj)
		.contentType(ContentType.JSON)
		
		//action
		.when()
		.post("/addProject")
		 
		 // validation
		 .then()
		 .assertThat()
		 .statusCode(201)
		 .contentType(ContentType.JSON)
		 .log()
		 .all();
		 
		 
	}
}
