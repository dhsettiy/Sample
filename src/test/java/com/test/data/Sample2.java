package com.test.data;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Sample2 {
public static void main(String[] args) {
	WebDriverManager.chromedriver().setup();
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.instagram.com/");
	driver.manage().window().maximize();
	WebElement userName = driver.findElement(By.xpath("//input[@name='username']"));
	WebElement passWord = driver.findElement(By.xpath("//input[@name='password']"));
	JavascriptExecutor js=(JavascriptExecutor)driver;
	js.executeScript("arguments[0].setAttribute('value','test1')", userName);
	js.executeScript("arguments[0].setAttribute('value','test2')", passWord);
}
}
