import java.io.File;
import java.io.IOException;

import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;
import org.testng.annotations.Test;

import generic.Deserialization;

public class DeSerializa {

	@Test
	public void deSerial() throws JsonGenerationException, JsonMappingException, IOException
	{
	ObjectMapper omap=new ObjectMapper() ;
	Deserialization data = omap.readValue(new File("C:\\Users\\Athar\\eclipse-workspace\\RestAssured\\ATHAR.json"),Deserialization.class);
	System.out.println(data.getName());
	System.out.println(data.getNum());
	System.out.println(data.getId());
	
	}
}
 