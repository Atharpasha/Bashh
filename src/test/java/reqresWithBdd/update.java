package reqresWithBdd;

import static io.restassured.RestAssured.baseURI;
import static io.restassured.RestAssured.given;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import generic.JavaGeneric;
import io.restassured.http.ContentType;

public class update {

	@Test
	public void post()
	{
		baseURI="https://reqres.in/";
		
		JavaGeneric jlib=new JavaGeneric();
		JSONObject jobj=new JSONObject();
		jobj.put("name","athar");
		jobj.put("job", "tester"+jlib);
		
		
		//precondition
		
		 given()
		.body(jobj)
		.contentType(ContentType.JSON)
		
		//action
		.when()
		.put("/api/users/2")
		 
		 // validation
		 .then()
		 .assertThat()
		 .statusCode(200)
		 .contentType(ContentType.JSON)
		 .log()
		 .all();
	} 
}
