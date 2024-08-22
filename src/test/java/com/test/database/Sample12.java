package com.test.database;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.web.pom.BaseClass;
import com.web.testng.PropertiesFileRead;

public class Sample12 extends BaseClass {
public static void main(String[] args) {
	browserLaunch();
	getURL(PropertiesFileRead.prop_read("url"));
	List<WebElement> elements = driver.findElements(By.tagName("a"));
	for(WebElement x: elements) {
		String attribute = x.getAttribute("href");
		System.out.println(attribute);
	
	try {
		URL url=new URL(attribute);
	HttpURLConnection httpurl=(HttpURLConnection)url.openConnection();
	httpurl.connect();
	if(httpurl.getResponseCode()<=400) {
		System.out.println(httpurl.getResponseMessage());
	}else {
		System.out.println(httpurl.getResponseMessage());
	}
	} catch (MalformedURLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	}
}
}
