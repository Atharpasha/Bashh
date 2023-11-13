package reqresWithBdd;

import static io.restassured.RestAssured.baseURI;
import static io.restassured.RestAssured.given;

import java.util.concurrent.TimeUnit;

import org.hamcrest.Matchers;
import org.testng.annotations.Test;
import generic.PojoWithBdd;
import io.restassured.http.ContentType;

public class CreateWithPojo {
	
	@Test
	public void post()
	{   
	
		baseURI="https://reqres.in/";
		
		PojoWithBdd pojo=new PojoWithBdd("pasha","tester");
	
		//precondition
		 given()
		.body(pojo)
		.contentType(ContentType.JSON)
		
		//action
		.when()
		.post("api/users")//http method and url
		 
		 // validation
		 .then()
		 .statusCode(201)
		 .assertThat()
		 .contentType(ContentType.JSON)
		 .time(Matchers.lessThan(300l),TimeUnit.SECONDS)
		 .log()
		 .all();
			
	} 
}
