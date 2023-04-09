package utilities_package;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

import org.json.JSONObject;
import org.json.JSONTokener;

// purpose--- to laod Json data
//input parameter ----file path
//output parameter----string json data
public class json_filehandle 
{
	public static String loadjson(String filepath) throws FileNotFoundException
	{
		File f= new File(filepath);
		FileReader fr = new FileReader(f);
		JSONTokener js = new JSONTokener(fr);
		JSONObject jo= new JSONObject(js);
		return jo.toString();
	}

}
