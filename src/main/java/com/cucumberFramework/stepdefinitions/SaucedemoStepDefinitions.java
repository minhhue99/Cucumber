package com.cucumberFramework.stepdefinitions;

import com.cucumberFramework.helper.WaitHelper;
import com.cucumberFramework.pageObjects.SaucedemoPage;
import com.cucumberFramework.testBase.TestBase;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import static org.testng.Assert.assertTrue;
import org.openqa.selenium.JavascriptExecutor;

public class SaucedemoStepDefinitions extends TestBase {

	SaucedemoPage saucedemoPage = new SaucedemoPage(driver);
	WaitHelper waitHelper = new WaitHelper(driver);

	String a;
	String b;

	@Given("^I am on the Saucedemo page \"([^\"]*)\"$")
	public void i_am_on_the_Saucedemo_page(String url) throws Throwable {
		driver.get(url);
	}

	@Then("^Verify the page title as \"([^\"]*)\"$")
	public void verify_the_title(String expectedpagetitle) throws Throwable {
		String actualtitle = driver.getTitle();
		assertTrue(actualtitle.contains(expectedpagetitle));
	}

	@When("^Enter username \"([^\"]*)\"$")
	public void login_with_username(String username) throws Throwable {
		saucedemoPage.enterUsename(username);
		Thread.sleep(2000);

	}

	@And("^Enter password \"([^\"]*)\"$")
	public void login_with_password(String password) throws Throwable {
		saucedemoPage.enterPassword(password);
		Thread.sleep(2000);

	}

	@And("^Click on login button$")
	public void click_on_login_button() throws Throwable {
		saucedemoPage.loginbtnEle.click();
	}

	@Then("^Verify default filter dropdown as A-Z$")
	public void verify_default_filter_dropdown() throws Throwable {
		waitHelper.WaitForElement(saucedemoPage.default_filterdropdownEle, 10);
		String actualdefault = saucedemoPage.default_filterdropdownEle.getText();
		assertTrue(actualdefault.contains("NAME (A TO Z)"));
		Thread.sleep(2000);
	}

	@When("^Change filter dropdown for From Low to High$")
	public void change_filter_dropdown_for_from_low_to_high() throws Throwable {
		saucedemoPage.selectLowtoHigh();
		Thread.sleep(2000);
	}

	@When("^Add the first product to the cart$")
	public void add_the_first_product_to_the_cart() throws Throwable {
		saucedemoPage.addFirstproduct();
		Thread.sleep(2000);
	}

	@Then("^Verify the cart badge has 1 product$")
	public void Verify_the_cart_badge_has_1_product() throws Throwable {
		String actualnumberString1 = saucedemoPage.shoppingcartbadgeEle.getText();
		int actualnumber1 = Integer.parseInt(actualnumberString1);
		assertTrue(actualnumber1 == 1);
		Thread.sleep(2000);
	}

	@When("^Add the last product to the cart$")
	public void add_the_last_product_to_the_cart() throws Throwable {
		saucedemoPage.addLastproduct();
		a = saucedemoPage.expected_ItemNameEle.getText();
		b = saucedemoPage.expected_ItemPriceEle.getText();
		Thread.sleep(2000);
	}

	@Then("^Verify the cart badge value is increased to 2$")
	public void Verify_the_cart_badge_value_is_increased_to_2() throws Throwable {

		JavascriptExecutor jss = (JavascriptExecutor) driver;
		jss.executeScript("arguments[0].scrollIntoView(true);", saucedemoPage.shoppingcartbadgeEle);

		String actualnumberString2 = saucedemoPage.shoppingcartbadgeEle.getText();
		int actualnumber2 = Integer.parseInt(actualnumberString2);
		assertTrue(actualnumber2 == 2);
		Thread.sleep(3000);
	}

	@When("^Remove the first product from the cart$")
	public void remove_the_first_product_from_the_cart() throws Throwable {
		saucedemoPage.removeFirstproduct();
		Thread.sleep(2000);
	}

	@Then("^Verify the cart badge value is decreased to 1$")
	public void Verify_the_cart_badge_value_is_decreased_to_1() throws Throwable {

		JavascriptExecutor jss = (JavascriptExecutor) driver;
		jss.executeScript("arguments[0].scrollIntoView(true);", saucedemoPage.shoppingcartbadgeEle);

		String actualnumberString3 = saucedemoPage.shoppingcartbadgeEle.getText();
		int actualnumber3 = Integer.parseInt(actualnumberString3);
		assertTrue(actualnumber3 == 1);
		Thread.sleep(2000);
	}

	@When("^Click on the cart$")
	public void click_on_the_cart() throws Throwable {
		saucedemoPage.clickontheCart();

	}

	@Then("^Verify the added product is available$")
	public void Verify_the_added_product_is_available() throws Throwable {
		String actual_itemname = saucedemoPage.actual_ItemNameEle.getText();
		String actual_itemprice = saucedemoPage.actual_ItemPriceEle.getText();
		assertTrue(actual_itemname.equals(a));
		assertTrue(actual_itemprice.equals(b));
		Thread.sleep(5000);

	}
}
