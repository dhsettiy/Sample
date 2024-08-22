package com.web.pageexe;

import com.web.pagelocator.SearchLocator;
import com.web.pom.BaseClass;
import com.web.testng.PropertiesFileRead;

public class SearchPageExecution extends LoginPageExecution  {
public static void getlocation() {
	BaseClass.get_textData(new SearchLocator().getLocation(), PropertiesFileRead.excel_Read(0, 0));	
}
public static void getHotel() {
	BaseClass.get_textData(new SearchLocator().getHotels(), PropertiesFileRead.excel_Read(1, 0));
}
public static void getRoom() {
	BaseClass.get_textData(new SearchLocator().getRoom_type(), PropertiesFileRead.excel_Read(2, 0));
}
public static void getRoomNo() {
	BaseClass.get_textData(new SearchLocator().getRoom_nos(), PropertiesFileRead.excel_Read(3, 0));
}
public static void getCheckIn() {
	BaseClass.get_textData(new SearchLocator().getDatepick_in(), PropertiesFileRead.excel_Read(4, 0));
}
public static void getCheckOut() {
	BaseClass.get_textData(new SearchLocator().getDatepick_out(), PropertiesFileRead.excel_Read(5, 0));
}
public static void getRoomAdult() {
	BaseClass.get_textData(new SearchLocator().getAdult_room(), PropertiesFileRead.excel_Read(6, 0));
}
public static void getRoomChild() {
	BaseClass.get_textData(new SearchLocator().getChild_room(), PropertiesFileRead.excel_Read(7, 0));
}
public static void search() {
	BaseClass.click(new SearchLocator().getSubmit());
}
}
