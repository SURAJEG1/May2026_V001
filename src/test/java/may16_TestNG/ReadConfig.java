package may16_TestNG;

import java.io.FileInputStream;
import java.util.Properties;

public class ReadConfig {
	//create object for Properties class
	Properties properties;
	String filepath = "E:\\InfoEge Automation Project\\May2026_V001\\src\\main\\java\\globalPropertiesResources\\config.properties";
	
	
	//constructor
	public ReadConfig() 
	{
		try {
			properties = new Properties();
			FileInputStream fis = new FileInputStream(filepath);
			properties.load(fis);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	
	
	//create methods for browser and url key
	public String getBrowser() 
	{
		String value = properties.getProperty("browser");
		if(value!=null)
			return value;
		else
			throw new RuntimeException("browser is not spacified in config.properties file");
	}
	
	
	
	public String getBaseUrl() 
	{
		String value = properties.getProperty("baseUrl");
		if(value!=null)
			return value;
		else
			throw new RuntimeException("browser is not spacified in config.properties file");
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
