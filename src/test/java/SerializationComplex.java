import java.io.File;
import java.io.IOException;

import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;
import org.testng.annotations.Test;

import generic.ComplexSerializationPojo;
import generic.ComplexSerializationPojo1;
import generic.Serialization;
import generic.SerializationComplexPojoSpouse;

public class SerializationComplex {

	@Test
	public void serial() throws JsonGenerationException, JsonMappingException, IOException
	{
		ObjectMapper omap=new ObjectMapper() ;
		int[] phone= {1235,9876};
		ComplexSerializationPojo1 pobj=new ComplexSerializationPojo1("pasha",phone,02);
	
	omap.writeValue(new File("C:\\Users\\Athar\\eclipse-workspace\\RestAssured\\ATHAR.json"), pobj);
	}
	
}
