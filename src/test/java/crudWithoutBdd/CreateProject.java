package crudWithoutBdd;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import generic.JavaGeneric;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class CreateProject {
@Test
 public void post()
 {
	JavaGeneric jlib=new JavaGeneric(); 
	
	JSONObject jobj=new JSONObject();
	jobj.put("createdBy", "King");
	jobj.put("projectName", "Shopping"+jlib);		 
	jobj.put( "status", "completed");
	jobj.put( "teamSize",3);
	
	RequestSpecification rpost = RestAssured.given();
	rpost.body(jobj);
	rpost.contentType(ContentType.JSON);
	Response repse = rpost.post("http://rmgtestingserver:8084/addProject");
	System.out.println(repse.prettyPeek());
	//System.out.println(repse.prettyPrint());
//    Response resp = RestAssured.get("http://rmgtestingserver:8084/projects");
//	resp.then().log().all();
 }
}
