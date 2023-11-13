package reqresWithBdd;

import static io.restassured.RestAssured.*;

import org.testng.annotations.Test;

import io.restassured.http.ContentType;

public class getAll {
	@Test
	public void post()
	{
		baseURI="https://reqres.in/";
		//precondition
		
		//action
		when()
		.get("/api/users?page=2")
		 
		 // validation
		 .then()
		 .assertThat()
		 .statusCode(200)
		 .contentType(ContentType.JSON)
		 .log()
		 .all();
	} 
}
