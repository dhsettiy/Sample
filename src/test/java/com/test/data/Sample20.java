package com.test.data;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.logging.FileHandler;

import javax.imageio.ImageIO;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.Point;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sample20 {
public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.facebook.com/");
	WebElement element = driver.findElement(By.xpath("//input[@id='pass']"));
	//element.sendKeys("dhsettiy");
	TakesScreenshot sh=(TakesScreenshot)driver;
	File screenshot = sh.getScreenshotAs(OutputType.FILE);
	try {
		BufferedImage bufferedImage = ImageIO.read(screenshot);
		Point location = element.getLocation();
		Dimension size = element.getSize();
		int width = size.getWidth();
		int height = size.getHeight();
		BufferedImage subimage = bufferedImage.getSubimage(location.getX(), location.getY(), width, height);
		ImageIO.write(subimage, "png", screenshot);
		File file=new File("C:\\Users\\dharu\\eclipse-workspace\\Java\\Test\\ScreenShots\\element.png");
		org.openqa.selenium.io.FileHandler.copy(screenshot, file);
		driver.quit();
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
}
}
