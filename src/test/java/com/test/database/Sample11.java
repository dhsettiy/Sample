package com.test.database;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.web.pagelocator.EssepsRegistrationLocator;
import com.web.pom.BaseClass;

public class Sample11 extends EssepsRegistrationLocator{
public static void main(String[] args) throws InterruptedException {
	browserLaunch();
    BaseClass.getURL("https://demoqa.com/automation-practice-form");
    BaseClass.scrollDown();
    WebElement click = driver.findElement(By.xpath("//label[text()='Female']"));
    click.click();
    Thread.sleep(5000);
    WebElement sub = driver.findElement(By.xpath("//input[@id='subjectsInput']"));
    sub.sendKeys("java");
    WebElement element2 = driver.findElement(By.xpath("//div[text()='NCR']"));
    element2.sendKeys("NCR");
    WebElement element3 = driver.findElement(By.xpath("//div[text()='Delhi']"));
    element3.sendKeys("Delhi");
    WebElement element = driver.findElement(By.id("submit"));
    element.click();
}
}
