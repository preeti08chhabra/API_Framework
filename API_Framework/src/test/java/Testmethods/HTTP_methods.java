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
public Response postrequest(String urikey, String bodydata)
{
	String urivalue= pr.getProperty(urikey);
	
	Response res=
	given()
	.contentType(ContentType.JSON)
	.body(bodydata)
	.when()
	.post(urivalue);
	System.out.println("Status Code  of Post is --" +res.statusCode());
	return res;
}
public Response getallrequest(String urikey)
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
	return res;
}
public Response getpartrequest(String urikey, String idval)
{
	String urivalue= pr.getProperty(urikey+"/"+idval);
	Response res=
			given()
			.contentType(ContentType.JSON)
			.when()
			.get(urivalue);
	System.out.println("Status code of Get Particular is--" +res.statusCode());
	System.out.println("Response data of Get Particular is");
	System.out.println(res.asString());
	return res;
}
public Response putrequest(String urikey, String bodydata, String idval)
{
	String urivalue= pr.getProperty(urikey)+"/"+idval;
	
	Response res=
	given()
	.contentType(ContentType.JSON)
	.body(bodydata)
	.when()
	.put(urivalue);
	System.out.println("Status Code  of PUT is --" +res.statusCode());
	System.out.println("After update response data is");
	System.out.println(res.asString());
	return res;
}
public Response delrequest(String urikey, String idval)
{
	String urivalue= pr.getProperty(urikey+"/"+idval);
	Response res=
			given()
			.contentType(ContentType.JSON)
			.when()
			.delete(urivalue);
	System.out.println("Status code of Deelete is--" +res.statusCode());
	return res;
}
/*public void getalldummy(String urikey)
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
}*/
}
