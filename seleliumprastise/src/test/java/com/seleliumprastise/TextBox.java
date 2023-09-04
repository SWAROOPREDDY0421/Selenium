package com.seleliumprastise;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;


public class TextBox {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(6, TimeUnit.SECONDS);
		driver.get("https://github.com/login");
		driver.findElement(By.id("login_field")).sendKeys("swaroopreddy");
	
		WebElement wb=driver.findElement(By.id("password"));
		
		if(wb.isDisplayed()) {
			if(wb.isEnabled()) {
				wb.sendKeys("abc@123");
				String Entertxt=wb.getAttribute("value");
				System.out.println(Entertxt);
				wb.clear();
			}
			else {
				System.out.println("Not enabled");
			}
		}
		else {
			System.out.println("Text box is not Displayed");
		}
			
		driver.findElement(By.name("commit")).click();
		
	}

}
