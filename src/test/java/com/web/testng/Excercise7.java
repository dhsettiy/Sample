package com.web.testng;

public class Excercise7 {
	public static void main(String[] args) {
		String data = "WelComE";
		StringBuilder value = new StringBuilder(data);
		for (int i = 0; i < value.length(); i++) {
			char charAt = value.charAt(i);
			if (Character.isUpperCase(charAt)) {
				value.setCharAt(i, Character.toLowerCase(charAt));
			} else if (Character.isLowerCase(charAt)) {
				value.setCharAt(i, Character.toUpperCase(charAt));
			}
		}
		System.out.println(value);
	}
}
