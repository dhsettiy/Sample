package com.web.testng;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class Sample6 {
@After
public void primeNumber() {
	int n=10;
	int count=0;
	for(int i=0; i<=n; i++) {
		if(i%n==0) {
			count=1;
			break;
		}
	}
	if(count==0) {
		System.out.println("it's prime Number");
	}else {
		System.out.println("not prime number");
	}
}
@Before
public void printPrimeNumber() {
	int count;
	for(int n=1; n<=100; n++) {
		count=0;
		for(int i=2; i<n/2; i++) {
			if(n%i==0) {
				count=1;
				break;
			}
		}
		if(count==0) {
			System.out.println(n);
		}
	}
	
}
@Test
public void countOfPrimeNumber() {
	int count;
	int pcount=0;
	 for(int i=1; i<=100; i++) {
		 count=0;
		 for(int j=2; j<i/2; j++) {
			 if(i%2==0) {
				 count=1;
				 break;
			 }
		 }
		 if(count==0) {
			 pcount++;
		 }
	 }
}
}
