package Authentication;

import static io.restassured.RestAssured.baseURI;
import static io.restassured.RestAssured.given;
import static io.restassured.RestAssured.port;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;

public class Oauth {

	@Test
	public void oauthAuth()
	{
		baseURI="https://api.github.com";
		JSONObject jobj=new JSONObject();
		jobj.put("name","Oauth");
		jobj.put("description","demo");//create repo
		given().auth().oauth2("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").body(jobj).contentType(ContentType.JSON)
		.when().post("/user/repos")
		.then().log().all();
	}
}
