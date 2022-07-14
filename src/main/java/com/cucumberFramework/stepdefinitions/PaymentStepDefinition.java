package com.cucumberFramework.stepdefinitions;

import com.cucumberFramework.helper.WaitHelper;
import com.cucumberFramework.pageObjects.PaymentPage;
import com.cucumberFramework.pageObjects.SearchPage;
import com.cucumberFramework.testBase.TestBase;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import static org.testng.Assert.assertTrue;
import org.openqa.selenium.JavascriptExecutor;

public class PaymentStepDefinition extends TestBase {
	
	PaymentPage paymentPage = new PaymentPage (driver);
	
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
