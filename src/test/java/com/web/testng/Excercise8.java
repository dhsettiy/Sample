package com.web.testng;

public class Excercise8 {
public static void main(String[] args) {
	int lowerCase=0;
	int upperCase=0;
	int specialChar=0;
	int number=0;
	String data="Welcome to Project Class! & code num is *123%#2";
	for(int i=0; i<data.length();i++) {
		char charAt = data.charAt(i);
		if(Character.isLowerCase(charAt)) {
			lowerCase++;
		}else if(Character.isUpperCase(charAt)){
			upperCase++;
		}else if(!Character.isAlphabetic(i)&&!Character.isDigit(charAt)) {
			specialChar++;
		}else {
			number++;
		}
	}
	System.out.println(lowerCase);
	System.out.println(upperCase);
	System.out.println(specialChar);
	System.out.println(number);
}
}
