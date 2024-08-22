package com.test.data;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Sample {
public static void main(String[] args) throws InterruptedException {
	WebDriverManager.chromedriver().setup();
	WebDriver driver=new ChromeDriver();
    driver.manage().window().maximize();
    driver.get("https://toolsqa.com/");
    WebElement cucumber = driver.findElement(By.xpath("//div[text()='Cucumber']"));
    WebElement search = driver.findElement(By.xpath("(//input[@type='text'])[2]"));
	JavascriptExecutor js=(JavascriptExecutor)driver;
	js.executeScript("arguments[0].scrollIntoView(true);", cucumber);
	Thread.sleep(5000);
	js.executeScript("arguments[0].scrollIntoView(true);", search);
}
}

