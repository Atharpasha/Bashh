package generic;

import java.util.Random;

public class JavaGeneric {
	public int getRandom()
	{
		Random random=new Random();
		int ran=random.nextInt(500);
		return ran;
	}
}
