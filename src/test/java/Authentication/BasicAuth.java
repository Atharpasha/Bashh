package Authentication;

import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;

public class BasicAuth {
	@Test
	public void basicAuth()
	{
		baseURI="http://rmgtestingserver";
		port=8084;
		given()
		.auth().basic("rmgyantra","rmgy@9999")
		.when().get("/login")
		.then().statusCode(202).log().all();
	}
	@Test
	public void digestiveAuth()
	{
		baseURI="http://rmgtestingserver";
		port=8084;
		given()
		.auth().digest("rmgyantra","rmgy@9999")
		.when().get("/login")
		.then().statusCode(202).log().all();
	}
	@Test
	public void preemptAuth()
	{
		baseURI="http://rmgtestingserver";
		port=8084;
		given()
		.auth().preemptive().basic("rmgyantra","rmgy@9999")
		.when().get("/login")
		.then().statusCode(202).log().all();
	}
}
