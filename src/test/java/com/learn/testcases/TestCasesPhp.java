package com.learn.testcases;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.learn.pages.BaseClass;
import com.learn.pages.LoginPage;
import com.learn.pages.LogoutPage;
import com.learn.utilities.BrowserFactory;
import com.learn.utilities.ExcelDataProvider;
import com.learn.utilities.ScreenshotClass;

public class TestCasesPhp extends BaseClass {

	// WebDriver driver;

	/*
	 * @BeforeClass public void setUp() {
	 * driver=BrowserFactory.startApplication(driver,"chrome",
	 * "https://phptravels.org/login"); }
	 * 
	 * @AfterClass public void tearDown() { BrowserFactory.quitBrowser(driver); }
	 */

	@Test
	public void loginApp() throws InterruptedException {
		// driver=BrowserFactory.startApplication(driver,"chrome","https://phptravels.org/login");
		//LoginPage loginPage = PageFactory.initElements(driver, LoginPage.class);
		//loginPage.loginToPhp("balkrishan.panchal@gmail.com", "PHP@Travels");
		// BrowserFactory.quitBrowser(driver);
		
		//ExcelDataProvider excel=new ExcelDataProvider();
		//excel.getStringData("Login", 0, 0);
		
		LoginPage loginPage = PageFactory.initElements(driver, LoginPage.class);
		loginPage.loginToPhp(excel.getStringData("Login", 0, 0), excel.getStringData("Login", 0, 1));
	}
		

	@Test
	public void logoutApp() throws InterruptedException {
		LogoutPage logoutPage = PageFactory.initElements(driver, LogoutPage.class);
		logoutPage.logoutToPhp();
	}
	
	

}
