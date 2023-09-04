package com.seleliumprastise;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import net.bytebuddy.asm.Advice.Argument;

public class javaexecutor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/login/");
		
		JavascriptExecutor jsexecutor=(JavascriptExecutor) driver;
		WebElement usertxt=(WebElement) jsexecutor.executeScript("return document.getElementById('email')");
		usertxt.sendKeys("SWAROOP reddy");
		
		WebElement passtxt=(WebElement) jsexecutor.executeScript("return document.getElementsByName('pass')[0];");
		passtxt.sendKeys("siva@123");
		
		
	jsexecutor.executeScript("document.getElementById('loginbutton');");
		
		//loinbtn.click();
		


	}

}
