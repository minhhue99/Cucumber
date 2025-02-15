package com.cucumberFramework.stepdefinitions;

import static org.testng.Assert.assertTrue;

import com.cucumberFramework.pageObjects.CheckPage;
import com.cucumberFramework.testBase.TestBase;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class CheckStepdefinition extends TestBase {
	
	CheckPage checkPage = new CheckPage (driver);
		
	@When("^I click on Search icon and enter Booking number \"([^\"]*)\"$")
	public void I_click_on_search_icon_and_enter_booking_number (String bookingnumber) throws Throwable {
		checkPage.searchIcon.click();
		checkPage.enterBookingnumber(bookingnumber);
	}
	
	@And("^Click on Search button$")
	public void click_on_search_button () throws Throwable {
		checkPage.clickonSearchsubmit();
	} 
	
	@Then("^I see the displayed booking number as \"([^\"]*)\"$")
	public void verify_the_booking_number_as (String expectedbookingnumber) throws Throwable {
		checkPage.verifybookingnumber(expectedbookingnumber);
	}
	
	@Then("^I see the displayed message as \"([^\"]*)\"$")
	public void verify_the_displayed_message_as (String expectedmsg) throws Throwable {
		assertTrue(checkPage.errorsearchmsg.getText().contains(expectedmsg));
	}	

}
