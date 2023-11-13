package ddt;

import static io.restassured.RestAssured.baseURI;
import static io.restassured.RestAssured.given;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;
import org.testng.annotations.Test;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
public class JsonFormat {
@Test
public void a() throws IOException
  {
	baseURI="https://reqres.in/";
	Response res = given().contentType(ContentType.JSON).when().get("/api/users/2");
	res.then().log().all();
	String s=res.getBody().asString();
	FileWriter file=new FileWriter("C:\\Users\\Athar\\eclipse-workspace\\RestAssured\\Response.json");
	file.write(s);
	file.close();
  }
@Test
public void b() throws JsonGenerationException, JsonMappingException, IOException
{
	ObjectMapper omap=new ObjectMapper() ;
	baseURI="https://reqres.in/";
	Response res = given().contentType(ContentType.JSON).when().get("/api/users/2");
	res.then().log().all();
	String s=res.getBody().asString();
	omap.writeValue(new File("C:\\Users\\Athar\\eclipse-workspace\\RestAssured\\Response.json"), s);
}

}
