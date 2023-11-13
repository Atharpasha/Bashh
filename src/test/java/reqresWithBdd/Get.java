package reqresWithBdd;

import static io.restassured.RestAssured.baseURI;

import static io.restassured.RestAssured.when;

import org.testng.annotations.Test;

import io.restassured.http.ContentType;

public class Get {
	@Test
	public void post()
	{
		baseURI="https://reqres.in/";
		//precondition
		
		//action
		when()
		.get("api/users/444")
		 
		 // validation
		 .then()
		 .assertThat()
		 .statusCode(200)
		 .contentType(ContentType.JSON)
		 .log()
		 .all();
	} 
}
