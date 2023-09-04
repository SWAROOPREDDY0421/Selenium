package com.seleliumprastise;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Basic_controls {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(6, TimeUnit.SECONDS);
		driver.get("hhttps://www.hyrtutorials.com/p/basic-controls.html");

		driver.findElement(By.name("fName")).sendKeys("Rama");
		WebElement ls=driver.findElement(By.id("lastName"));
		if(ls.isDisplayed()) {
			if(ls.isEnabled()) {
				ls.sendKeys("Raju");
				String text=ls.getAttribute("value");
				System.out.println(text);

			}
			else {
				System.out.println("Not Enabled");
			}
		}
		else {
			System.out.println("Not Displayed");
		}


		driver.findElement(By.id("femalerb")).click();

		driver.findElement(By.id("englishchbx")).click();

		driver.findElement(By.id("hindichbx")).click();

		WebElement frchk=driver.findElement(By.id("frenchchbx"));
		frchk.click();
		if(frchk.isSelected()) {
			frchk.click();
		}
		else {
			System.out.println("not checked");
		}
		driver.findElement(By.name("fName")).sendKeys("Rama");
		WebElement last=driver.findElement(By.id("lastName"));
		if(last.isDisplayed()) {
			if(last.isEnabled()) {
				last.sendKeys("Raju");
				String text=last.getAttribute("value");
				System.out.println(text);

			}
			else {
				System.out.println("Not Enabled");
			}
		}
		else {
			System.out.println("Not Displayed");
		}

		driver.findElement(By.id("registerbtn")).click();

		String 	msg=driver.findElement(By.id("msg")).getText();
		System.out.println(msg);

		driver.findElement(By.id("navigateHome")).click();
	}

}
