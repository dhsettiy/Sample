package com.web.pageexe;

import com.web.pagelocator.RadioLocator;
import com.web.pom.BaseClass;

public class RadioButtonExecution extends SearchPageExecution{
public static void radioButton() {
	BaseClass.click(new RadioLocator().getRadioButton());
}
public static void test_Continue() {
	BaseClass.click(new RadioLocator().getContinuee());
}
}
