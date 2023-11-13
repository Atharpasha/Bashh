package specification;

import generic.CreateProjectSpec;
import static io.restassured.RestAssured.*;

import org.testng.annotations.Test;

import io.restassured.builder.RequestSpecBuilder;
import io.restassured.builder.ResponseSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.specification.RequestSpecification;
import io.restassured.specification.ResponseSpecification;
 

public class Specificatio {
	@Test
	public void spec() 
	{
		CreateProjectSpec cp=new CreateProjectSpec("Athar", "tyss", "in progress", 5);

		RequestSpecification req=new RequestSpecBuilder()
				.setBaseUri("http://rmgtestingserver:8084")
				.setContentType(ContentType.JSON).build();
		
		ResponseSpecification res = new ResponseSpecBuilder()
		    .expectContentType(ContentType.JSON)
		     .expectStatusCode(201).build();
		
		given().spec(req).body(cp)
		.when().post("/addProject")
		.then().spec(res).log().all();
		

	}
} 