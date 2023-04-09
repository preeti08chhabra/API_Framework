package utilities_package;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class properties_Filehandle 
{
public static Properties loadproperties(String filepath ) throws IOException
									//input parameter file path
{
	File f = new File(filepath);
	FileReader fr= new FileReader(f);
	Properties p= new Properties(); // inbuilt method
	p.load(fr); // create a reader object load
	return p;
	
	
}
}
