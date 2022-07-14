package com.cucumberFramework.stepdefinitions;

import com.cucumberFramework.helper.WaitHelper;
import com.cucumberFramework.pageObjects.LoginPage;
import com.cucumberFramework.testBase.TestBase;
import com.cucumberFramework.helper.Constants;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import static org.testng.Assert.assertTrue;


public class LoginStepdefinition extends TestBase {

	LoginPage loginPage = new LoginPage(driver);
	WaitHelper waitHelper = new WaitHelper(driver);


//	@Given("^I am on the Gwesty page$")
//	public void i_am_on_the_page() throws Throwable {
//		driver.get(Constants.pageurl);
//	}
		
	@When("^Click on Login tab$")
	public void click_on_login_tab () throws Throwable {
		loginPage.loginTab.click();
	}
	
	@When("^I enter username with outline (.+)$")
	public void i_enter_username_with_outline(String username) throws Throwable {
		loginPage.enterUsername(username);
	}
	
	@When("^Enter username \"([^\"]*)\"$")
	public void login_with_username(String username) throws Throwable {
		loginPage.enterUsername(username);
	}	
	
	@And ("^I enter password with outline (.+)$")
	public void i_enter_password_with_outline(String password) throws Throwable {
		loginPage.enterPassword(password);
	}
	
	@And ("^Enter password \"([^\"]*)\"$")
	public void enter_password(String password) throws Throwable {
		loginPage.enterPassword(password);
	}	
	
	@When("^Click on Sign in button$")
	public void click_on_sign_in_button () throws Throwable {
		loginPage.clickonSignin();
	}
	
	@Then("^I see the displayed account name with correct name (.+)$")
	public void I_see_the_displayed_account_name_with_correct_name (String name) throws Throwable {
		assertTrue(loginPage.profile.getText().contains(name));
	}
	
	@Then ("^I see the error message \"([^\"]*)\"$")
	public void I_see_the_error_message (String message) {
		assertTrue(loginPage.loginerror.getText().contains(message));
	}
	
	
	
}


