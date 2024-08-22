package com.web.pageexe;

import com.web.pagelocator.LoginLocator;
import com.web.pom.BaseClass;
import com.web.testng.PropertiesFileRead;

public class LoginPageExecution extends LoginLocator{
	public static void getUrl() {
		BaseClass.getURL(PropertiesFileRead.prop_read("url"));
	}
	public static void userName() {
		BaseClass.userName(new LoginLocator().getUsername(), PropertiesFileRead.prop_read("userName"));
	}
	public static void PassWord() {
		BaseClass.userName(new LoginLocator().getPassword(), PropertiesFileRead.prop_read("passWord"));
	}
	public static void click() {
		BaseClass.click(new LoginLocator().getLogin());
	}
}
