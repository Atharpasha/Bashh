package genericUtitity;

import java.sql.SQLException;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import static io.restassured.RestAssured.*;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.builder.ResponseSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.specification.RequestSpecification;
import io.restassured.specification.ResponseSpecification;

public class BaseClass {

	public DataBaseAPI dlib=new DataBaseAPI();
	public JavaUtility jlib=new JavaUtility();
	public RestAssuredLibrary rlib=new RestAssuredLibrary();
	public RequestSpecification req;
	public ResponseSpecification resp;
	
	@BeforeSuite
	public void beforeSuiteConfig() throws SQLException
	{
		 dlib.connectToDatabase();
		 req = new RequestSpecBuilder()
		.setBaseUri("http://rmgtestingserver:8084")
		.setContentType(ContentType.JSON).build();
		
		 resp = new ResponseSpecBuilder()
		.expectContentType(ContentType.JSON)
		.build();
		
	}
	
	@AfterSuite
	public void afterSuiteConfig() throws SQLException
	{
		dlib.closeDb();	
	}
	
	
}
