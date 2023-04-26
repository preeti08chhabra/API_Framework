package TestScripts;

import java.io.IOException;
import java.util.Properties;

import Testmethods.HTTP_methods;
import utilities_package.json_filehandle;
import utilities_package.json_replacement;
import utilities_package.properties_Filehandle;

public class TC4_putrequest 
{
	public void putrequest() throws IOException
	{

	Properties pr= properties_Filehandle.loadproperties("../API_Framework/URI.properties");
	String postbody=json_filehandle.loadjson("../API_Framework/src/test/java/Testing/resources/putrequest.json");
	postbody=json_replacement.repl_variable(postbody, "id", TC1_postrequest.returnidval);
	//postbody=json_replacement.repl_variable(postbody, "First_name", TC1_postrequest.returnfname);
	HTTP_methods http= new HTTP_methods(pr);
	http.putrequest("JAVAfolks", postbody, TC1_postrequest.returnidval);
	//http.putrequest("JAVAfolks", postbody, TC1_postrequest.returnfname);
	
	}
	
}
