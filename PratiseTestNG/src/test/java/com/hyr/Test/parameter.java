package com.hyr.Test;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class parameter {
	WebDriver driver;
	//	@Test
	//	public void Google() throws Exception {
	//		WebDriverManager.chromedriver().setup();
	//		WebDriver driver=new ChromeDriver();
	//		driver.manage().window().maximize();
	//		driver.get("https://www.google.com/");
	//		driver.findElement(By.name("q")).sendKeys("Samasung",Keys.ENTER);
	//		System.out.println(driver.getTitle());;
	//		Thread.sleep(2000);
	//		driver.quit();
	//	}
	//	@Test
	//	public void Facebook() throws Exception {
	//		WebDriverManager.chromedriver().setup();
	//		WebDriver driver=new ChromeDriver();
	//		driver.manage().window().maximize();
	//		driver.get("https://www.facebook.com/login/");
	//		driver.findElement(By.name("email")).sendKeys("Samasung");
	//		Thread.sleep(2000);
	//		driver.findElement(By.id("pass")).sendKeys("raju@123");
	//		Thread.sleep(2000);
	//		driver.findElement(By.id("loginbutton")).click();
	//		System.out.println(driver.getTitle());
	//		Thread.sleep(2000);
	//		System.out.println(driver.getCurrentUrl());
	//		driver.quit();
	//	}
	@Parameters("browser")
	@BeforeTest
	public void intilisebroswer(String Browser) {
		switch(Browser) {
		case "Chrome":
			WebDriverManager.chromedriver().setup();
			driver=new ChromeDriver();
			break;
		case "firefox":
			WebDriverManager.chromedriver().setup();
			driver=new FirefoxDriver();
			break;
		case "edge":
			WebDriverManager.chromedriver().setup();
			driver=new EdgeDriver();
			break;
			default:
				System.err.println("Invalid browser");
		}
		
		driver.manage().window().maximize();
	}
	@AfterTest
	public void teardown() {
		driver.quit();
	}


	@Test
	public void LanchApp(String url) {

		driver.get(url);

	}

	@Test()
	public void LoginDetails() throws InterruptedException  {
		
		driver.findElement(By.name("username")).sendKeys("Admin");
		Thread.sleep(2000);
		driver.findElement(By.name("password")).sendKeys("admin123");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@type='submit']")).click();
	}

	@Test
	public void Navigatetomyinfo() throws Exception {
	
		
		driver.findElement(By.className("oxd-main-menu-item")).click();
		Thread.sleep(2000);

	}


	@Test
	public void verifymyinfo() throws Exception {


		driver.findElement(By.className("orangehrm-background-container")).isDisplayed();
		Thread.sleep(2000);

	}


	@Test
	public void verifylogout() throws Exception {

		driver.findElement(By.className("oxd-userdropdown-link")).click();
		Thread.sleep(2000);

	}
}
