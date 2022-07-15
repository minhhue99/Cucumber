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

import static org.testng.Assert.assertTrue;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

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
		searchPage.enterCheckinDate(checkin);
	}
	
	@And("^Enter check-out date \"([^\"]*)\"$")
	public void enter_checkout_date (String checkout) throws Throwable {
		searchPage.enterCheckoutDate(checkout);
	}
	
	@And("^Enter number of adult \"([^\"]*)\"$")
	public void enter_number_of_adult (String adult) throws Throwable {
		searchPage.enterNumberofAdult(adult);
	}
	
	@And("^Enter number of children \"([^\"]*)\"$")
	public void enter_number_of_children (String children) throws Throwable {
		searchPage.enterNumberofChildren(children);
	}
	
	@When("^Click on Search button$")
	public void click_on_search_button () throws Throwable {
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
		bookingPage.enterEmail(email);
	}
	
	@And("^Enter Phone \"([^\"]*)\"$")
	public void enter_phone (String phone) throws Throwable {
		bookingPage.enterPhone(phone);
	}
	
	@And("^Enter Address \"([^\"]*)\"$")
	public void enter_address (String address) throws Throwable {
		bookingPage.enterAddress(address);
	}
	
	@When("^I tick Checkbox$")
	public void I_tick_checkbox () throws Throwable {
		bookingPage.tickCheckbox();
	}
	
	@When("^I click on Submit$")
	public void I_click_on_submit () throws Throwable {
		bookingPage.clickonSubmit();
	}
	
	@When("^Enter card number \"([^\"]*)\"$")
	public void enter_card_number (String cardnumber) throws Throwable {
		paymentPage.enterCardnumber(cardnumber);
	}
	
	@And("^Enter name on card \"([^\"]*)\"$")
	public void enter_name_on_card (String nameoncard) throws Throwable {
		paymentPage.enterNameoncard(nameoncard);
	}
	
	@And("^Enter expiry date \"([^\"]*)\"$")
	public void enter_expiry_date (String expirydate) throws Throwable {
		paymentPage.enterExpirydate(expirydate);
	}
	
	@And ("^Enter CVV number \"([^\"]*)\"$")
	public void enter_cvv_number (String number) throws Throwable {
		paymentPage.enterCVVnumber(number);
	}
	
	@When("^I click on Pay Now button$")
	public void I_click_on_pay_now_button() throws Throwable {
		paymentPage.clickonPaynow();
	}
}