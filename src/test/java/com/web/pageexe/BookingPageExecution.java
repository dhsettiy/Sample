package com.web.pageexe;


import com.web.pagelocator.BookingPageLocator;
import com.web.pom.BaseClass;
import com.web.testng.PropertiesFileRead;

public class BookingPageExecution extends RadioButtonExecution{
public static void firstName() {
	BaseClass.get_textData(new BookingPageLocator().getFirstName(), PropertiesFileRead.excel_Read(8, 0));
}
public static void lastName() {
	BaseClass.get_textData(new BookingPageLocator().getLastName(), PropertiesFileRead.excel_Read(9, 0));
}
public static void address() {
	BaseClass.get_textData(new BookingPageLocator().getAddress(), PropertiesFileRead.excel_Read(10, 0));
}
public static void cardNum() {
	BaseClass.get_textData(new BookingPageLocator().getCc_num(), PropertiesFileRead.excel_Read(11, 0));
}
public static void cardtype() {
	BaseClass.get_textData(new BookingPageLocator().getCc_type(), PropertiesFileRead.excel_Read(12, 0));
}
public static void expireMonth() {
	BaseClass.get_textData(new BookingPageLocator().getCc_exp_month(), PropertiesFileRead.excel_Read(13, 0));
}
public static void expireyear() {
	BaseClass.get_textData(new BookingPageLocator().getCc_exp_year(), PropertiesFileRead.excel_Read(14, 0));
}
public static void cvv() {
	BaseClass.get_textData(new BookingPageLocator().getCc_cvv(), PropertiesFileRead.excel_Read(15, 0));
}
public static void bookNow() {
	BaseClass.click(new BookingPageLocator().getBook_now());
}
}
