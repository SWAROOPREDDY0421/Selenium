package com.hyr.Test;

import static org.testng.Assert.*;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FirstTest {
	@Test()
	public void TestHyr() throws Exception {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		driver.findElement(By.name("q")).sendKeys("HYR Tutorials",Keys.ENTER);
		Thread.sleep(2000);
		String Excepted_Title="HYR Tutorials - Google Search";
		String Actual_title=driver.getTitle();
		assertEquals(Actual_title, Excepted_Title,"title is mismatch");

		assertTrue(true);
		

		Thread.sleep(2000);
		driver.quit();
	}
	
	@Test(priority=1)
	public void Facebook() throws Exception {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/login/");
		driver.findElement(By.name("email")).sendKeys("Samasung");
		Thread.sleep(2000);
		driver.findElement(By.id("pass")).sendKeys("raju@123");
		Thread.sleep(2000);
		driver.findElement(By.id("loginbutton")).click();
		
		SoftAssert softassert=new SoftAssert();
		
		//Title
		String Expected_title="Facebook log in or sign up";
		String	Actual_title=driver.getTitle();
		Thread.sleep(2000);
		softassert.assertEquals(Actual_title, Expected_title,"Title Mismatch");
		
		//Url Assertion
		String Expected_url="https://www.facebook.co.in";
		String	Actual_url=driver.getCurrentUrl();
		Thread.sleep(2000);
		softassert.assertNotEquals(Actual_url, Expected_url,"url Mismatch"); 
		
		//Text assert
		String Expected_Text="";
		String	Actual_Text=driver.findElement(By.name("email")).getAttribute("value");
		Thread.sleep(2000);
		softassert.assertEquals(Actual_Text, Expected_Text,"user_Text Mismatch");
		
		
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		driver.quit();
		softassert.assertAll();
	}

	
		@Test(priority=2)
		public void Google() throws Exception {
			WebDriverManager.chromedriver().setup();
			WebDriver driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://www.google.com/");
			driver.findElement(By.name("q")).sendKeys("Samasung",Keys.ENTER);
			System.out.println(driver.getTitle());;
			Thread.sleep(2000);
			driver.quit();
		}
	}
