package generic;

public class ComplexSerializationPojo {
	//global variable
	String name;
	int[] num;
     int id;
     SerializationComplexPojoSpouse spouse;
	
	//constructor
	public ComplexSerializationPojo(String name,int[] num,int id,SerializationComplexPojoSpouse spouse)
	{
		this.name=name;
		this.num=num;
		this.id=id;
		this.spouse=spouse;
	}
	//trigger deserialization mainly
	public ComplexSerializationPojo()
	{
	
	}
	//public service
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int[] getNum() {
		return num;
	}
	public void setNum(int[] num) {
		this.num = num;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public SerializationComplexPojoSpouse getSpouse() {
		return spouse;
	}
	public void setSpouse(SerializationComplexPojoSpouse spouse) {
		this.spouse = spouse;
	}
	
}
