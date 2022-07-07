package com.cucumberFramework.stepdefinitions;

import com.cucumberFramework.helper.WaitHelper;
import com.cucumberFramework.pageObjects.TestPages;
import com.cucumberFramework.testBase.TestBase;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import static org.testng.Assert.assertTrue;


public class TestpagesStepDefinitions extends TestBase {
	
	TestPages huePage = new TestPages(driver);
	WaitHelper waitHelper = new WaitHelper(driver);
	
	@Given("^I am on the testpage \"([^\"]*)\"$")
	public void i_am_on_the_hue_page(String url) throws Throwable {
		driver.get(url);	     
	}
	
	@Then ("^Verify page title as \"([^\"]*)\"$")
	public void verify_pagetitle(String expectedpagetitle)throws Throwable {
		String actualtitle = driver.getTitle();	
		assertTrue(actualtitle.contains(expectedpagetitle));
	}

	@When("^I enter username \"([^\"]*)\"$")
	public void i_enter_username(String username) throws Throwable {
		huePage.enterUsename(username);
	     
	}

	@And("^enter password \"([^\"]*)\"$")
	public void enter_password(String password) throws Throwable {
		huePage.enterPassword(password);
	    
	}

	@And("^enter comment \"([^\"]*)\"$")
	public void enter_comment(String comment) throws Throwable {
		huePage.enterComment(comment);
	    
	}

	@When("^select only checkbox 2$")
	public void select_only_checkbox2() throws Throwable {
		huePage.select_onlycheckbox2();
	     
	}
	
	@When("^select radio button 1$")
	public void select_radiobuttion1() throws Throwable {
		huePage.select_radiobtn1();
	     
	}
	
	@When("^select Multiple Select Values as Item 1 and Item 2$")
	public void select_1and2() throws Throwable {
		huePage.select1and2();
	     
	}
	
	@When("^select Drop down item 5$")
	public void select_dropdown5() throws Throwable {
		huePage.dropdown();
	     
	}

	@When("^click on Submit button$")
	public void click_on_Submit_button() throws Throwable {
		huePage.clickSubmit();
		waitHelper.WaitForElement(huePage.outputusername, 10); 
	}

	@Then("^I see the displayed outcomes with correct username \"([^\"]*)\" and password \"([^\"]*)\"$")
	public void i_see_the_displayd_outcomes(String input1, String input2 ) throws Throwable {		     
		huePage.outputusername.isDisplayed();
		huePage.outputpassword.isDisplayed();
		
		assertTrue(huePage.outputusername.getText().contains(input1));
		assertTrue(huePage.outputpassword.getText().contains(input2));
		
	}
	
	// ========= OUTLINE =====
	
		@When("^I enter username with outline (.+)$")
		public void i_enter_username_with_outline(String username) throws Throwable {
			huePage.enterUsename(username);
		     
		}
		@When("^enter password with outline (.+)$")
		public void enter_email_with_outline(String password) throws Throwable {
			huePage.enterPassword(password);
		}
				
		@Then("^I can see the displayed outcomes with correct username (.+) and password (.+)$")
		public void i_can_see_the_displayed_outcomes_with_correct_username_and_password_outline(String value1, String value2) throws Throwable {
		    
			assertTrue(huePage.outputusername.getText().contains(value1));
			assertTrue(huePage.outputpassword.getText().contains(value2));
		}
		
		
	
}
	
	
	


