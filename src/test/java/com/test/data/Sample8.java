package com.test.data;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Sample8  {
	public static WebDriver driver;
public static void getValue() {
	try {
		FileReader fr=new FileReader(new File("C:\\Users\\dharu\\eclipse-workspace\\Java\\Test\\src\\test\\resources\\TestData\\config.properties"));
		Properties prop=new Properties();
		prop.load(fr);
		String property = prop.getProperty("userName");
		System.out.println(property);
		String property2 = prop.getProperty("passWord");
		System.out.println(property2);
	} catch (FileNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}
public static String prop_reUseable(String value) {
	String data=null;
	try {
		FileReader fr=new FileReader(new File("C:\\\\Users\\\\dharu\\\\eclipse-workspace\\\\Java\\\\Test\\\\src\\\\test\\\\resources\\\\TestData\\\\config.properties"));
		Properties prop=new Properties();
		prop.load(fr);
		 data = prop.getProperty(value);
		System.out.println(data);
	} catch (FileNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	return data;
}
//public static WebElement reuseAbleXpath(String data) {
//	WebElement element = driver.findElement(By.xpath(data));
//	return element;
//}
public static void main(String[] args) throws InterruptedException {
	WebDriverManager.chromedriver().setup();
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get(prop_reUseable("url"));
	driver.findElement(By.xpath("//input[@id='username']")).sendKeys(prop_reUseable("userName"));
	driver.findElement(By.xpath("//input[@id='password']")).sendKeys(prop_reUseable("passWord"));
	driver.findElement(By.xpath("//input[@id='login']")).click();
	driver.findElement(By.xpath("//select[@id='location']")).sendKeys(Sample6.passAll_Data(0, 0));
	driver.findElement(By.xpath("//select[@id='hotels']")).sendKeys(Sample6.passAll_Data(1, 0));
	driver.findElement(By.xpath("//select[@id='room_type']")).sendKeys(Sample6.passAll_Data(2, 0));
	driver.findElement(By.xpath("//select[@id='room_nos']")).sendKeys(Sample6.passAll_Data(3, 0));
	driver.findElement(By.xpath("//input[@value='17/06/2024']")).sendKeys(Sample6.passAll_Data(4, 0));
	driver.findElement(By.xpath("//input[@value='18/06/2024']")).sendKeys(Sample6.passAll_Data(5, 0));
	driver.findElement(By.xpath("//select[@id='adult_room']")).sendKeys(Sample6.passAll_Data(6, 0));
	driver.findElement(By.xpath("//select[@id='child_room']")).sendKeys(Sample6.passAll_Data(7, 0));
	driver.findElement(By.xpath("//input[@id='Submit']")).click();
	driver.findElement(By.xpath("//input[@id='radiobutton_0']")).click();
	driver.findElement(By.xpath("//input[@id='continue']")).click(); //
	driver.findElement(By.xpath("//input[@name='first_name']")).sendKeys(Sample6.passAll_Data(8, 0));
	driver.findElement(By.xpath("//input[@name='last_name']")).sendKeys(Sample6.passAll_Data(9, 0));
	driver.findElement(By.xpath("//textarea[@name='address']")).sendKeys(Sample6.passAll_Data(10, 0));
	driver.findElement(By.xpath("//input[@id='cc_num']")).sendKeys(Sample6.passAll_Data(11, 0));
	driver.findElement(By.xpath("//select[@id='cc_type']")).sendKeys(Sample6.passAll_Data(12, 0));
	driver.findElement(By.xpath("//select[@id='cc_exp_month']")).sendKeys(Sample6.passAll_Data(13, 0));
	driver.findElement(By.xpath("//select[@id='cc_exp_year']")).sendKeys(Sample6.passAll_Data(14, 0));
	driver.findElement(By.xpath("//input[@id='cc_cvv']")).sendKeys(Sample6.passAll_Data(15, 0));
	driver.findElement(By.xpath("//input[@id='book_now']")).click();
	Thread.sleep(5000);
//	String text = driver.findElement(By.xpath("//input[@id='order_no']")).getText();
//	System.out.println(text);
	WebElement dataField = driver.findElement(By.xpath("//input[@id='order_no']"));
	String data1 = dataField.getAttribute("value");
	System.out.println(data1);
	Sample7.excel_Write("OrderID", data1);
}
}
