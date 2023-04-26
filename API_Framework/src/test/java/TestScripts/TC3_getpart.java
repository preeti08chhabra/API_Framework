package TestScripts;

import java.io.IOException;
import java.util.Properties;

import Testmethods.HTTP_methods;
import utilities_package.properties_Filehandle;

public class TC3_getpart 
{
public void getpart() throws IOException
{
	Properties pr= properties_Filehandle.loadproperties("../API_Framework/URI.properties");
	HTTP_methods http= new HTTP_methods(pr);
	http.getpartrequest("JAVAfolks",TC1_postrequest.returnidval);
}
}