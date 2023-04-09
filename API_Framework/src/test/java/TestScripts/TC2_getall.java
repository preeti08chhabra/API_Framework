package TestScripts;

import java.io.IOException;
import java.util.Properties;

import org.json.HTTP;

import Testmethods.HTTP_methods;
import utilities_package.properties_Filehandle;

public class TC2_getall
{
	public void tc_getall() throws IOException
	{
		Properties pr= properties_Filehandle.loadproperties("../API_Framework/URI.properties");
				HTTP_methods http = new HTTP_methods(pr);
				http.getallrequest("JAVAfolks");
	}
}

