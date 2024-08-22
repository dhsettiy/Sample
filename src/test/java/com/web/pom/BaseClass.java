package com.web.pom;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	public static WebDriver driver;
public static void browserLaunch() {
	WebDriverManager.edgedriver().setup();
	driver=new EdgeDriver();
	driver.manage().window().maximize();
			}
public static void getURL(String url) {
	driver.get(url);
}
public static void userName(WebElement element,String data) {
	element.sendKeys(data);
}
public static void click(WebElement element) {
	element.click();
}
public static void get_textData(WebElement element,String data) {
	element.sendKeys(data);
}
public static void select_value(WebElement element, String data) {
	Select s = new Select(element);
	s.selectByValue(data);
}
public static void getScreenShot() {
	TakesScreenshot ts=(TakesScreenshot)driver;
	File scrs = ts.getScreenshotAs(OutputType.FILE);
	File dest = new File(System.getProperty("user.dir") + "/ScreenShot" + timeStamp() + ".png");
	try {
		FileHandler.copy(scrs, dest);
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}
public static String timeStamp() {
	SimpleDateFormat sm=new SimpleDateFormat("yyyy-MM-dd HH-mm-ss");
	String format = sm.format(new Date());
	return format;
}
public static void scrollDown() {
	JavascriptExecutor js=(JavascriptExecutor)driver;
	js.executeScript("window.scrollBy(0,1000)");
}
}
