package com.seleliumprastise;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class alerts {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.hyrtutorials.com/p/alertsdemo.html");
		
////		Alert box
//		
//		System.out.println("Alert Box msg:"+driver.findElement(By.id("output")).getText());
//		
//		driver.findElement(By.id("alertBox")).click();
//		
//		System.out.println(driver.switchTo().alert().getText());
//		
//		driver.switchTo().alert().accept();
//		
//		
//		System.out.println("Alert Box msg:"+driver.findElement(By.id("output")).getText());
//		
//		driver.quit();
		
		//Confirm Box
		
//		System.out.println("Confirm Box msg:"+driver.findElement(By.id("output")).getText());
//		
//		driver.findElement(By.id("confirmBox")).click();
//		
//		System.out.println(driver.switchTo().alert().getText());
//		
//		driver.switchTo().alert().accept();
//		
//		System.out.println("Confirm Box msg:"+driver.findElement(By.id("output")).getText());
//		
//		
//		driver.findElement(By.id("confirmBox")).click();
//		
//		System.out.println(driver.switchTo().alert().getText());
//		
//		driver.switchTo().alert().dismiss();
//		
//		System.out.println("Confirm Box msg:"+driver.findElement(By.id("output")).getText());
		
		
    //		Prompt Box
		System.out.println("prompt Box msg:"+driver.findElement(By.id("output")).getText());
		
		driver.findElement(By.id("promptBox")).click();
		
		System.out.println(driver.switchTo().alert().getText());
		
		driver.switchTo().alert().sendKeys("RamaRaju");
		
		
		driver.switchTo().alert().accept();
		
		System.out.println("prompt Box msg:"+driver.findElement(By.id("output")).getText());

		driver.findElement(By.id("promptBox")).click();

		System.out.println(driver.switchTo().alert().getText());

		driver.switchTo().alert().dismiss();

		System.out.println("prompt Box msg:"+driver.findElement(By.id("output")).getText());

		
	}
	

}
