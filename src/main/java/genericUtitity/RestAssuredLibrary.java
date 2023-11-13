package genericUtitity;

import io.restassured.response.Response;

public class RestAssuredLibrary {
/**
 * @Athar
 * @param response
 * @param path
 * @return
 */
	public String getSonData(Response response,String path)
	{
		String jsonData=response.jsonPath().get(path);
		return jsonData;
	}
	
	
}
