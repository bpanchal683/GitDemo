package com.learn.utilities;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ConfigDataProvider {
	
	Properties prop;

	public ConfigDataProvider() {
		
		File src=new File("./Config/Config.properties");
		
		 try {
			 FileInputStream fis=new FileInputStream(src);
				
			 prop=new Properties();
			prop.load(fis);
		} catch (IOException e) {
			System.out.println("this file is not reachable");
		}
	}
	
	//creating methods
	
	public String getBrowser()
	{
		return prop.getProperty("Browser");
	}
	
	public String getStagingUrl()
	{
		return prop.getProperty("aqUrl");
	}
	

}
