package com.demo.hyr;

import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

public class newtest {
	
	@Test(groups= {"smoke"})
	public void test1() {
		System.out.println("newtest 1:"+Thread.currentThread().getId());

	}
	@Test(groups= {"smaoke","functional"})
	public void test2() {
		System.out.println("newtest 2:"+Thread.currentThread().getId());
	}
	@Test(groups= {"regression","retesting"})
	public void test3() {
		System.out.println("newtest 3:"+Thread.currentThread().getId());
	}
	@Test(groups= {"retesting","sanity"})
	public void test4() {
		System.out.println("newtest 4:"+Thread.currentThread().getId());
	}
}
