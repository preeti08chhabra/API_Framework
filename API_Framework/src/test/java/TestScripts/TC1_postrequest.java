package TestScripts;

import java.io.IOException;
import java.util.Properties;
import java.util.Scanner;

import org.testing.Helper.jsonparsingusingjsonpath;

import Testmethods.HTTP_methods;
import io.restassured.response.Response;
import utilities_package.json_filehandle;
import utilities_package.json_replacement;
import utilities_package.properties_Filehandle;
import utilities_package.random_number;

public class TC1_postrequest 
{
	static String returnidval;
	//static String returnfname;
	public void tc_post() throws IOException
{
	
	Properties pr= properties_Filehandle.loadproperties("../API_Framework/URI.properties");
	String postbody=json_filehandle.loadjson("../API_Framework/src/test/java/Testing/resources/requestdata.json");

	String idval=	random_number.generatenum();//to generate a random number
	postbody=json_replacement.repl_variable(postbody, "id", idval);
	
	System.out.println("Enter First Name");
	Scanner sn= new Scanner(System.in);
	String First_name=sn.next();
	postbody=json_replacement.repl_variable(postbody, "f_name", First_name);
	
	HTTP_methods http= new HTTP_methods(pr);
		String bodydata;
		Response res=http.postrequest("JAVAfolks", postbody);
		returnidval=jsonparsingusingjsonpath.jsonparse(res, "id");
		//returnfname=jsonparsingusingjsonpath.jsonparse(res, "f_name");
		
}
}
