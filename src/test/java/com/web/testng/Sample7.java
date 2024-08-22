package com.web.testng;

import org.junit.Ignore;
import org.junit.Test;

public class Sample7 {
@Test
public void test() {
	System.out.println("test");
}
@Test
public void test1() {
	System.out.println("test1");
}
@Ignore
@Test
public void test2() {
	System.out.println("test2");
}
}
