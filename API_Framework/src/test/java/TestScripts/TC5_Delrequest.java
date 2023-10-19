package TestScripts;

import java.io.IOException;
import java.util.Properties;

import Testmethods.HTTP_methods;
import utilities_package.properties_Filehandle;

public class TC5_Delrequest 

{
	public void delete() throws IOException
	{
		Properties pr= properties_Filehandle.loadproperties("../API_Framework/URI.properties");
		HTTP_methods http= new HTTP_methods(pr);
		http.delrequest("JAVAfolks",TC1_postrequest.returnidval);
	}
}
