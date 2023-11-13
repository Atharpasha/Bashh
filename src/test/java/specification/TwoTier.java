package specification;

import static io.restassured.RestAssured.given;

import java.sql.SQLException;

import org.testng.Assert;
import org.testng.annotations.Test;

import generic.PojoTwoTier;
import genericUtitity.BaseClass;
import genericUtitity.EndPointLibrary;
import io.restassured.response.Response;

public class TwoTier extends BaseClass {
	
@Test	
public void twoTier () throws SQLException
{
	
	//create data
	PojoTwoTier createproject=new PojoTwoTier("athar","google","completed",4);
	
	//get response
	Response response = given().spec(req).body(createproject)
	.when().post(EndPointLibrary.CreateProject);
	
	//capture prject id
	String expdata = rlib.getSonData(response, "projectId");
	System.out.println(expdata);
	//valoidate in database
	
	String actdata = dlib.executeAndGet("select * from project;", 1, expdata);
	Assert.assertEquals(actdata, expdata);
	System.out.println("TC PASSED");
	response.then().log().all();
	
	
}
	

}
