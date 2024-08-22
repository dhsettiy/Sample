package com.web.testng;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import com.web.execution.PageExecution;

public class Sample3 extends PageExecution {
	@BeforeClass
	public static void beforeClass() {
		browserLaunch();
		getUrl();
	}

	@Test
	public void getLogic() {
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

	@AfterClass
	public static void postCondition() {
		getScreenShot();
	}
}
