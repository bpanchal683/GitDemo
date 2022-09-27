package com.learn.pages;

import org.openqa.selenium.WebDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;

import com.learn.utilities.BrowserFactory;
import com.learn.utilities.ConfigDataProvider;
import com.learn.utilities.ExcelDataProvider;
import com.learn.utilities.ScreenshotClass;


public class BaseClass {
	
	public WebDriver driver;
	public ExcelDataProvider excel;
	public ConfigDataProvider config;
	
	@BeforeSuite
	public void setUpSuite()
	{
			excel=new ExcelDataProvider();
			config=new ConfigDataProvider();
	}
	
	@BeforeClass
	public void setUp()
	{
		driver=BrowserFactory.startApplication(driver,config.getBrowser(),config.getStagingUrl());
	}
	
	@AfterClass
	public void tearDown()
	{
		BrowserFactory.quitBrowser(driver);
	}
	
	@AfterMethod
	public void teardownMethod(ITestResult result)
	{
		if(result.getStatus()==ITestResult.FAILURE)
		{
			ScreenshotClass.getScreenshot(driver);
		}
	}

}
