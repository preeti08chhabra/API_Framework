package utilities_package;

import java.util.regex.Pattern;

public class json_replacement 
{
public static String repl_variable(String bodydata, String varname, String varvalue)

{
	bodydata= bodydata.replaceAll(Pattern.quote("{{" +varname+"}}"),varvalue);
	return bodydata;
}
}
