package com.learn.utilities;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserFactory {
	
	public static WebDriver startApplication(WebDriver driver,String browserName,String appURL)
	{
		if(browserName.equals("chrome"))
		{
			System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\bpanchal\\\\Downloads\\\\chromedriver_win32\\\\chromedriver.exe");
			 driver=new ChromeDriver();
		}
		else if(browserName.equals("Firefox"))
		{
			
		}
		else if(browserName.equals("edge"))
		{
			
		}
		else
		{
			System.out.println("this browser is not supported");
		}
		
		driver.manage().window().maximize();
		driver.get(appURL);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		return driver;
		
	}
	
	public static void quitBrowser(WebDriver driver)
	{
		driver.close();
	}

}
