import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.http.Headers;
import io.restassured.response.Response;

import static io.restassured.RestAssured.*;

public class HeaderValidation {

	@Test
	public void headerValidation()
	{
		baseURI="http://rmgtestingserver/";
		port=8084;
		
		String exp_statusline="HTTP/1.1 200 ";
		String exp_vary="Access-Control-Request-Headers";
		String xpe_ContentType="application/json";
		String exp_Pragma="no-cache";
		String exp_Connection="keep-alive";
		
		
		Response response = when().get("projects/TY_PROJ_75453");
		String statusline = response.statusLine();
		System.out.println(statusline);
		Assert.assertEquals(statusline, exp_statusline);
		
		Headers header = response.getHeaders();
		System.out.println(header);
		
		String act_content_type = response.getHeader("Content-Type");
		Assert.assertEquals(act_content_type,xpe_ContentType);
		
		String act_pragma = response.getHeader("Pragma");
		Assert.assertEquals(act_pragma,exp_Pragma);
		
		String act_connection = response.getHeader("Connection");
		Assert.assertEquals(act_connection,exp_Connection);
	}
}
