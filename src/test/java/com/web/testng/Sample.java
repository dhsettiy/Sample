package com.web.testng;

import org.junit.BeforeClass;
import org.junit.Test;

public class Sample {
@Test
public void Class(){
	System.out.println("Before Class");
}
@BeforeClass
public static void test() {
	System.out.println("First Class");
}
@BeforeClass
public static void beforeClass() {
	System.out.println("beforeclass");
}
}
