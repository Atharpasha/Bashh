package reqresWithBdd;

import static io.restassured.RestAssured.baseURI;
import static io.restassured.RestAssured.given;

import java.util.HashMap;
import java.util.concurrent.TimeUnit;

import org.hamcrest.Matchers;
import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;

public class CreateWithMap {
	@Test
	public void post()
	{
		baseURI="https://reqres.in/";
		HashMap<String,String> map=new HashMap<String, String>();
		map.put("name","pasha");
		map.put("job", "tester");
		
		
		//precondition
		
		 given()
		.body(map)
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
