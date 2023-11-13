package reqresWithBdd;

import static io.restassured.RestAssured.baseURI;
import static io.restassured.RestAssured.given;

import java.io.File;
import java.util.HashMap;
import java.util.concurrent.TimeUnit;

import org.hamcrest.Matchers;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;

public class CreateWithFile {
	@Test
	public void post()
	{
		baseURI="https://reqres.in/";
		File file=new File("C:\\Users\\Athar\\eclipse-workspace\\RestAssured\\jsonFile.json");
		
		
		//precondition
		
		 given()
		.body(file)
		.contentType(ContentType.JSON)
		
		//action
		.when()
		.post("api/users")//http method and url
		 
		 // validation
		 .then()
		 .statusCode(201)
		 .assertThat()
		 .contentType(ContentType.JSON)
		 .time(Matchers.lessThan(3000l),TimeUnit.MILLISECONDS)
		 .log()
		 .all();
			
	} 
}
