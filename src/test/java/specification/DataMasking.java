package specification;

import org.hamcrest.Matchers;
import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.config.LogConfig;
import io.restassured.http.ContentType;

import static io.restassured.RestAssured.*;

import java.util.List;
import java.util.Map;

public class DataMasking {
	@Test
	public void dataMasking()
	{

 JSONObject jobj=new JSONObject();
 jobj.put("createdBy","Athar");
 jobj.put("projectName","king");
 jobj.put("status","done");
 jobj.put("teamSize",5);
 
 given().config(RestAssured.config.logConfig(LogConfig.logConfig().blacklistHeader("Connection")))
 .body(jobj)
 .contentType(ContentType.JSON)
 .log().all()
 .when().post("http://rmgtestingserver:8084/addProject")
 .then()
 .assertThat().log().all();
 
	}
	
	
	@Test
	public void arrayObject()
	{
		baseURI="http://rmgtestingserver";
		port=8084;
		when().get("/projects/TY_PROJ_76305")
		.then().assertThat().body("", Matchers.instanceOf(Map.class)).log().all();
		
	}
	@Test
	public void listObject()
	{
		baseURI="http://rmgtestingserver";
		port=8084;
		when().get("/projects")
		.then().assertThat().body("", Matchers.instanceOf(List.class)).log().all();
		
	}
	
}
