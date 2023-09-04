package com.seleliumprastise;

import java.time.Duration;
import java.time.Instant;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class pageloadtimeout {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.manage().timeouts().pageLoadTimeout(1, TimeUnit.MINUTES);
		
		Instant starttime =Instant.now();
		System.out.println(starttime.toString());
		driver.get("https://www.hyrtutorials.com/");
		
		Instant Endtime =Instant.now();
		System.out.println(Endtime.toString());
		
		Duration durtation =Duration.between(starttime, Endtime);
		System.out.println("The pageload Time out:"+durtation.toMillis() +"millsec");
		
		System.out.println(driver.getTitle());
		

	}

}
