package com.test.data;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Sample13 {
@BeforeTest
public void getdata() {
	System.out.println("beforeTest");
}
@BeforeMethod
public void beforeTest() {
	System.out.println("beforeMethod");
}
@BeforeClass
public void beforeClass() {
	System.out.println("beforeClass");
}
@Test
public void test() {
	String value="dharunya";
	char charAt = value.charAt(3);
	System.out.println(charAt);
}
@Test
public void test1() {
	System.out.println("test");
}
}
