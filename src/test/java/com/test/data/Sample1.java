package com.test.data;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Sample1 {
public static void main(String[] args) {
	WebDriverManager.chromedriver().setup();
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.facebook.com/");
//	WebElement userName = driver.findElement(By.id("email"));
//	WebElement passWord = driver.findElement(By.id("pass"));
//	JavascriptExecutor js=(JavascriptExecutor)driver;
//	js.executeScript("arguments[0].setAttribute('value', 'test')", userName);
//	js.executeScript("arguments[0].setAttribute('value','test1')", passWord);
}
}
