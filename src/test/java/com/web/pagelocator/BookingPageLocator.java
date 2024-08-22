package com.web.pagelocator;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.web.pom.BaseClass;

public class BookingPageLocator extends BaseClass{
public BookingPageLocator() {
	PageFactory.initElements(driver,this);
}
@FindBy(name="first_name")
private WebElement firstName;
public WebElement getFirstName() {
	return firstName;
}
@FindBy(name="last_name")
private WebElement lastName;
public WebElement getLastName() {
	return lastName;
}
@FindBy(name="address")
private WebElement address;
public WebElement getAddress() {
	return address;
}
@FindBy(id="cc_num")
private WebElement cc_num;
public WebElement getCc_num() {
	return cc_num;
}
@FindBy(id="cc_type")
private WebElement cc_type;
public WebElement getCc_type() {
	return cc_type;
}
@FindBy(id="cc_exp_month")
private WebElement cc_exp_month;
public WebElement getCc_exp_month() {
	return cc_exp_month;
}
@FindBy(id="cc_exp_year")
private WebElement cc_exp_year;
public WebElement getCc_exp_year() {
	return cc_exp_year;
}
@FindBy(id="cc_cvv")
private WebElement cc_cvv;
public WebElement getCc_cvv() {
	return cc_cvv;
}
@FindBy(id="book_now")
private WebElement book_now;
public WebElement getBook_now() {
	return book_now;
}

}
