import java.io.File;
import java.io.IOException;

import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;
import org.testng.annotations.Test;

import generic.ComplexSerializationPojo;
import generic.SerializationComplexPojoSpouse;

public class complexClass {
	@Test
	public void serial() throws JsonGenerationException, JsonMappingException, IOException
	{
	
	int[] sphone= {1235,9876};
	SerializationComplexPojoSpouse spouse=new SerializationComplexPojoSpouse("queen",sphone,03);
	int [] phone= {9876,54321};
	ComplexSerializationPojo emp=new ComplexSerializationPojo("athar",phone,04,spouse);
	ObjectMapper omap=new ObjectMapper() ;
	omap.writerWithDefaultPrettyPrinter().writeValue(new File("C:\\Users\\Athar\\eclipse-workspace\\RestAssured\\ATHAR.json"),emp);
	}
}
