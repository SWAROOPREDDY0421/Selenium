package com.hyr.Test;

import org.apache.log4j.Logger;
import org.apache.log4j.xml.DOMConfigurator;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestAnnonations {
	
	Logger logger=Logger.getLogger("Log4jExample");
	
	
	
	@Test
	 public void testmehod1() {
		System.out.println("Testmehod");
	}
	@AfterMethod
	public void aftermethod() {
		System.out.println("aftermethod");
	}
	@AfterClass
	public void afterclass() {
		System.out.println("afterclass");
	}
	@AfterSuite
	public void aftersuite() {
		System.out.println("aftersuite");
	}
	@AfterTest
	public void aftertest() {
		System.out.println("aftertest");
	}
	@BeforeSuite
	public void beforesuite() {
		System.out.println("beforesuite");
	}
	@BeforeClass
	public void beforeclass() {
		System.out.println("beforeclass");
	}
	@BeforeTest
	public void beforetest() {
		System.out.println("beforetest");
	}
	@BeforeMethod
	public void beforemethod() {
		System.out.println("beforemethod");
	}

}
