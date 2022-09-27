package com.learn.utilities;

import java.io.File;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import com.learn.pages.BaseClass;

public class ScreenshotClass {

	
	public static void getScreenshot(WebDriver driver) 
	{
		
		File file=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		try {
			FileUtils.copyFile(file,new File("./Screenshots/"+getCurrentDateTime()+".png"));
			System.out.println("Screenshot captured successfully");
			
		} catch (IOException e) {
			System.out.println("Unable to capture screenshot"+e.getMessage());
		}
	}
	
	
	public static String getCurrentDateTime()
	{
		DateFormat customFormat=new SimpleDateFormat("MM_dd_yyyy_HH_mm_ss");
		Date currentDate=new Date();
		return customFormat.format(currentDate);
	}
	

}
