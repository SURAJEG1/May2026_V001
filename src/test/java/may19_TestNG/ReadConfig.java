package may19_TestNG;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ReadConfig {

	Properties properties;
	String filepath = "E:\\InfoEge Automation Project\\May2026_V001\\src\\main\\java\\globalPropertiesResources\\config.properties";
	
	public ReadConfig() 
	{
		try {
			properties = new Properties();
			FileInputStream fis = new FileInputStream(filepath);
			properties.load(fis);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	
	public String getBrowser() 
	{
		String value = properties.getProperty("browser");
		if(value!=null)
			return value;
		else
			throw new RuntimeException("browser is not spacified in config.properties file");
	}
	
	public String getAmazonUrl() 
	{
		String value = properties.getProperty("amazonUrl");
		if(value!=null)
			return value;
		else
			throw new RuntimeException("amazonUrl is not spacified in config.properties file");
	}
	
	
	public String getFacebookUrl() 
	{
		String value = properties.getProperty("facebookUrl");
		if(value!=null)
			return value;
		else
			throw new RuntimeException("facebookUrl is not spacified in config.properties file");
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
