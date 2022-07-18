package com.cucumberFramework.stepdefinitions;

import com.cucumberFramework.testBase.TestBase;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import cucumber.api.java.en.Then;

import com.cucumberFramework.pageObjects.LoginPage;
import com.cucumberFramework.pageObjects.SetupRoomsPage;

public class SetupRoomsStepDefinition extends TestBase {
	
	LoginPage loginPage = new LoginPage (driver);
	SetupRoomsPage setuproomsPage = new SetupRoomsPage (driver);
	
	@Given("Login with admin account$")
	public void login_with_customer_account () throws Throwable {
		loginPage.loginwithadminaccount();
	}
	
	@When("^Click on Angel Down$")
	public void I_click_on_angle_down () throws Throwable {
		setuproomsPage.angledownicon.click();
	}
	
	@And("^Click on Go to Admin$")
	public void Click_on_go_to_admin () throws Throwable {
		setuproomsPage.gotoadminbtn.click();
	}
	
	@And("^Click on Room Types$")
	public void click_on_room_types () throws Throwable {
		setuproomsPage.roomtypebtn.click();
	}
	
	@And("^Click on Add Room Type$")
	public void click_on_add_room_type () throws Throwable {
		setuproomsPage.clickonaddRoomType();
	}
	
	@When("^I enter title \"([^\"]*)\"$")
	public void I_enter_title (String title) throws Throwable {
		setuproomsPage.titleField.sendKeys(title);
	}
	
	@And ("^Enter price \"([^\"]*)\"$")
	public void enter_price(String input) throws Throwable {
		setuproomsPage.priceField.sendKeys(input);
	}
	
	@When("^I select number of adult$")
	public void I_select_number_of_adult () throws Throwable {
		setuproomsPage.selectrandomAdult();
	}
	
	@When("^I select number of children$")
	public void I_select_number_of_children () throws Throwable {
		setuproomsPage.selectrandomChildren();
	}
	
	@When("^I enter description \"([^\"]*)\"$")
	public void I_enter_description (String input) throws Throwable {
		setuproomsPage.descriptionField.sendKeys(input);
	}
	
	@When("^I click on Submit button$")
	public void I_click_on_submit () throws Throwable {
		setuproomsPage.submitaddroombtn.click();
	}
	
	@When("^I enter title room to Search Box \"([^\"]*)\"$")
	public void I_enter_title_room_to_search_box (String input) throws Throwable {
		setuproomsPage.entertitleroomtosearch(input);
	}
	
	@Then("^Verify the new added room type as title \"([^\"]*)\"$") 
	public void Verify_the_new_added_room_type (String expectedtitle) throws Throwable {
		setuproomsPage.verifynewaddedroom(expectedtitle);
	}
	
	
	

}
