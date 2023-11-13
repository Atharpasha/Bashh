package reqresWithBdd;

import static io.restassured.RestAssured.*;


import java.util.concurrent.TimeUnit;

import org.hamcrest.Matchers;
import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;


public class CreateWithJsonObj {

	@Test
	public void post()
	{
		baseURI="https://reqres.in/";
		JSONObject jobj=new JSONObject();
		jobj.put("name","pasha");
		jobj.put("job", "tester");
		
		
		//precondition
		
		 given()
		.body(jobj)
		.contentType(ContentType.JSON)
		
		//action
		.when()
		.post("api/users")//http method and url
		 
		 // validation
		 .then()
		 .statusCode(202)
		 .assertThat()
		 .contentType(ContentType.JSON)
		 .time(Matchers.lessThan(300l),TimeUnit.SECONDS)
		 .log()
		 .all();
			
	} 
}
