package Testmethods;

import java.util.Properties;

import io.restassured.http.ContentType;
import io.restassured.response.Response;

import static io.restassured.RestAssured.*;
import utilities_package.properties_Filehandle;

public class HTTP_methods 
{
	Properties pr;
public HTTP_methods(Properties pr)
{
	this.pr=pr;
}
public void postrequest(String urikey, String bodydata)
{
	String urivalue= pr.getProperty(urikey);
	
	Response res=
	given()
	.contentType(ContentType.JSON)
	.body(bodydata)
	.when()
	.post(urivalue);
	System.out.println("Status Code  of Post is --" +res.statusCode());
}
public void getallrequest(String urikey)
{
	String urivalue= pr.getProperty(urikey);
	Response res=
			given()
			.contentType(ContentType.JSON)
			.when()
			.get(urivalue);
	System.out.println("Status code of Get is--" +res.statusCode());
	System.out.println("Response data is");
	System.out.println(res.asString());
}
public void getpartrequest(String urikey)
{
	String urivalue= pr.getProperty(urikey);
	Response res=
			given()
			.contentType(ContentType.JSON)
			.when()
			.get(urivalue);
	System.out.println("Status code is--" +res.statusCode());
	System.out.println("Response data is");
	System.out.println(res.asString());
}
}
