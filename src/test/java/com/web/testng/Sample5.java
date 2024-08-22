package com.web.testng;

import org.junit.BeforeClass;
import org.junit.Test;

public class Sample5 {
@Test
public  void test() {
	String a="data";
	boolean contains = a.contains("d");
	if(contains) {
		System.out.println("Given Statement is true");
	}
}
@BeforeClass
public static void beforeClass() {
  String a="Welcome to Automation Testing";
  int count=0;
  for(int i=0; i<a.length(); i++) {
	if(a.charAt(i)!=' ') {
		count++;
	}
  }
  System.out.println(count);
}
}
