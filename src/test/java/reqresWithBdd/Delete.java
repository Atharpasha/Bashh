package reqresWithBdd;

import static io.restassured.RestAssured.*;


import org.testng.annotations.Test;



public class Delete {
	@Test
	public void delete()
	{
		baseURI="https://reqres.in/";
		//precondition
		
		//action
		when()
		.delete("/api/users/2")
		 
		 // validation
		 .then()
		 .statusCode(204)
		 .assertThat()
		 .log()
		 .all();
	} 
}
