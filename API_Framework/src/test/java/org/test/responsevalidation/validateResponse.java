package org.test.responsevalidation;

import static org.testng.Assert.assertEquals;

import org.SoftAssertion.SoftAsseration;
import org.testing.Helper.jsonparsingusingjsonpath;
import org.testng.Assert;

import io.restassured.response.Response;

public class validateResponse 
{
public static void validate_StatusCode(int exptcode, Response res)
{
	Assert.assertEquals(res.statusCode(),exptcode,"Status code is not matching"); //hard assertion
	//SoftAsseration.assertion_code(exptcode, res.statusCode());
}
public static void validate_ResponseData(String exptData, Response res, String jsonpath)
{
	String actual=jsonparsingusingjsonpath.jsonparse(res, jsonpath);
	Assert.assertEquals(actual,exptData,"Response data is not matched");
	//SoftAsseration.assertion_data(exptData, actual);
}
}
