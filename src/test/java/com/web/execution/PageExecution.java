package com.web.execution;

import com.web.pageexe.BookingPageExecution;
import com.web.pageexe.LoginPageExecution;
import com.web.pageexe.RadioButtonExecution;
import com.web.pageexe.SearchPageExecution;

public class PageExecution extends BookingPageExecution{
public static void main(String[] args) {
	browserLaunch();
	getUrl();
	userName();
	PassWord();
	click();
	getlocation();
	getHotel();
	getRoom();
	getRoomNo();
	getCheckIn();
	getCheckOut();
	getRoomAdult();
	getRoomChild();
	search();
	radioButton();
	test_Continue();
	firstName();
	lastName();
	address();
	cardNum();
	cardtype();
	expireMonth();
	expireyear();
    cvv();
    bookNow();
}
}
