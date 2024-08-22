package com.web.pageexe;

import com.web.pagelocator.EssepsRegistrationLocator;
import com.web.pom.BaseClass;
import com.web.testng.PropertiesFileRead;

public class EssepsRegistrationExecution extends EssepsRegistrationLocator {
	public static void getUrl() {
		BaseClass.getURL(PropertiesFileRead.prop_read("EssepsUrl"));
	}
	
}
