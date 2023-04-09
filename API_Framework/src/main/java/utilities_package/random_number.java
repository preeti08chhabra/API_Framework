package utilities_package;

import java.util.Random;

public class random_number
{

	public static String generatenum()
	{
		Random r= new Random();//random is a class
		Integer i = r.nextInt();//int value will be generated
		return i.toString();
		
	}
}
