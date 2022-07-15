package com.cucumberFramework.stepdefinitions;

import static org.testng.Assert.assertTrue;

import java.util.List;

import org.openqa.selenium.WebElement;

import com.cucumberFramework.pageObjects.CancelPage;
import com.cucumberFramework.testBase.TestBase;
import com.cucumberFramework.pageObjects.LoginPage;


import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import static org.testng.Assert.assertEquals;

public class CancelStepdefinition extends TestBase {

	CancelPage cancelPage = new CancelPage (driver);
	LoginPage loginPage = new LoginPage (driver);
	
	int a;
	int b;
	
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
	public void I_click_on_cancel_button () throws Throwable {
		List<WebElement> cancelCountbefore = cancelPage.cancelButtonList;
		a = cancelCountbefore.size();
		cancelPage.clickonCancelbooking();
	}
	
	@When("^I select the reason$")
	public void I_select_the_reason () throws Throwable {
		cancelPage.selectrandomReason();
	}
	
	@And("^Click on Cancel Submit button$")
	public void I_click_on_cancel_submit_button () throws Throwable {
		cancelPage.cancelsubmitButton.click();
		Thread.sleep(5000);
		List<WebElement> cancelCountafter = cancelPage.cancelButtonList;
		b = cancelCountafter.size();
	}
	
	@And("^Verify the number of canceled booking is decreased by 1$")
	public void verify_the_number_of_canceledbooking () throws Throwable {
		assertEquals(b,a-1);
	}
	
	
	
	
}
