package com.seleliumprastise;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class mouseoveraction {
	

	
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://ts.meeseva.telangana.gov.in/meeseva/home.htm");
//		driver.findElement(By.className("close")).click();
//		driver.switchTo().alert().dismiss();
		
		Actions actions=new Actions(driver);
		actions.moveToElement(driver.findElement(By.className("navbarDropdown")))
		.click()
		.perform();
		
	}

}
