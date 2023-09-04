package com.demo.hyr;

import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

public class newtest1 {

	@Test(groups= {"retesting"})
	public void test5() {
		System.out.println("newtest1 5 :"+Thread.currentThread().getId());
	}
	@Test(groups= {"functional","alpha"})
	public void test6() {
		System.out.println("newtest1 6:"+Thread.currentThread().getId());
	}
	@Test(groups= {"retesting","functional","alpha"})
	public void test7() {
		System.out.println("newtest1 7 :"+Thread.currentThread().getId());
	}
	@Test(groups= {"beta","smoke","santity"})
	public void test8() {
		System.out.println("newtest1 8 :"+Thread.currentThread().getId());
	}
	@Test(groups= {"functional","smoke","retesting"})
	public void test9() {
		System.out.println("newtest1 9 :"+Thread.currentThread().getId());
	}
	@Test
	public void test10() {
		System.out.println("newtest1 10 :"+Thread.currentThread().getId());
	}
}
