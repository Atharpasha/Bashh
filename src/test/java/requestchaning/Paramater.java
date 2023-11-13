package requestchaning;

import static io.restassured.RestAssured.baseURI;
import static io.restassured.RestAssured.given;
import static io.restassured.RestAssured.port;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import generic.JavaGeneric;
import io.restassured.http.ContentType;

public class Paramater {
	@Test
	public void path()
	{
		baseURI="http://rmgtestingserver";
		port=8084;
		 given().pathParam("a","TY_PROJ_75905")
		.when()
		.get("/projects/{a}")
		 .then()
		 .log()
		 .all();
	}
	@Test
	public void query()
	{
		baseURI="https://reqres.in";
		
		 given().queryParam("page",3,"page",4)
		.when()
		.get("/api/users")
		 .then()
		 .log()
		 .all();
		 
		 
	}
}
