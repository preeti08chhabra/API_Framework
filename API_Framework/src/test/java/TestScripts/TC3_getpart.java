package TestScripts;

import java.io.IOException;
import java.util.Properties;

import org.test.responsevalidation.validateResponse;
import org.testng.annotations.Test;

import Testmethods.HTTP_methods;
import io.restassured.response.Response;
import utilities_package.properties_Filehandle;

public class TC3_getpart 
{
@Test	
public void getpart(String jsonpath) throws IOException
{
	Properties pr= properties_Filehandle.loadproperties("../API_Framework/URI.properties");
	HTTP_methods http= new HTTP_methods(pr);
	Response res=http.getpartrequest("JAVAfolks",TC1_postrequest.returnidval);
	validateResponse.validate_StatusCode(200, res);
	validateResponse.validate_ResponseData("Preeti", res, jsonpath);
}
}