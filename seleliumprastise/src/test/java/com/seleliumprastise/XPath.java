package com.seleliumprastise;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class XPath {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.hyrtutorials.com/p/add-padding-to-containers.html");
		
		//xpath Attribute
//		driver.findElement(By.xpath("//a[@title='Search W3Schools']"));
		
		//Xpath operator
		driver.findElement(By.xpath("//input[@maxlength='10']")).sendKeys("sai");
		
		driver.findElement(By.xpath("//input[@maxlength!='10']")).sendKeys("raju");
		
		driver.findElement(By.xpath("//input[@type='text'][3]")).sendKeys("jar");
		
		driver.findElement(By.xpath("//table[@id='contactList']/tbody/tr[4]/td[5]")).click();
		
		driver.findElement(By.xpath(""));
		
//		driver.quit();
		
	}

}
