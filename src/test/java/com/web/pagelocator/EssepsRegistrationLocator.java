package com.web.pagelocator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.web.pom.BaseClass;

public class EssepsRegistrationLocator extends BaseClass {
	public EssepsRegistrationLocator() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(id = "firstName")
	private WebElement firstName;

	public WebElement firstName() {
		return firstName;
	}

	@FindBy(id = "lastName")
	private WebElement lastName;

	public WebElement lastName() {
		return lastName;
	}
	@FindBy(id="userEmail")
	private WebElement userEmail;
	public WebElement email() {
		return userEmail;
	}
	
	@FindBy(xpath = "//label[text()='Female']")
	private WebElement female;
	public WebElement getRadio() {
		return female;
	}
	 @FindBy(xpath = "//input[@placeholder='Mobile Number']")
	 private WebElement mobileNumber;
	 public WebElement mobileNumber() {
		 return mobileNumber;
	 }
	 @FindBy(xpath = "//input[@id='subjectsInput']")
	 private WebElement subject;
	 public WebElement subject() {
		 return subject;
	 }
	 @FindBy(xpath = "//label[text()='Reading']")
	 private WebElement read;
	 public WebElement read() {
		 return read;
	 }
	 @FindBy(id ="currentAddress")
	 private WebElement address;
	 public WebElement address() {
		 return address;
	 }
	 @FindBy(id = "submit")
	 private WebElement submit;
	 public WebElement submit() {
		 return submit;
	 }
}
