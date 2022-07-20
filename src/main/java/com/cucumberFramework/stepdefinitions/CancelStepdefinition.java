package com.cucumberFramework.stepdefinitions;

import java.util.List;

import org.openqa.selenium.WebElement;

import com.cucumberFramework.pageObjects.CancelPage;
import com.cucumberFramework.testBase.TestBase;
import com.cucumberFramework.pageObjects.LoginPage;


import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;

import static org.testng.Assert.assertEquals;

public class CancelStepdefinition extends TestBase {

	CancelPage cancelPage = new CancelPage (driver);
	LoginPage loginPage = new LoginPage (driver);
	
	int numberofcanceledbookingBefore;
	int numberofcanceledbookingAfter;
	
	@Given("^I login with customer account$")
	public void I_login_with_customer_account () throws Throwable {
		loginPage.loginwithcustomeraccount();
	}
	
	@When("^I click on Angel Down on the top right of the screen$")
	public void I_click_on_angle_down_on_the_top_right_of_the_screen () throws Throwable {
		cancelPage.angledown.click();
	}
	
	@And("^Click on My Bookings button$")
	public void I_click_on_my_booking_button () throws Throwable {
		cancelPage.mybookingsEle.click();
	}
	
	@And("^Click on Cancel button$")
	public void click_on_cancel_button () throws Throwable {
		List<WebElement> cancelCountbefore = cancelPage.cancelButtonList;
		numberofcanceledbookingBefore = cancelCountbefore.size();
		cancelPage.clickonCancelbooking();
	}
	
	@And("^Select the reason$")
	public void select_the_reason () throws Throwable {
		cancelPage.selectrandomReason();
	}
	
	@And("^Click on Cancel button to submit$")
	public void click_on_cancel_button_to_submit () throws Throwable {
		cancelPage.cancelsubmitButton.click();
		Thread.sleep(5000);
		List<WebElement> cancelCountafter = cancelPage.cancelButtonList;
		numberofcanceledbookingAfter = cancelCountafter.size();
	}
	
	@And("^I see that the number of canceled booking is decreased by 1$")
	public void I_see_that_the_number_of_canceled_booking_is_decreased_by_1 () throws Throwable {
		assertEquals(numberofcanceledbookingAfter,numberofcanceledbookingBefore - 1);
	}	
}
