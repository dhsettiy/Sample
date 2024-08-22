package com.web.testng;

import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

public class Excercise1 {
//	@Ignore
//	@Before
//	public void before() {
//		System.out.println("before");
//	}

	@Test
	public void test() {
		String userName = "Dharunya";
		System.out.println(userName);
	}


	@Test
	public void testOne() {
		String passWord = "1234560";
		System.out.println(passWord);
	}

	@Test
	public void testTwo() {
		String url = "https:facebook.com";
		System.out.println(url);
	}

	@Test
	public void testThree() {
		String cont = "continue";
		System.out.println(cont);
	}
}
