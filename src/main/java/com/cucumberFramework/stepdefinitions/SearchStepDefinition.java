package com.cucumberFramework.stepdefinitions;


import com.cucumberFramework.helper.WaitHelper;
import com.cucumberFramework.pageObjects.SearchPage;
import com.cucumberFramework.testBase.TestBase;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import static org.testng.Assert.assertTrue;
import org.openqa.selenium.JavascriptExecutor;

public class SearchStepDefinition extends TestBase {
	
	SearchPage searchPage = new SearchPage (driver);
	WaitHelper waitHelper = new WaitHelper(driver);
	
//	@Given("^I am on the page$")
//	public void i_am_on_the_page() throws Throwable {
//		driver.get(Constants.pageurl);
//	}
	
	@When("^Enter check-in date \"([^\"]*)\"$")
	public void enter_checkin_date (String checkin) throws Throwable {
		searchPage.enterCheckinDate(checkin);
		Thread.sleep(2000);
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
	public void click_on_view_detail_button () throws Throwable {
		searchPage.clickonViewdetails();
	}
	
	@When("^Click on Book Now button$")
	public void click_on_book_now_button () throws Throwable {
		searchPage.clickonBooknow();
	}
	
	@When("^Enter Fullname \"([^\"]*)\"$")
	public void enter_fullname (String fullname) throws Throwable {
		searchPage.enterFullname(fullname);
	}
	
	@And("^Enter Email \"([^\"]*)\"$")
	public void enter_email (String email) throws Throwable {
		searchPage.enterEmail(email);
	}
	
	@And("^Enter Phone \"([^\"]*)\"$")
	public void enter_phone (String phone) throws Throwable {
		searchPage.enterPhone(phone);
	}
	
	@And("^Enter Address \"([^\"]*)\"$")
	public void enter_address (String address) throws Throwable {
		searchPage.enterAddress(address);
	}
	
	@When("^I tick Checkbox$")
	public void I_tick_checkbox () throws Throwable {
		searchPage.tickCheckbox();
	}
	
	@When("^I click on Submit$")
	public void I_click_on_submit () throws Throwable {
		searchPage.clickonSubmit();
	}
	
	
	
	
	
	
	
	
	

}
