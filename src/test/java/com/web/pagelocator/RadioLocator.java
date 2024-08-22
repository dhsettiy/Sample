package com.web.pagelocator;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.web.pom.BaseClass;

public class RadioLocator extends BaseClass{
public RadioLocator() {
	PageFactory.initElements(driver, this);
}
@FindBy(id="radiobutton_0")
private WebElement radioButton;
public WebElement getRadioButton() {
	return radioButton;
}
@FindBy(id="continue")
private WebElement continuee;
public WebElement getContinuee() {
	return continuee;
}

}
