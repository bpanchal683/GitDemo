package com.learn.testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstTest {
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\bpanchal\\\\Downloads\\\\chromedriver_win32\\\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://phptravels.org/login");
		driver.findElement(By.id("inputEmail")).sendKeys("balkrishan.panchal@gmail.com");
		driver.findElement(By.id("inputPassword")).sendKeys("PHP@Travels");
		Thread.sleep(15000);
		driver.findElement(By.id("login")).click();
		
	}

}
