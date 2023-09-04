package com.hyr.Test;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class dataprovider {

	@Test(dataProvider = "logindata",timeOut = 2000)
	public void TestLogin(String un,String pass) throws Exception {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.findElement(By.name("username")).sendKeys(un);
		Thread.sleep(2000);
		driver.findElement(By.name("password")).sendKeys(pass);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		Thread.sleep(2000);
	
		Assert.assertTrue(driver.findElement(By.className("oxd-userdropdown-tab")).isDisplayed());
		Thread.sleep(2000);
		driver.quit();
	}
		
	@DataProvider(parallel=true)
	public Object[][] logindata() {
		Object[][] data=new Object[6][2];
		data[0][0]="Admin";
		data[0][1]="admin123";

		data[1][0]="admin";
		data[1][1]="Admin123";
		
		data[2][0]="ad";
		data[2][1]="Ad123";
		
		data[3][0]="min";
		data[3][1]="min123";
		
		data[4][0]="ad";
		data[4][1]="min123";
		
		data[5][0]="admi";
		data[5][1]="Admi123";
		
		

		return data;
	}
}
