package com.seleliumprastise;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;


public class WindowHandle {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.hyrtutorials.com/p/window-handles-practice.html");
////		window
//		driver.findElement(By.id("name")).sendKeys("SWAROOP REDDY");
//		String ParentWindowHandle=driver.getWindowHandle();
//		System.out.println("The Parent Window Handle is:" +ParentWindowHandle);
//		driver.findElement(By.id("newWindowBtn")).click();
//		Set<String> CDWindowhandle=driver.getWindowHandles();
//		for (String WindowHandle : CDWindowhandle) {
//			if(!WindowHandle.equals(ParentWindowHandle)) {
//				driver.switchTo().window(WindowHandle);
//				driver.manage().window().maximize();
//				driver.findElement(By.id("firstName")).sendKeys("Raju");
//				Thread.sleep(2000);
//				driver.close();
//			
//			}
////			System.out.println("The Window Handle is :"+WindowHandle);
//		}
//				
//		driver.switchTo().window(ParentWindowHandle);
//		driver.findElement(By.id("name")).sendKeys("jai");
//			}
//			
//			driver.quit();
		//		TAB
		driver.findElement(By.id("name")).sendKeys("SWAROOP REDDY");
		String ParentWindowHandle=driver.getWindowHandle();
		System.out.println("The Parent Window Handle is:" +ParentWindowHandle);
		driver.findElement(By.id("newTabBtn")).click();
		Set<String> CDWindowhandle=driver.getWindowHandles();
		for (String WindowHandle : CDWindowhandle) {
			if(!WindowHandle.equals(ParentWindowHandle)) {
				driver.switchTo().window(WindowHandle);
				driver.manage().window().maximize();
				System.out.println("Alert Box msg:"+driver.findElement(By.id("output")).getText());
				
				driver.findElement(By.id("alertBox")).click();
				
				System.out.println(driver.switchTo().alert().getText());
				
				driver.switchTo().alert().accept();
				
				
				System.out.println("Alert Box msg:"+driver.findElement(By.id("output")).getText());
				
				driver.close();
				
			}
		}
		driver.switchTo().window(ParentWindowHandle);
		driver.findElement(By.id("name")).sendKeys(" REDDY");
		
		driver.quit();
	}
}

