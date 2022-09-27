package com.learn.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage {
	
	WebDriver driver;

	public LoginPage(WebDriver ldriver) {
		super();
		driver=ldriver;
		
	}
	
	@FindBy(id="inputEmail") WebElement email;
	
	@FindBy(id="inputPassword") WebElement pass;
	
	@FindBy(id="login") WebElement loginButton;
	
	public void loginToPhp(String emailApp,String passApp) throws InterruptedException
	{
		Thread.sleep(2000);
		email.sendKeys(emailApp);
		pass.sendKeys(passApp);
		Thread.sleep(15000);
		loginButton.click();
	}
	
	

}
