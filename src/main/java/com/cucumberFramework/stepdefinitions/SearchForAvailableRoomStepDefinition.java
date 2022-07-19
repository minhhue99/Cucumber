package com.cucumberFramework.stepdefinitions;

import com.cucumberFramework.pageObjects.BookingPage;
import com.cucumberFramework.pageObjects.LoginPage;
import com.cucumberFramework.pageObjects.SearchPage;
import com.cucumberFramework.testBase.TestBase;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class SearchForAvailableRoomStepDefinition extends TestBase {
	
	BookingPage bookingPage = new BookingPage (driver);
	SearchPage searchPage = new SearchPage (driver);
	LoginPage loginPage = new LoginPage (driver);
	
	@Given("^Login to Gwesty Page with customer account$")
	public void login_to_gwesty_page_with_customer_account () throws Throwable {
		loginPage.loginwithcustomeraccount();
	}
	
	@When("^I enter check-in date \"([^\"]*)\"$")
	public void I_enter_checkin_date (String checkin) throws Throwable {
		searchPage.enterCheckinDate(checkin);
	}
	
	@And("^I enter check-out date \"([^\"]*)\"$")
	public void I_enter_checkout_date (String checkout) throws Throwable {
		searchPage.enterCheckoutDate(checkout);
	}
	
	@And("^I enter number of adult$")
	public void I_enter_number_of_adult () throws Throwable {
		searchPage.enterNumberofAdult();
	}
	
	@And("I enter number of children$")
	public void enter_number_of_children () throws Throwable {
		searchPage.enterNumberofChildren();
	}
	
	@When("^I click on Search button$")
	public void I_click_on_search_button () throws Throwable {
		searchPage.clickonSearch();
	}
	
	@Then ("^I can see the displayed available rooms that meet the criteria$")
	public void I_can_see_the_displayed_available_rooms_that_meet_the_criteria () {
		bookingPage.verify_AdultNumber_ChildrenNumber();
	}
}
