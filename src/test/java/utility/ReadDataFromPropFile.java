package utility;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ReadDataFromPropFile {
	
	public static String readConfigData(String datatoberead) throws IOException
	{
		Properties prop = new Properties();
		
		String path = System.getProperty("user.dir")+"\\config.properties";
		
		FileInputStream fis = new FileInputStream(path);
		
		prop.load(fis);
		
		String value = prop.getProperty(datatoberead);
		
		System.out.println(value);
		
		return value;
		
		
	}
	
	
	public static void main(String[] args) throws IOException {
		
		Properties prop = new Properties();
		
		String path = System.getProperty("user.dir")+"\\config.properties";
		
		FileInputStream fis = new FileInputStream(path);
		
		prop.load(fis);
		
		String url = prop.getProperty("texttosearch");
		
		System.out.println(url);
		
		
		
		
	}

}
