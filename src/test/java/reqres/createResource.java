package reqres;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class createResource {
	@Test
	 public void post()
	 { 
		JSONObject jobj=new JSONObject();
		jobj.put("name", "King");
		jobj.put("job", "tester");
		RequestSpecification rpost = RestAssured.given();
		rpost.body(jobj);
		rpost.contentType(ContentType.JSON);
		Response repse = rpost.post("https://reqres.in/api/users");
		System.out.println(repse.prettyPeek());
	 }
}
