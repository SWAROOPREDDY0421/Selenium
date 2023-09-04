package com.seleliumprastise;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DropDown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.hyrtutorials.com/p/html-dropdown-elements-practice.html");
//		
//		WebElement Course=driver.findElement(By.id("course"));
//		
//		Select selobj=new Select(Course);
//		
//		List<WebElement> selobjoptions=selobj.getOptions();
//		for (WebElement selget : selobjoptions) {
//			System.out.println(selget.getText());
//		}
//		selobj.selectByIndex(2);
//		selobj.selectByValue("js");
//		selobj.selectByVisibleText("Java");
//		
//		String first=selobj.getFirstSelectedOption().getText();
//		System.out.println("The Selected option is:"+first);
//		driver.quit();
		
		WebElement idedp=driver.findElement(By.id("ide"));
		Select selobj=new Select(idedp);
		List<WebElement> seloption=selobj.getOptions();
		for (WebElement selget : seloption) {
			System.out.println("options are:"+selget.getText());
		}
		selobj.selectByIndex(2);
		selobj.selectByValue("ij");
		selobj.selectByVisibleText("Eclipse");
		selobj.deselectByValue("vs");
		
		List<WebElement> seloption1=selobj.getAllSelectedOptions();
		for (WebElement obj : seloption1) {
			System.out.println("select visiable text is:"+obj.getText());
		
		}
		
		
		driver.quit();
	}

}
