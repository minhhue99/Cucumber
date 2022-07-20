package com.cucumberFramework.stepdefinitions;

import com.cucumberFramework.helper.WaitHelper;
import com.cucumberFramework.pageObjects.BookingPage;
import com.cucumberFramework.pageObjects.PaymentPage;
import com.cucumberFramework.pageObjects.SearchPage;
import com.cucumberFramework.pageObjects.LoginPage;
import com.cucumberFramework.testBase.TestBase;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class SearchBookingPaymentStepdefinition  extends TestBase {
	
	SearchPage searchPage = new SearchPage (driver);
	BookingPage bookingPage = new BookingPage (driver);
	PaymentPage paymentPage = new PaymentPage (driver);
	LoginPage loginPage = new LoginPage (driver);
	WaitHelper waitHelper = new WaitHelper(driver);
	
	@Given("^Login with customer account$")
	public void login_with_customer_account () throws Throwable {
		loginPage.loginwithcustomeraccount();
	}
	
	@When("^Enter check-in date \"([^\"]*)\"$")
	public void enter_checkin_date (String checkin) throws Throwable {
		searchPage.checkinField.sendKeys(checkin);
	}
	
	@And("^Enter check-out date \"([^\"]*)\"$")
	public void enter_checkout_date (String checkout) throws Throwable {
		searchPage.checkoutField.sendKeys(checkout);
	}
	
	@And("^Enter number of adult$")
	public void enter_number_of_adult () throws Throwable {
		searchPage.enterNumberofAdult();
	}
	
	@And("^Enter number of children$")
	public void enter_number_of_children () throws Throwable {
		searchPage.enterNumberofChildren();
	}
	
	@When("^I click on the Search button$")
	public void I_click_on_the_search_button () throws Throwable {
		searchPage.clickonSearch();
	}
	
	@When("^Click on View Details button$")
	public void click_on_view_details_button () throws Throwable {
		bookingPage.clickonViewdetails();
	}
	
	@When("^Click on Book Now button$")
	public void click_on_book_now_button () throws Throwable {
		bookingPage.clickonBooknow();
	}
	
	@When("^Enter Fullname \"([^\"]*)\"$")
	public void enter_fullname (String fullname) throws Throwable {
		bookingPage.enterFullname(fullname);
	}
	
	@And("^Enter Email \"([^\"]*)\"$")
	public void enter_email (String email) throws Throwable {
		bookingPage.emailField.sendKeys(email);
	}
	
	@And("^Enter Phone \"([^\"]*)\"$")
	public void enter_phone (String phone) throws Throwable {
		bookingPage.phoneField.sendKeys(phone);
	}
	
	@And("^Enter Address \"([^\"]*)\"$")
	public void enter_address (String address) throws Throwable {
		bookingPage.addressField.sendKeys(address);
	}
	
	@When("^I tick Checkbox$")
	public void I_tick_checkbox () throws Throwable {
		bookingPage.checkbox.click();
	}
	
	@When("^I click on Submit$")
	public void I_click_on_submit () throws Throwable {
		bookingPage.submitButton.click();
	}
	
	@When("^Enter card number$")
	public void enter_card_number () throws Throwable {
		paymentPage.enterCardnumber();
	}
	
	@And("^Enter name on card$")
	public void enter_name_on_card () throws Throwable {
		paymentPage.enterNameoncard();
	}
	
	@And("^Enter expiry date$")
	public void enter_expiry_date () throws Throwable {
		paymentPage.enterExpirydate();
	}
	
	@And ("^Enter CVV number$")
	public void enter_cvv_number () throws Throwable {
		paymentPage.enterCVVnumber();
	}
	
	@When("^I click on Pay Now button$")
	public void I_click_on_pay_now_button() throws Throwable {
		paymentPage.clickonPaynow();
	}
	
	@Then ("^I see the success message \"([^\"]*)\"$")
	public void I_see_the_success_message (String message) {
		paymentPage.verifySuccessMsg(message);
	}
	
}