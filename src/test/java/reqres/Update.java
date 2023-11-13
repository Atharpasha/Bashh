package reqres;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class Update {
	@Test
	 public void put()
	 { 
		
		JSONObject jobj=new JSONObject();
		jobj.put("name", "King2");
		jobj.put("job", "dev");		 
		
		RequestSpecification rpost = RestAssured.given();
		rpost.body(jobj);
		rpost.contentType(ContentType.JSON);
		Response repse = rpost.put("https://reqres.in/api/users/2");
		System.out.println(repse.prettyPeek());
	 }
}
