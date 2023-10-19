package TestScripts;

import java.util.Properties;

import Testmethods.HTTP_methods;
import utilities_package.json_filehandle;
import utilities_package.properties_Filehandle;

public class TC6_GetallDummy 
{
	int urikeys;
	public int countjson()
	{
		urikeys=json_filehandle.countURI("/API_Framework/URI.json");
		return urikeys;
	}
	
	public void fetchjson()
	{
		 for(int i=1;i<=urikeys;i=i+1)
		 {
		  String uriValue=json_filehandle.fetchURIvalue("URI"+1, "/API_Framework/URI.json");

		  }

	}
	public void tc_getdummy()
	{
	String getbody=json_filehandle.loadjson("/API_Framework/URI.json");
	HTTP_methods http = new HTTP_methods(null);
	http.getalldummy(getbody);
	}
}
