package com.seleliumprastise;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Base64;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Screenshot {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.co.in/");
		
//		FILE ----chromedriver or remotechromedriver
		
//		File src=driver.getScreenshotAs(OutputType.FILE);
//		File Dec=new File("./ScreenShot/img1.png");
//		FileUtils.copyFile(src, Dec);
//		System.out.println("Screenshot is sucussfull");
//		driver.quit();
		
//		BYTE
//		byte[] bytearr=driver.getScreenshotAs(OutputType.BYTES);
//		File Dec1=new File("./ScreenShot/img2.png");
//		FileOutputStream Fis=new FileOutputStream(Dec1);
//		Fis.write(bytearr);
//		Fis.close();
//		System.out.println("Screenshot is sucussfull");
//		driver.quit();
		
		
//		BASE64
		
//		String base64code=driver.getScreenshotAs(OutputType.BASE64);
//		byte[] bytearr=Base64.getDecoder().decode(base64code);
//		File Dec2=new File("./ScreenShot/img3.png");
//		FileOutputStream Fis=new FileOutputStream(Dec2);
//		Fis.write(bytearr);
//		Fis.close();
//		System.out.println("Screenshot is sucussfull");
//		driver.quit();
		
		
		//FILE---Webdriver
		TakesScreenshot takesscreenshot = (TakesScreenshot) driver;
		
		File src=takesscreenshot.getScreenshotAs(OutputType.FILE);
		File Dec=new File("./ScreenShot/img4.png");
		FileUtils.copyFile(src, Dec);
		System.out.println("Screenshot is sucussfull");
		driver.quit();
	}
	
	
	

}
