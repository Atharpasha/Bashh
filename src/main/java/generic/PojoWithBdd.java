package generic;

public class PojoWithBdd {
	
	//declare variabble globally 
	
	String name;
	String job;
	JavaGeneric jlib=new JavaGeneric();
	//contruuctor for initialization
	public  PojoWithBdd(String name, String job)
	{
		this.name=name+jlib.getRandom();
		this.job=job;
	}

	
	//getter and setter methods 
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}

	public String getJob() {
		return job;
	}

	public void setJob(String job) {
		this.job = job;
	}
	
	
}
