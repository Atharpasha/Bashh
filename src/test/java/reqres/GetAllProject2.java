package reqres;

import org.testng.annotations.Test;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class GetAllProject2 {
	@Test
	 public void get()
	 { 
		RequestSpecification rpost = RestAssured.given();
		rpost.contentType(ContentType.JSON);
		Response repse = rpost.get("https://reqres.in/api/users");
		repse.then().log().all();
	 }
}
