package com.test.data;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.StandardCopyOption;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;


public class Sample22 {
public static void main(String[] args) throws InterruptedException, IOException {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://freetestdata.com/document-files/pdf/");
	WebElement element = driver.findElement(By.xpath("(//span[text()='Select File & Download'])[1]"));
	//element.click();
	Actions action=new Actions(driver);
	action.click(element).perform();
	String downloadLocation="C:\\Users\\dharu\\Downloads";
	String fileName="downloadedFile.pdf";
	File downloadFile=new File(downloadLocation+"/"+fileName);
	int waitTime=0;
	while(!downloadFile.exists()&&waitTime<30) {
		Thread.sleep(1000);
		waitTime++;
	}
	
	if(downloadFile.exists()) {
		String destinationDir="C:\\Users\\dharu\\OneDrive\\Desktop\\Dharunya";
		File destinationFile=new File(destinationDir +"/"+fileName);
		Files.move(downloadFile.toPath(), destinationFile.toPath(), StandardCopyOption.REPLACE_EXISTING);
		System.out.println(destinationDir);
	}else {
		System.out.println("File not found");
	}
}
}
