import static io.restassured.RestAssured.given;
import static io.restassured.RestAssured.when;

import java.io.File;

import org.testng.annotations.Test;

import io.restassured.http.ContentType;
import io.restassured.module.jsv.JsonSchemaValidator;
import io.restassured.response.Response;
public class JsonSchemaValidatorr {
	
	@Test
	public void schemaGet()  
	{
		
		Response res = given().auth().oauth2("333").contentType(ContentType.JSON).when().get("https://reqres.in/api/users?page=2");
		//System.out.println(res.getBody().asPrettyString());
//	        Headers h = res.getHeaders();
//	        
//	        for(Header hh:h)
//	        {
//	        	System.out.println(hh.getName()+"   "+hh.getValue());
//	        }
		
		//res.then().log().all();
	}            
	@Test
	public void schema()
	{
		File file=new File("C:\\Users\\Athar\\eclipse-workspace\\RestAssured\\Schema.json");
		when().get("https://reqres.in/api/users?page=2")
		.then().assertThat()
		.body(JsonSchemaValidator.matchesJsonSchema(file))
		.log().all();
	}
}