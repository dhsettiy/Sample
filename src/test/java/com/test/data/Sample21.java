package com.test.data;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sample21 {
public static void main(String[] args) throws InterruptedException {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://smallpdf.com/blog/sample-pdf");
	WebElement element = driver.findElement(By.xpath("//span[text()='Download Sample PDF']"));
	element.click();
	Thread.sleep(2000);
	WebElement element2 = driver.findElement(By.xpath("//span[text()='Finish']"));
	element2.click();
	WebElement element3 = driver.findElement(By.xpath("//div[text()='Download (.pdf)']"));
	element3.click();
}
}
