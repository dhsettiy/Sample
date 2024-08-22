package com.app.stepdefinition;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.web.pageexe.BookingPageExecution;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginPage extends BookingPageExecution{
		@Given("Open adactinHotel Browser")
	public void open_adactin_hotel_browser() {
		browserLaunch();
		getUrl();
		
	}
	@When("enter userName")
	public void enter_user_name() {
		System.out.println("userName");
		userName();
		
	}
	@When("enter passWord")
	public void enter_pass_word() {
		System.out.println("passWord");
		PassWord();
		
	}
	@When("click loginButton")
	public void click_login_button() {
		System.out.println("login");
		click();
	}
	@When("Select Location")
	public void select_location() {
		getlocation();
	}
	@When("Select Hotel Name")
	public void select_hotel_name() {
		getHotel();
		
	}
	@When("select room type")
	public void select_room_type() {
		getRoom();
		
	}
	@When("update number of rooms requires")
	public void update_number_of_rooms_requires() {
		getRoomNo();
		
	}
	@When("update check-in date")
	public void update_check_in_date() {
		getCheckIn();
		
	}
	@When("update check-out date")
	public void update_check_out_date() {
		getCheckOut();
		
	}
	@When("update adults per rooms")
	public void update_adults_per_rooms() {
		getRoomAdult();
		
	}
	@When("update child per rooms")
	public void update_child_per_rooms() {
		getRoomChild();
	}
	@When("click search button")
	public void click_search_button() {
		search();
	}
	@When("select the radio button option")
	public void select_the_radio_button_option() {
		radioButton();
		
	}
	@When("click continue")
	public void click_continue() {
		test_Continue();
		
	}
	@When("enter your firstName")
	public void enter_your_first_name() {
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
	@When("enter your lastName")
	public void enter_your_last_name() {
		lastName();
		
	}
	@When("enter your billing address")
	public void enter_your_billing_address() {
		address();
		
	}
	@When("enter your credit card details")
	public void enter_your_credit_card_details() {
		cardNum();
		
	}
	@When("select credit card type")
	public void select_credit_card_type() {
		cardtype();
		
	}
	@When("select Expiry date of credit card")
	public void select_expiry_date_of_credit_card() {
		expireMonth();
		expireyear();
		
	}
	@When("enter cvv number")
	public void enter_cvv_number() {
		 cvv();
	}
	@When("click bookNow button")
	public void click_book_now_button() {
		    bookNow();
	}


	@Then("validate homePage")
	public void validate_home_page() throws InterruptedException {
		Thread.sleep(5000);
		getScreenShot();
	}
}