package com.test.database;

public class Sample8 {
public static void main(String[] args) {
	int[] a=new int[5];
	a[0]=12;
	a[2]=52;
	a[1]=85;//.addAll-> List
	int[] b=new int [a.length];
	for(int i=0; i<b.length; i++) {
		System.out.println(b[i]);
	}
}
}
