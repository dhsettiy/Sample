package com.test.data;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Parameter {
	public WebDriver driver;

	@BeforeTest
	public void browserLaunch() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://adactinhotelapp.com/");
	}
	@Parameters({"userName","passWord"})

	@Test
	public void loginPage(String userName, String passWord) {
		driver.findElement(By.id("username")).sendKeys(userName);
		driver.findElement(By.id("password")).sendKeys(passWord);
		driver.findElement(By.id("login")).click();
	}

	@AfterTest
	public void getScreenShot() {
      File sc=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
      File des=new File(System.getProperty("user.dir")+"/ScreenShot"+ timeStamp()+ ".png");
      try {
		FileHandler.copy(sc, des);
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	}
	public String timeStamp() {
		SimpleDateFormat sm=new SimpleDateFormat("dd-MM-YY hh-mm-ss");
		String format = sm.format(new Date());
		return format;
	}
}
