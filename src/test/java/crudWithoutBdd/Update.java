package crudWithoutBdd;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import generic.JavaGeneric;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class Update {
@Test
 public void put()
    {
JavaGeneric jlib=new JavaGeneric(); 
	
	JSONObject jobj=new JSONObject();
	jobj.put("createdBy", "king2");
	jobj.put("projectName", "Shopping"+jlib);		 
	jobj.put( "status", "inprogress");
	jobj.put( "teamSize",3);
	
	RequestSpecification rput = RestAssured.given();
	rput.body(jobj);
	rput.contentType(ContentType.JSON);
	Response repse = rput.put("http://rmgtestingserver:8084/projects/TY_PROJ_75352");
	System.out.println(repse.prettyPeek());
	//System.out.println(repse.prettyPrint());
	}
}
