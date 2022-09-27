package com.learn.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LogoutPage {
	
	WebDriver driver;

	public LogoutPage(WebDriver ldriver) {
		super();
		driver=ldriver;
	}
	
	@FindBy(xpath="//a[@class=' dropdown-toggle']") WebElement toggle;
	
	@FindBy(xpath="//li[@menuitemname='Logout']/a") WebElement logoutButton;
	
	public void logoutToPhp() throws InterruptedException
	{
		Thread.sleep(8000);
		toggle.click();
		Thread.sleep(2000);
		logoutButton.click();
	}
	
	

}
