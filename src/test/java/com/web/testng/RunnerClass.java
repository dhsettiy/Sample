package com.web.testng;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({Sample9.class, Sample5.class, Sample8.class})
public class RunnerClass {
@Test
public void reverse() {
	String a="Java";
	String rev="";
	for(int i=a.length()-1; i>=0; i--) {
		char charAt = a.charAt(i);
		rev=rev+charAt;
	}
	System.out.println(rev);
}
}
