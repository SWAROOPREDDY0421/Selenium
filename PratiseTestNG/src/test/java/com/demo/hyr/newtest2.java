package com.demo.hyr;

import org.testng.annotations.Test;

public class newtest2 {

	@Test(groups= {"retesting"})
	public void test11() {
		System.out.println("newtest2 5 :"+Thread.currentThread().getId());
	}
	@Test(groups= {"functional","alpha"})
	public void test12() {
		System.out.println("newtest2 6:"+Thread.currentThread().getId());
	}
	@Test(groups= {"retesting","functional","alpha"})
	public void test13() {
		System.out.println("newtest2 7 :"+Thread.currentThread().getId());
	}
	@Test(groups= {"beta","smoke","santity"})
	public void test14() {
		System.out.println("newtest2 8 :"+Thread.currentThread().getId());
	}
	@Test(groups= {"functional","smoke","retesting"})
	public void test15() {
		System.out.println("newtest2 9 :"+Thread.currentThread().getId());
	}
	@Test
	public void test16() {
		System.out.println("newtest2 10 :"+Thread.currentThread().getId());
	}
}
