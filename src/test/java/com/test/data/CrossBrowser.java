package com.test.data;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class CrossBrowser {
	public WebDriver driver;
	@Parameters({"browser"})
@Test
public void crossBrowser(String browser) {
	if(browser.equals("chrome")) {
	 driver=new ChromeDriver();
		driver.get("https://www.google.com/");
	}else if(browser.equals("edge")) {
		 driver=new EdgeDriver();
		driver.get("https://www.google.com/");
	}
}
	@Test
	public void login() {
		driver.get("https://adactinhotelapp.com/");
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("yuvisekar3");
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("33CJOO");
		driver.findElement(By.xpath("//input[@id='login']")).click();
	}
	@AfterTest
	public void aftertest() {
		File scr = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		File dest = new File(System.getProperty("user.dir") + "/ScreenShot" + timestamp() + ".png");
		try {
			FileUtils.copyFile(scr, dest);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static String timestamp() {
		return new SimpleDateFormat("yyyy-MM-dd HH-mm-ss").format(new Date());
	}
}
