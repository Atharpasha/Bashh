package Authentication;

import static io.restassured.RestAssured.given;

import org.testng.annotations.Test;

import io.restassured.response.Response;

public class Oauth2 {
	@Test 
	public void oauthAuth()
	{
		 Response resp = given()
		.formParam("client_id", "Online")
		.formParam("client_secret", "0ff6accb85f4fa8c96f2ddc14132bfe2")
		.formParam("grant_type", "client_credentials")
		.formParam("redirect_uri", "http://pasha.com")
		.formParam("code", "authorization_code")
		.when()
		.post("http://coop.apps.symfonycasts.com/token ");
	    String token=resp.jsonPath().get("access_token");
		System.out.println(token);
	 	given()
		.auth().oauth2(token)
		.when()
		.post("http://coop.apps.symfonycasts.com/api/4682/eggs-collect")
		.then().log().all();
		
	}
	@Test 
	public void oauthAuth1()
	{
		 Response resp = given()
		.formParam("client_id", "Online")
		.formParam("client_secret", "0ff6accb85f4fa8c96f2ddc14132bfe2")
		.formParam("grant_type", "client_credentials")
		.formParam("redirect_uri", "http://pasha.com")
		.formParam("code", "authorization_code")
		.when()
		.post("http://coop.apps.symfonycasts.com/token ");
	    String token=resp.jsonPath().get("access_token");
		System.out.println(token);
	 	given()
		.auth().oauth2(token)
		.when()
		.post("http://coop.apps.symfonycasts.com/api/4682/eggs-count")
		.then().log().all();
		
	}
	@Test 
	public void oauthAuth2()
	{
		 Response resp = given()
		.formParam("client_id", "Online")
		.formParam("client_secret", "0ff6accb85f4fa8c96f2ddc14132bfe2")
		.formParam("grant_type", "client_credentials")
		.formParam("redirect_uri", "http://pasha.com")
		.formParam("code", "authorization_code")
		.when()
		.post("http://coop.apps.symfonycasts.com/token ");
	    String token=resp.jsonPath().get("access_token");
		System.out.println(token);
	 	given()
		.auth().oauth2(token)
		.when()
		.post("http://coop.apps.symfonycasts.com/api/4682/chickens-feed")
		.then().log().all();
		
	}

@Test 
public void oauthAuth3()
{
	 Response resp = given()
	.formParam("client_id", "Online")
	.formParam("client_secret", "0ff6accb85f4fa8c96f2ddc14132bfe2")
	.formParam("grant_type", "client_credentials")
	.formParam("redirect_uri", "http://pasha.com")
	.formParam("code", "authorization_code")
	.when()
	.post("http://coop.apps.symfonycasts.com/token ");
    String token=resp.jsonPath().get("access_token");
	System.out.println(token);
 	given()
	.auth().oauth2(token)
	.when()
	.post("http://coop.apps.symfonycasts.com/api/4682/toiletseat-down")
	.then().log().all();
	
}
@Test 
public void oauthAuth4()
{
	 Response resp = given()
	.formParam("client_id", "Online")
	.formParam("client_secret", "0ff6accb85f4fa8c96f2ddc14132bfe2")
	.formParam("grant_type", "client_credentials")
	.formParam("redirect_uri", "http://pasha.com")
	.formParam("code", "authorization_code")
	.when()
	.post("http://coop.apps.symfonycasts.com/token ");
    String token=resp.jsonPath().get("access_token");
	System.out.println(token);
 	given()
	.auth().oauth2(token)
	.when()
	.post("http://coop.apps.symfonycasts.com/api/4682/barn-unlock")
	.then().log().all();
	
}

}
