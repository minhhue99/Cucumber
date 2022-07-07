package com.cucumberFramework.stepdefinitions;

import com.cucumberFramework.helper.WaitHelper;
import com.cucumberFramework.pageObjects.DemoqaPage;
import com.cucumberFramework.testBase.TestBase;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import static org.testng.Assert.assertTrue;

public class DemoqaStepDefinitions extends TestBase {

	DemoqaPage demoqaPage = new DemoqaPage(driver);
	WaitHelper waitHelper = new WaitHelper(driver);

	@Given("^I am on the demoqa page \"([^\"]*)\"$")
	public void i_am_on_the_demoqa_page(String url) throws Throwable {
		driver.get(url);
	}

	@And("^navigate to the text box page$")
	public void navigate_to_the_text_box_page() throws Throwable {
		demoqaPage.clickTextBoxTab();
		waitHelper.WaitForElement(demoqaPage.fullname_txt, 10);

	}

	@When("^I enter fullname \"([^\"]*)\"$")
	public void i_enter_fullname(String fullname) throws Throwable {
		demoqaPage.enterfullName(fullname);

	}

	@And("^enter email \"([^\"]*)\"$")
	public void enter_email(String email) throws Throwable {
		demoqaPage.enterEmail(email);

	}

	@And("^enter current address \"([^\"]*)\"$")
	public void enter_current_address(String currentAddress) throws Throwable {
		demoqaPage.enterCurrentAddress(currentAddress);

	}

	@And("^enter permanent address \"([^\"]*)\"$")
	public void enter_permanent_address(String permanentAddress) throws Throwable {
		demoqaPage.enterPermanentAddress(permanentAddress);

	}

	@When("^I click on Submit button$")
	public void i_click_on_Submit_button() throws Throwable {
		demoqaPage.clickSubmit();
		waitHelper.WaitForElement(demoqaPage.output_Name, 10);
	}

	@Then("^I see the displayed outcomes with correct name \"([^\"]*)\" and email \"([^\"]*)\"$")
	public void i_see_the_displayd_outcomes(String input1, String input2) throws Throwable {
//		demoqaPage.output_Name.isDisplayed();
//		demoqaPage.output_email.isDisplayed();

		assertTrue(demoqaPage.output_Name.getText().contains(input1));
		assertTrue(demoqaPage.output_email.getText().contains(input2));

	}

	// ========= OUTLINE =====

	@When("^I enter fullname with outline(.+)$")
	public void i_enter_fullname_withoutline(String fullname) throws Throwable {
		demoqaPage.enterfullName(fullname);

	}

	@When("^enter email with outline (.+)$")
	public void enter_email_with_outline(String email) throws Throwable {
		demoqaPage.enterEmail(email);

	}

	@When("^enter current address with outline (.+)$")
	public void enter_current_address_with_outline(String arg1) throws Throwable {
		demoqaPage.enterCurrentAddress(arg1);

	}

	@Then("^I see the displayed outcomes with correct name with outline (.+) and email (.+)$")
	public void i_see_the_displayed_outcomes_with_correct_name_and_email(String arg1, String arg2) throws Throwable {

		assertTrue(demoqaPage.output_Name.getText().contains(arg1));
		assertTrue(demoqaPage.output_email.getText().contains(arg2));
	}

}
