package reqres;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class DeleteResource {
	@Test
	 public void get()
	 { 
		RequestSpecification rpost = RestAssured.given();
		rpost.contentType(ContentType.JSON);
		Response repse = rpost.delete("https://reqres.in/api/users/7");
		repse.then().log().all();
	 }
}
