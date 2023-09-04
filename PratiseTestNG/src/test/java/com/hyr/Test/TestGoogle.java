package com.hyr.Test;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.apache.log4j.xml.DOMConfigurator;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestGoogle {
	
	
//	public void TestLog() throws Exception {
//		WebDriverManager.chromedriver().setup();
//		WebDriver driver=new ChromeDriver();
//	
//		Logger logger=Logger.getLogger("Log4jExample");
//		
//		PropertyConfigurator.configure("log4j.properties");
//		
//		logger.info("browser opened");
//		driver.get("https://www.google.com/");
//		driver.manage().window().maximize();
//		
//		
//		logger.info("clicked on item");
//		driver.findElement(By.name("q")).sendKeys("Samasung",Keys.ENTER);
//		System.out.println(driver.getTitle());;
//		Thread.sleep(2000);
//		driver.quit();
//	}
	@Test()
	public void Facebook() throws Exception {
		
		Logger logger=Logger.getLogger("Log4jExample");
		
		DOMConfigurator.configure("Log4j.properties");
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		logger.info(" browser opened");
		driver.get("https://www.facebook.com/login/");
		
		logger.info("User enter the credentials as username and password");
		
		driver.findElement(By.name("email")).sendKeys("Samasung");
		Thread.sleep(2000);
		driver.findElement(By.id("pass")).sendKeys("raju@123");
		Thread.sleep(2000);
		driver.findElement(By.id("loginbutton")).click();
		System.out.println(driver.getTitle());
		Thread.sleep(2000);
		System.out.println(driver.getCurrentUrl());
		driver.quit();
	}
}
