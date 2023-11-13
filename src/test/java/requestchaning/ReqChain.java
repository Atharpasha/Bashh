package requestchaning;

import static io.restassured.RestAssured.*;

import java.util.concurrent.TimeUnit;
import org.hamcrest.Matchers;
import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import generic.JavaGeneric;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;


public class ReqChain {

	@Test
	public void post() throws InterruptedException
	{
	
	JavaGeneric jlib=new JavaGeneric();
	
	JSONObject jobj=new JSONObject();
	jobj.put("createdBy","pasha");
	jobj.put("projectName", "athar"+jlib);
	jobj.put( "status", "completed");
	jobj.put(  "teamSize", 0);
	
	baseURI="http://rmgtestingserver";
	port=8084;
		
	 Response rep = given().body(jobj).contentType(ContentType.JSON).when().post("/addProject");
		
    String res=rep.jsonPath().get("projectId");
    System.out.println(res);
    rep.then().log().all();
   given().pathParam("s", res)
    .when().get("/projects/{s}")
    .then().log().all();
    
   
			
	} 
	@Test
	public void pos() throws InterruptedException
	{
	
	JavaGeneric jlib=new JavaGeneric();
	
	JSONObject jobj=new JSONObject();
	jobj.put("createdBy","pasha");
	jobj.put("projectName", "athar"+jlib);
	jobj.put( "status", "completed");
	jobj.put(  "teamSize", 0);
	
	baseURI="http://rmgtestingserver";
	port=8084;
		
	given()
	.body(jobj)
	.contentType(ContentType.JSON);
	Response r = when()
	.post("/addProject");
    String res=r.jsonPath().get("projectId");
    System.out.println(res);
    r.then().log().all();
    given().pathParam("s", res)
    .when().get("/projects/{s}")
    .then().log().all();
    
   
			
	} 
}
