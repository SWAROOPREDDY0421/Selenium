package com.seleliumprastise;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class validcalender {

	public static void main(String[] args) throws Exception  {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.hyrtutorials.com/p/calendar-practice.html");
		int day=1;
		
		String targetdate="29/Feb/2023";
		Calendar calender=Calendar.getInstance();
		
		SimpleDateFormat targetdateformat=new SimpleDateFormat("dd/MMM/yyyy");
		targetdateformat.setLenient(false);
		Date formattargetdate;
		try {
			formattargetdate = targetdateformat.parse(targetdate);
			int targetmonth=calender.get(Calendar.MONTH);
			int targetyear=calender.get(Calendar.YEAR);
			
			driver.findElement(By.id("first_date_picker")).click();
			String currentdate=driver.findElement(By.className("ui-datepicker-title")).getText();
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			throw new Exception("INvalid date");
		}
		System.out.println(formattargetdate);
	}

}
