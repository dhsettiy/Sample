package com.app.stepdefinition;

import java.util.List;

import com.fasterxml.jackson.databind.deser.Deserializers.Base;
import com.web.pagelocator.EssepsRegistrationLocator;
import com.web.pom.BaseClass;
import com.web.testng.PropertiesFileRead;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class LoginPageEsspes extends EssepsRegistrationLocator {
	@Given("login to the application")
	public void login_to_the_application() {
		browserLaunch();
	    BaseClass.getURL("https://demoqa.com/automation-practice-form");
	}
	@When("Enter the values present in the form")
	public void enter_the_values_present_in_the_form(DataTable data) throws InterruptedException {
	    List<String> asList = data.asList();
	    BaseClass.userName(new EssepsRegistrationLocator().firstName(), asList.get(0));
	    BaseClass.userName(new EssepsRegistrationLocator().lastName(), asList.get(1));
	    BaseClass.scrollDown();
	    Thread.sleep(2000);
	    BaseClass.userName(new EssepsRegistrationLocator().email(), asList.get(2));
	    //BaseClass.click(female());
	    BaseClass.click(new EssepsRegistrationLocator().getRadio());
	    Thread.sleep(2000);
	    BaseClass.userName(new EssepsRegistrationLocator().mobileNumber(), asList.get(3));
	    Thread.sleep(2000);
	    BaseClass.userName(new EssepsRegistrationLocator().subject() , asList.get(4));
	    BaseClass.click(new EssepsRegistrationLocator().read());
	    BaseClass.userName(new EssepsRegistrationLocator().address(), asList.get(5));
	    BaseClass.scrollDown();
	    Thread.sleep(2000);
	    BaseClass.click(new EssepsRegistrationLocator().submit());
	}



}
