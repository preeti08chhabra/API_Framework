
package org.SoftAssertion;

public class SoftAsseration 
{
public static void assertion_code(int expted, int actual)
{
	if(expted==actual)
	{
		System.out.println("Status code is matching");
	
	}
	else
	{
		System.out.println("Status code is not matching");
	}
}
public static void assertion_data(String expted, String actual)
{
	if(expted.equals(actual))
	{
		System.out.println("Data is matching");
	
	}
	else
	{
		System.out.println("Data is not matching");
	}
}
}
